package com.grpc.discovery;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.2)",
    comments = "Source: Discovery.proto")
public final class DiscoveryServiceGrpc {

  private DiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.discovery.DiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getListDiscoveryMethod;

  public static io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getListDiscoveryMethod() {
    io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse> getListDiscoveryMethod;
    if ((getListDiscoveryMethod = DiscoveryServiceGrpc.getListDiscoveryMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getListDiscoveryMethod = DiscoveryServiceGrpc.getListDiscoveryMethod) == null) {
          DiscoveryServiceGrpc.getListDiscoveryMethod = getListDiscoveryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.discovery.DiscoveryService", "listDiscovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("listDiscovery"))
                  .build();
          }
        }
     }
     return getListDiscoveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getAddDiscoveryMethod;

  public static io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getAddDiscoveryMethod() {
    io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse> getAddDiscoveryMethod;
    if ((getAddDiscoveryMethod = DiscoveryServiceGrpc.getAddDiscoveryMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getAddDiscoveryMethod = DiscoveryServiceGrpc.getAddDiscoveryMethod) == null) {
          DiscoveryServiceGrpc.getAddDiscoveryMethod = getAddDiscoveryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.discovery.DiscoveryService", "addDiscovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("addDiscovery"))
                  .build();
          }
        }
     }
     return getAddDiscoveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getRemoveDiscoveryMethod;

  public static io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getRemoveDiscoveryMethod() {
    io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse> getRemoveDiscoveryMethod;
    if ((getRemoveDiscoveryMethod = DiscoveryServiceGrpc.getRemoveDiscoveryMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getRemoveDiscoveryMethod = DiscoveryServiceGrpc.getRemoveDiscoveryMethod) == null) {
          DiscoveryServiceGrpc.getRemoveDiscoveryMethod = getRemoveDiscoveryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.discovery.DiscoveryService", "removeDiscovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("removeDiscovery"))
                  .build();
          }
        }
     }
     return getRemoveDiscoveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getModifyDiscoveryMethod;

  public static io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest,
      com.grpc.discovery.DiscoveryResponse> getModifyDiscoveryMethod() {
    io.grpc.MethodDescriptor<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse> getModifyDiscoveryMethod;
    if ((getModifyDiscoveryMethod = DiscoveryServiceGrpc.getModifyDiscoveryMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getModifyDiscoveryMethod = DiscoveryServiceGrpc.getModifyDiscoveryMethod) == null) {
          DiscoveryServiceGrpc.getModifyDiscoveryMethod = getModifyDiscoveryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.discovery.DiscoveryRequest, com.grpc.discovery.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.discovery.DiscoveryService", "modifyDiscovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.discovery.DiscoveryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("modifyDiscovery"))
                  .build();
          }
        }
     }
     return getModifyDiscoveryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryServiceStub newStub(io.grpc.Channel channel) {
    return new DiscoveryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiscoveryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiscoveryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDiscoveryMethod(), responseObserver);
    }

    /**
     */
    public void addDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDiscoveryMethod(), responseObserver);
    }

    /**
     */
    public void removeDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveDiscoveryMethod(), responseObserver);
    }

    /**
     */
    public void modifyDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyDiscoveryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDiscoveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.discovery.DiscoveryRequest,
                com.grpc.discovery.DiscoveryResponse>(
                  this, METHODID_LIST_DISCOVERY)))
          .addMethod(
            getAddDiscoveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.discovery.DiscoveryRequest,
                com.grpc.discovery.DiscoveryResponse>(
                  this, METHODID_ADD_DISCOVERY)))
          .addMethod(
            getRemoveDiscoveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.discovery.DiscoveryRequest,
                com.grpc.discovery.DiscoveryResponse>(
                  this, METHODID_REMOVE_DISCOVERY)))
          .addMethod(
            getModifyDiscoveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.discovery.DiscoveryRequest,
                com.grpc.discovery.DiscoveryResponse>(
                  this, METHODID_MODIFY_DISCOVERY)))
          .build();
    }
  }

  /**
   */
  public static final class DiscoveryServiceStub extends io.grpc.stub.AbstractStub<DiscoveryServiceStub> {
    private DiscoveryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void listDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDiscoveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDiscoveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveDiscoveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyDiscovery(com.grpc.discovery.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyDiscoveryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DiscoveryServiceBlockingStub extends io.grpc.stub.AbstractStub<DiscoveryServiceBlockingStub> {
    private DiscoveryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.discovery.DiscoveryResponse listDiscovery(com.grpc.discovery.DiscoveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDiscoveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.discovery.DiscoveryResponse addDiscovery(com.grpc.discovery.DiscoveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddDiscoveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.discovery.DiscoveryResponse removeDiscovery(com.grpc.discovery.DiscoveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveDiscoveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.discovery.DiscoveryResponse modifyDiscovery(com.grpc.discovery.DiscoveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyDiscoveryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DiscoveryServiceFutureStub extends io.grpc.stub.AbstractStub<DiscoveryServiceFutureStub> {
    private DiscoveryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.discovery.DiscoveryResponse> listDiscovery(
        com.grpc.discovery.DiscoveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDiscoveryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.discovery.DiscoveryResponse> addDiscovery(
        com.grpc.discovery.DiscoveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDiscoveryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.discovery.DiscoveryResponse> removeDiscovery(
        com.grpc.discovery.DiscoveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveDiscoveryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.discovery.DiscoveryResponse> modifyDiscovery(
        com.grpc.discovery.DiscoveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyDiscoveryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DISCOVERY = 0;
  private static final int METHODID_ADD_DISCOVERY = 1;
  private static final int METHODID_REMOVE_DISCOVERY = 2;
  private static final int METHODID_MODIFY_DISCOVERY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DISCOVERY:
          serviceImpl.listDiscovery((com.grpc.discovery.DiscoveryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse>) responseObserver);
          break;
        case METHODID_ADD_DISCOVERY:
          serviceImpl.addDiscovery((com.grpc.discovery.DiscoveryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DISCOVERY:
          serviceImpl.removeDiscovery((com.grpc.discovery.DiscoveryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse>) responseObserver);
          break;
        case METHODID_MODIFY_DISCOVERY:
          serviceImpl.modifyDiscovery((com.grpc.discovery.DiscoveryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.discovery.DiscoveryResponse>) responseObserver);
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

  private static abstract class DiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.discovery.DiscoveryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiscoveryService");
    }
  }

  private static final class DiscoveryServiceFileDescriptorSupplier
      extends DiscoveryServiceBaseDescriptorSupplier {
    DiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class DiscoveryServiceMethodDescriptorSupplier
      extends DiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryServiceFileDescriptorSupplier())
              .addMethod(getListDiscoveryMethod())
              .addMethod(getAddDiscoveryMethod())
              .addMethod(getRemoveDiscoveryMethod())
              .addMethod(getModifyDiscoveryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
