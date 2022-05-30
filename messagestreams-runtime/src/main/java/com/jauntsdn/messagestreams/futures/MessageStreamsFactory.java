package com.jauntsdn.messagestreams.futures;

import com.jauntsdn.rsocket.Disposable;
import com.jauntsdn.rsocket.MessageStreams;
import com.jauntsdn.rsocket.ServerStreamsAcceptor;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public interface MessageStreamsFactory {
  Server server(String name, String address);

  CompletionStage<MessageStreams> client(String name, String address);

  interface Server {

    CompletionStage<Disposable> start(ServerStreamsAcceptor serverAcceptor);
  }

  static <T> CompletableFuture<T> completed(Throwable t) {
    CompletableFuture<T> f = new CompletableFuture<>();
    f.completeExceptionally(t);
    return f;
  }

  static InetSocketAddress inetSocketAddress(String address) {
    String[] hostPort = address.split(":");
    return new InetSocketAddress(hostPort[0], Integer.parseInt(hostPort[1]));
  }
}
