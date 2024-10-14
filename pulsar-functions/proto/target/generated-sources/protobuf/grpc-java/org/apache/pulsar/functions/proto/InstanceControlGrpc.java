package org.apache.pulsar.functions.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.3)",
    comments = "Source: InstanceCommunication.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstanceControlGrpc {

  private InstanceControlGrpc() {}

  public static final String SERVICE_NAME = "proto.InstanceControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFunctionStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod;
    if ((getGetFunctionStatusMethod = InstanceControlGrpc.getGetFunctionStatusMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetFunctionStatusMethod = InstanceControlGrpc.getGetFunctionStatusMethod) == null) {
          InstanceControlGrpc.getGetFunctionStatusMethod = getGetFunctionStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFunctionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetFunctionStatus"))
              .build();
        }
      }
    }
    return getGetFunctionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAndResetMetrics",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod;
    if ((getGetAndResetMetricsMethod = InstanceControlGrpc.getGetAndResetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetAndResetMetricsMethod = InstanceControlGrpc.getGetAndResetMetricsMethod) == null) {
          InstanceControlGrpc.getGetAndResetMetricsMethod = getGetAndResetMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAndResetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetAndResetMetrics"))
              .build();
        }
      }
    }
    return getGetAndResetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetMetrics",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResetMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getResetMetricsMethod;
    if ((getResetMetricsMethod = InstanceControlGrpc.getResetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getResetMetricsMethod = InstanceControlGrpc.getResetMetricsMethod) == null) {
          InstanceControlGrpc.getResetMetricsMethod = getResetMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("ResetMetrics"))
              .build();
        }
      }
    }
    return getResetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod;
    if ((getGetMetricsMethod = InstanceControlGrpc.getGetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetMetricsMethod = InstanceControlGrpc.getGetMetricsMethod) == null) {
          InstanceControlGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetMetrics"))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod;
    if ((getHealthCheckMethod = InstanceControlGrpc.getHealthCheckMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getHealthCheckMethod = InstanceControlGrpc.getHealthCheckMethod) == null) {
          InstanceControlGrpc.getHealthCheckMethod = getHealthCheckMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("HealthCheck"))
              .build();
        }
      }
    }
    return getHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceControlStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceControlStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceControlStub>() {
        @java.lang.Override
        public InstanceControlStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceControlStub(channel, callOptions);
        }
      };
    return InstanceControlStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceControlBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceControlBlockingStub>() {
        @java.lang.Override
        public InstanceControlBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceControlBlockingStub(channel, callOptions);
        }
      };
    return InstanceControlBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceControlFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceControlFutureStub>() {
        @java.lang.Override
        public InstanceControlFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceControlFutureStub(channel, callOptions);
        }
      };
    return InstanceControlFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFunctionStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFunctionStatusMethod(), responseObserver);
    }

    /**
     */
    default void getAndResetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAndResetMetricsMethod(), responseObserver);
    }

    /**
     */
    default void resetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMetricsMethod(), responseObserver);
    }

    /**
     */
    default void getMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    /**
     */
    default void healthCheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InstanceControl.
   */
  public static abstract class InstanceControlImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InstanceControlGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InstanceControl.
   */
  public static final class InstanceControlStub
      extends io.grpc.stub.AbstractAsyncStub<InstanceControlStub> {
    private InstanceControlStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceControlStub(channel, callOptions);
    }

    /**
     */
    public void getFunctionStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFunctionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAndResetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAndResetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void healthCheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InstanceControl.
   */
  public static final class InstanceControlBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InstanceControlBlockingStub> {
    private InstanceControlBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus getFunctionStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFunctionStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData getAndResetMetrics(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAndResetMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetMetrics(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData getMetrics(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult healthCheck(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InstanceControl.
   */
  public static final class InstanceControlFutureStub
      extends io.grpc.stub.AbstractFutureStub<InstanceControlFutureStub> {
    private InstanceControlFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getFunctionStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFunctionStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getAndResetMetrics(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAndResetMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetMetrics(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getMetrics(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> healthCheck(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FUNCTION_STATUS = 0;
  private static final int METHODID_GET_AND_RESET_METRICS = 1;
  private static final int METHODID_RESET_METRICS = 2;
  private static final int METHODID_GET_METRICS = 3;
  private static final int METHODID_HEALTH_CHECK = 4;

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
        case METHODID_GET_FUNCTION_STATUS:
          serviceImpl.getFunctionStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>) responseObserver);
          break;
        case METHODID_GET_AND_RESET_METRICS:
          serviceImpl.getAndResetMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>) responseObserver);
          break;
        case METHODID_RESET_METRICS:
          serviceImpl.resetMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>) responseObserver);
          break;
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>) responseObserver);
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
          getGetFunctionStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>(
                service, METHODID_GET_FUNCTION_STATUS)))
        .addMethod(
          getGetAndResetMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>(
                service, METHODID_GET_AND_RESET_METRICS)))
        .addMethod(
          getResetMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_RESET_METRICS)))
        .addMethod(
          getGetMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>(
                service, METHODID_GET_METRICS)))
        .addMethod(
          getHealthCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>(
                service, METHODID_HEALTH_CHECK)))
        .build();
  }

  private static abstract class InstanceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.pulsar.functions.proto.InstanceCommunication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceControl");
    }
  }

  private static final class InstanceControlFileDescriptorSupplier
      extends InstanceControlBaseDescriptorSupplier {
    InstanceControlFileDescriptorSupplier() {}
  }

  private static final class InstanceControlMethodDescriptorSupplier
      extends InstanceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceControlFileDescriptorSupplier())
              .addMethod(getGetFunctionStatusMethod())
              .addMethod(getGetAndResetMetricsMethod())
              .addMethod(getResetMetricsMethod())
              .addMethod(getGetMetricsMethod())
              .addMethod(getHealthCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
