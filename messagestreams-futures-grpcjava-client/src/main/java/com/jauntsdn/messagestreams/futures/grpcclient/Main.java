package com.jauntsdn.messagestreams.futures.grpcclient;

import futures.DinerGrpc;
import futures.Meal;
import futures.Order;
import io.grpc.Codec;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.net.InetSocketAddress;
import java.util.concurrent.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws Exception {
    String kitchenHost = System.getProperty("SERVICE_HOST", "localhost");
    int kitchenPort = Integer.parseInt(System.getProperty("SERVICE_PORT", "7782"));
    logger.info("==> FUTURES SERVICE: grpc-java client {}:{}", kitchenHost, kitchenPort);

    CompressorRegistry compressorRegistry = CompressorRegistry.newEmptyInstance();
    compressorRegistry.register(Codec.Identity.NONE);
    DecompressorRegistry decompressorRegistry =
        DecompressorRegistry.emptyInstance().with(Codec.Identity.NONE, true);

    ManagedChannel channel =
        NettyChannelBuilder.forAddress(new InetSocketAddress(kitchenHost, kitchenPort))
            .compressorRegistry(compressorRegistry)
            .decompressorRegistry(decompressorRegistry)
            .usePlaintext()
            .flowControlWindow(100_000)
            .build();

    DinerGrpc.DinerStub diner = DinerGrpc.newStub(channel);
    String borsch = "borsch";
    int count = 2;
    Order order = Order.newBuilder().setMeal(borsch).setCount(count).build();

    logger.info("Ordering meal: {}, {} portions", borsch, count);
    diner.order(
        order,
        new StreamObserver<>() {

          @Override
          public void onNext(Meal meal) {
            String mealName = meal.getMeal();
            int count = meal.getCount();
            float price = meal.getPrice();
            long paymentCode = meal.getPaymentCode();
            logger.info(
                "Got meal: {}, {} portions for {} $, payment code: {}",
                mealName,
                count,
                price,
                paymentCode);
          }

          @Override
          public void onError(Throwable t) {
            logger.error("Diner order terminated with error", t);
            channel.shutdownNow();
          }

          @Override
          public void onCompleted() {
            logger.info("Diner order completed");
            channel.shutdownNow();
          }
        });

    channel.awaitTermination(365, TimeUnit.DAYS);
  }
}
