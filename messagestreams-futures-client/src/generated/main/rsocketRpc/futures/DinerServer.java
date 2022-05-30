package futures;

@javax.annotation.Generated(
    value = "jauntsdn.com rpc compiler (version 1.1.3)",
    comments = "source: service.proto")
@com.jauntsdn.rsocket.Rpc.Generated(
    role = com.jauntsdn.rsocket.Rpc.Role.SERVICE,
    service = Diner.class)
public final class DinerServer implements com.jauntsdn.rsocket.RpcService {
  private final java.util.concurrent.CompletableFuture onClose = new java.util.concurrent.CompletableFuture();
  private final Diner service;
  private final io.netty.buffer.ByteBufAllocator allocator;
  private final com.jauntsdn.rsocket.RpcInstrumentation.Factory<com.jauntsdn.rsocket.Message> orderInstrumentation;
  private final com.jauntsdn.rsocket.RpcInstrumentation.Factory<Void> payInstrumentation;
  private final com.jauntsdn.rsocket.Rpc.Codec rpcCodec;

  private DinerServer(Diner service, com.jauntsdn.rsocket.RpcInstrumentation instrumentation, io.netty.buffer.ByteBufAllocator allocator, com.jauntsdn.rsocket.Rpc.Codec rpcCodec) {
    this.service = service;
    this.rpcCodec = rpcCodec;
    this.allocator = allocator;
    if (instrumentation == null) {
      this.orderInstrumentation = null;
      this.payInstrumentation = null;
    } else {
      this.orderInstrumentation = instrumentation.instrument("service", Diner.SERVICE, Diner.METHOD_ORDER, true);
      this.payInstrumentation = instrumentation.instrument("service", Diner.SERVICE, Diner.METHOD_PAY, false);
    }
  }

  public static DinerServer.Factory create(Diner service, java.util.Optional<com.jauntsdn.rsocket.RpcInstrumentation> instrumentation) {
    return new DinerServer.Factory(service, instrumentation);
  }

  public static DinerServer.Factory create(Diner service) {
    return new DinerServer.Factory(service);
  }

  @Override
  public String service() {
    return Diner.SERVICE;
  }

  @Override
  public Class<?> serviceType() {
    return Diner.SERVICE_TYPE;
  }

  @Override
  public java.util.concurrent.CompletionStage<Void> fireAndForget(com.jauntsdn.rsocket.Message message) {
    try {
      io.netty.buffer.ByteBuf metadata = message.metadata();
      long header = com.jauntsdn.rsocket.Rpc.RpcMetadata.header(metadata);
      int flags = com.jauntsdn.rsocket.Rpc.RpcMetadata.flags(header);
      String method = rpcCodec.decodeMessageMethod(metadata, header, flags);

      switch (method) {
        case Diner.METHOD_PAY: {
          if (!Diner.METHOD_PAY_IDEMPOTENT && com.jauntsdn.rsocket.Rpc.RpcMetadata.flagIdempotentCall(flags)) {
            return completedFuture(new com.jauntsdn.rsocket.exceptions.RpcException("DinerServer: idempotent call to non-idempotent method: " + method));
          }
          io.netty.buffer.ByteBuf messageData = message.data();
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(messageData.internalNioBuffer(0, messageData.readableBytes()));
          com.jauntsdn.rsocket.RpcInstrumentation.Listener<Void> instrumentationListener = null;
          if (payInstrumentation != null) {
            instrumentationListener = payInstrumentation.create();
            instrumentationListener.onStart();
          }
          java.util.concurrent.CompletionStage<Void> pay = service.pay(futures.Payment.parseFrom(is), metadata);
          if (instrumentationListener != null) {
            pay.whenComplete(instrumentationListener.onComplete());
          }
          return pay;
        }
        default: {
          return completedFuture(new com.jauntsdn.rsocket.exceptions.RpcException("DinerServer: fireAndForget unknown method: " + method));
        }
      }
    } catch (Throwable t) {
      return completedFuture(t);
    } finally {
      message.release();
    }
  }

  @Override
  public java.util.concurrent.CompletionStage<com.jauntsdn.rsocket.Message> requestResponse(com.jauntsdn.rsocket.Message message) {
    try {
      io.netty.buffer.ByteBuf metadata = message.metadata();
      long header = com.jauntsdn.rsocket.Rpc.RpcMetadata.header(metadata);
      int flags = com.jauntsdn.rsocket.Rpc.RpcMetadata.flags(header);
      String method = rpcCodec.decodeMessageMethod(metadata, header, flags);

      java.util.concurrent.CompletionStage<com.jauntsdn.rsocket.Message> handler = requestResponseHandler(flags, method, message.data(), metadata);
      if (handler != null) {
        return handler;
      }
      return completedFuture(new com.jauntsdn.rsocket.exceptions.RpcException("DinerServer: requestResponse not implemented"));
    } catch (Throwable t) {
      return completedFuture(t);
    } finally {
      message.release();
    }
  }

  @Override
  public void dispose() {
    onClose.complete(null);
  }

  @Override
  public boolean isDisposed() {
    return onClose.isDone();
  }

  @Override
  public java.util.concurrent.CompletionStage<Void> onClose() {
    return onClose;
  }

