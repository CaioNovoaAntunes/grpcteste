package carros.grpc.br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: edu.proto")
public final class EduServiceGrpc {

  private EduServiceGrpc() {}

  public static final String SERVICE_NAME = "carros.grpc.br.com.zup.EduService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<carros.grpc.br.com.zup.EduRequest,
      carros.grpc.br.com.zup.EduReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = carros.grpc.br.com.zup.EduRequest.class,
      responseType = carros.grpc.br.com.zup.EduReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<carros.grpc.br.com.zup.EduRequest,
      carros.grpc.br.com.zup.EduReply> getSendMethod() {
    io.grpc.MethodDescriptor<carros.grpc.br.com.zup.EduRequest, carros.grpc.br.com.zup.EduReply> getSendMethod;
    if ((getSendMethod = EduServiceGrpc.getSendMethod) == null) {
      synchronized (EduServiceGrpc.class) {
        if ((getSendMethod = EduServiceGrpc.getSendMethod) == null) {
          EduServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<carros.grpc.br.com.zup.EduRequest, carros.grpc.br.com.zup.EduReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carros.grpc.br.com.zup.EduRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carros.grpc.br.com.zup.EduReply.getDefaultInstance()))
              .setSchemaDescriptor(new EduServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduServiceStub>() {
        @java.lang.Override
        public EduServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduServiceStub(channel, callOptions);
        }
      };
    return EduServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduServiceBlockingStub>() {
        @java.lang.Override
        public EduServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduServiceBlockingStub(channel, callOptions);
        }
      };
    return EduServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduServiceFutureStub>() {
        @java.lang.Override
        public EduServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduServiceFutureStub(channel, callOptions);
        }
      };
    return EduServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(carros.grpc.br.com.zup.EduRequest request,
        io.grpc.stub.StreamObserver<carros.grpc.br.com.zup.EduReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                carros.grpc.br.com.zup.EduRequest,
                carros.grpc.br.com.zup.EduReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class EduServiceStub extends io.grpc.stub.AbstractAsyncStub<EduServiceStub> {
    private EduServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(carros.grpc.br.com.zup.EduRequest request,
        io.grpc.stub.StreamObserver<carros.grpc.br.com.zup.EduReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduServiceBlockingStub> {
    private EduServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public carros.grpc.br.com.zup.EduReply send(carros.grpc.br.com.zup.EduRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduServiceFutureStub> {
    private EduServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<carros.grpc.br.com.zup.EduReply> send(
        carros.grpc.br.com.zup.EduRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((carros.grpc.br.com.zup.EduRequest) request,
              (io.grpc.stub.StreamObserver<carros.grpc.br.com.zup.EduReply>) responseObserver);
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

  private static abstract class EduServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return carros.grpc.br.com.zup.Edu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduService");
    }
  }

  private static final class EduServiceFileDescriptorSupplier
      extends EduServiceBaseDescriptorSupplier {
    EduServiceFileDescriptorSupplier() {}
  }

  private static final class EduServiceMethodDescriptorSupplier
      extends EduServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
