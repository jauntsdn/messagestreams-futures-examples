package futures;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DinerGrpc {

  private DinerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "futures.Diner";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<futures.Order,
      futures.Meal> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "order",
      requestType = futures.Order.class,
      responseType = futures.Meal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<futures.Order,
      futures.Meal> getOrderMethod() {
    io.grpc.MethodDescriptor<futures.Order, futures.Meal> getOrderMethod;
    if ((getOrderMethod = DinerGrpc.getOrderMethod) == null) {
      synchronized (DinerGrpc.class) {
        if ((getOrderMethod = DinerGrpc.getOrderMethod) == null) {
          DinerGrpc.getOrderMethod = getOrderMethod =
              io.grpc.MethodDescriptor.<futures.Order, futures.Meal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  futures.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  futures.Meal.getDefaultInstance()))
              .setSchemaDescriptor(new DinerMethodDescriptorSupplier("order"))
              .build();
        }
      }
    }
    return getOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<futures.Payment,
      com.google.protobuf.Empty> getPayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pay",
      requestType = futures.Payment.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<futures.Payment,
      com.google.protobuf.Empty> getPayMethod() {
    io.grpc.MethodDescriptor<futures.Payment, com.google.protobuf.Empty> getPayMethod;
    if ((getPayMethod = DinerGrpc.getPayMethod) == null) {
      synchronized (DinerGrpc.class) {
        if ((getPayMethod = DinerGrpc.getPayMethod) == null) {
          DinerGrpc.getPayMethod = getPayMethod =
              io.grpc.MethodDescriptor.<futures.Payment, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  futures.Payment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DinerMethodDescriptorSupplier("pay"))
              .build();
        }
      }
    }
    return getPayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DinerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinerStub>() {
        @java.lang.Override
        public DinerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinerStub(channel, callOptions);
        }
      };
    return DinerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DinerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinerBlockingStub>() {
        @java.lang.Override
        public DinerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinerBlockingStub(channel, callOptions);
        }
      };
    return DinerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DinerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinerFutureStub>() {
        @java.lang.Override
        public DinerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinerFutureStub(channel, callOptions);
        }
      };
    return DinerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void order(futures.Order request,
        io.grpc.stub.StreamObserver<futures.Meal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    /**
     */
    default void pay(futures.Payment request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPayMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Diner.
   */
  public static abstract class DinerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DinerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Diner.
   */
  public static final class DinerStub
      extends io.grpc.stub.AbstractAsyncStub<DinerStub> {
    private DinerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinerStub(channel, callOptions);
    }

    /**
     */
    public void order(futures.Order request,
        io.grpc.stub.StreamObserver<futures.Meal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pay(futures.Payment request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Diner.
   */
  public static final class DinerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DinerBlockingStub> {
    private DinerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinerBlockingStub(channel, callOptions);
    }

    /**
     */
    public futures.Meal order(futures.Order request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty pay(futures.Payment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPayMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Diner.
   */
  public static final class DinerFutureStub
      extends io.grpc.stub.AbstractFutureStub<DinerFutureStub> {
    private DinerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<futures.Meal> order(
        futures.Order request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> pay(
        futures.Payment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER = 0;
  private static final int METHODID_PAY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER:
          serviceImpl.order((futures.Order) request,
              (io.grpc.stub.StreamObserver<futures.Meal>) responseObserver);
          break;
        case METHODID_PAY:
          serviceImpl.pay((futures.Payment) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              futures.Order,
              futures.Meal>(
                service, METHODID_ORDER)))
        .addMethod(
          getPayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              futures.Payment,
              com.google.protobuf.Empty>(
                service, METHODID_PAY)))
        .build();
  }

  private static abstract class DinerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DinerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return futures.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Diner");
    }
  }

  private static final class DinerFileDescriptorSupplier
      extends DinerBaseDescriptorSupplier {
    DinerFileDescriptorSupplier() {}
  }

  private static final class DinerMethodDescriptorSupplier
      extends DinerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DinerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DinerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DinerFileDescriptorSupplier())
              .addMethod(getOrderMethod())
              .addMethod(getPayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