  private java.util.concurrent.CompletionStage<com.jauntsdn.rsocket.Message> requestResponseHandler(int flags, String method, io.netty.buffer.ByteBuf data, io.netty.buffer.ByteBuf metadata) throws java.io.IOException {
    switch (method) {
      case Diner.METHOD_ORDER: {
        if (!Diner.METHOD_ORDER_IDEMPOTENT && com.jauntsdn.rsocket.Rpc.RpcMetadata.flagIdempotentCall(flags)) {
          return completedFuture(new com.jauntsdn.rsocket.exceptions.RpcException("DinerServer: idempotent call to non-idempotent method: " + method));
        }
        com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(data.internalNioBuffer(0, data.readableBytes()));
        com.jauntsdn.rsocket.RpcInstrumentation.Listener<com.jauntsdn.rsocket.Message> instrumentationListener = null;
        if (orderInstrumentation != null) {
          instrumentationListener = orderInstrumentation.create();
          instrumentationListener.onStart();
        }
        java.util.concurrent.CompletionStage<com.jauntsdn.rsocket.Message> order = service.order(futures.Order.parseFrom(is), metadata).thenApply(encode);
        if (instrumentationListener != null) {
          order.whenComplete(instrumentationListener.onComplete());
        }
        return order;
      }
      default: {
        return null;
      }
    }
  }

  private final java.util.function.Function<com.google.protobuf.MessageLite, com.jauntsdn.rsocket.Message> encode =
    new java.util.function.Function<com.google.protobuf.MessageLite, com.jauntsdn.rsocket.Message>() {
      @Override
      public com.jauntsdn.rsocket.Message apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        com.jauntsdn.rsocket.Rpc.Codec codec = rpcCodec;
        io.netty.buffer.ByteBuf byteBuf = codec.encodeContent(allocator, length);
        try {
          int writerIndex = byteBuf.writerIndex();
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(writerIndex, length)));
          byteBuf.writerIndex(writerIndex + length);
          return codec.encodeMessage(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          com.jauntsdn.rsocket.exceptions.Exceptions.throwIfJvmFatal(t);
          throw new com.jauntsdn.rsocket.exceptions.SerializationException("DinerServer: message serialization error", t);
        }
      }
    };

  private static <T> java.util.function.Function<com.jauntsdn.rsocket.Message, T> decode(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<com.jauntsdn.rsocket.Message, T>() {
      @Override
      public T apply(com.jauntsdn.rsocket.Message message) {
        try {
          io.netty.buffer.ByteBuf messageData = message.data();
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(messageData.internalNioBuffer(0, messageData.readableBytes()));
          return parser.parseFrom(is);
        } catch (Throwable t) {
          com.jauntsdn.rsocket.exceptions.Exceptions.throwIfJvmFatal(t);
          throw new com.jauntsdn.rsocket.exceptions.SerializationException("DinerServer: message deserialization error", t);
        } finally {
          message.release();
        }
      }
    };
  }

  private static <T> java.util.concurrent.CompletionStage<T> completedFuture(Throwable t) {
    java.util.concurrent.CompletableFuture<T> future = new java.util.concurrent.CompletableFuture<>();
    future.completeExceptionally(t);
    return future;
  }

  @javax.inject.Named(
      value ="DinerServer")
  public static final class Factory implements com.jauntsdn.rsocket.RpcService.Factory<DinerServer> {
    private final Diner service;
    private final java.util.Optional<com.jauntsdn.rsocket.RpcInstrumentation> instrumentation;

    @javax.inject.Inject
    public Factory(Diner service, java.util.Optional<com.jauntsdn.rsocket.RpcInstrumentation> instrumentation) {
      this.service = java.util.Objects.requireNonNull(service, "service");
      this.instrumentation = java.util.Objects.requireNonNull(instrumentation, "instrumentation");
    }

    public Factory(Diner service) {
      this.service = java.util.Objects.requireNonNull(service, "service");
      this.instrumentation = null;
    }

    @Override
    public DinerServer withLifecycle(com.jauntsdn.rsocket.Closeable requester) {
      java.util.Objects.requireNonNull(requester, "requester");
      com.jauntsdn.rsocket.Rpc.Codec codec = requester.attributes().attr(com.jauntsdn.rsocket.Attributes.RPC_CODEC);
      if (codec != null) {
        if (codec.isDisposable()) {
          requester.onClose().thenAccept(ignored -> codec.dispose());
        }
        io.netty.buffer.ByteBufAllocator alloc = requester.attributes().attr(com.jauntsdn.rsocket.Attributes.ALLOCATOR);
        io.netty.buffer.ByteBufAllocator allocator = alloc != null ? alloc : io.netty.buffer.ByteBufAllocator.DEFAULT;
        java.util.Optional<com.jauntsdn.rsocket.RpcInstrumentation> instr = instrumentation;
        com.jauntsdn.rsocket.RpcInstrumentation rpcInstrumentation = instr == null
          ? requester.attributes().attr(com.jauntsdn.rsocket.Attributes.RPC_INSTRUMENTATION)
          : instr.orElse(null);
        return new DinerServer(service, rpcInstrumentation, allocator, codec);
      }
      throw new IllegalArgumentException("Requester " + requester.getClass() + " does not provide RPC codec");
    }
  }
}
