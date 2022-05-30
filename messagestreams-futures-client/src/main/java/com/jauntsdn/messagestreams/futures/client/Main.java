package com.jauntsdn.messagestreams.futures.client;

import com.jauntsdn.messagestreams.futures.MessageStreamsFactory;
import com.jauntsdn.rsocket.MessageStreams;
import futures.Diner;
import futures.DinerClient;
import futures.Order;
import futures.Payment;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  @SuppressWarnings("Convert2MethodRef")
  public static void main(MessageStreamsFactory messageStreamsFactory) {
    String transportAddress = System.getProperty("SERVICE_ADDRESS", "tcp://localhost:7780");
    logger.info("==> FUTURES SERVICE: address {}", transportAddress);

    CompletionStage<Diner> singleDiner =
        messageStreamsFactory
            .client("FUTURES", transportAddress)
            .whenComplete(clientStartListener())
            .thenApply(messageStreams -> DinerClient.create(messageStreams));

    singleDiner
        .thenCompose(
            diner -> {
              String borsch = "borsch";
              int count = 2;
              logger.info("Ordering meal: {}, {} portions", borsch, count);
              return diner
                  .order(Order.newBuilder().setMeal(borsch).setCount(count).build())
                  .thenCompose(
                      meal -> {
                        String mealName = meal.getMeal();
                        int mealCount = meal.getCount();
                        float price = meal.getPrice();
                        long paymentCode = meal.getPaymentCode();
                        logger.info(
                            "Got meal: {}, {} portions for {} $", mealName, mealCount, price);

                        return diner
                            .pay(Payment.newBuilder().setAmount(price).setCode(paymentCode).build())
                            .whenComplete(
                                (ignore, err) -> {
                                  if (err == null) {
                                    logger.info("Paid for meal with code: {}", paymentCode);
                                  }
                                });
                      });
            })
        .toCompletableFuture()
        .orTimeout(5, TimeUnit.SECONDS)
        .join();
  }

  private static BiConsumer<MessageStreams, Throwable> clientStartListener() {
    return (ignored, err) -> {
      if (err != null) {
        logger.info(
            "==> FUTURES SERVICE CONNECTION ERROR: {}:{}", err.getClass(), err.getMessage());
      } else {
        String startMillisProperty = System.getProperty("START_MILLIS", "");
        long startMillis = startMillisProperty.isEmpty() ? 0 : Long.parseLong(startMillisProperty);
        if (startMillis > 0) {
          logger.info(
              "==> FUTURES SERVICE CONNECTED SUCCESSFULLY. START TIME, MILLIS: {}",
              System.currentTimeMillis() - startMillis);
        } else {
          logger.info("==> FUTURES SERVICE CONNECTED SUCCESSFULLY");
        }
      }
    };
  }
}
