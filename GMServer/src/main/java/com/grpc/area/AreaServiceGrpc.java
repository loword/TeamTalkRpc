package com.grpc.area;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: area.proto")
public final class AreaServiceGrpc {

  private AreaServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.area.AreaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> METHOD_LIST_AREA =
      io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.area.AreaService", "listArea"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> METHOD_ADD_AREA =
      io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.area.AreaService", "addArea"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> METHOD_MODIFY_AREA =
      io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.area.AreaService", "modifyArea"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> METHOD_GET_AREA_TREE =
      io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.area.AreaService", "getAreaTree"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> METHOD_GET_AREA =
      io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.area.AreaService", "getArea"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.area.AreaResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AreaServiceStub newStub(io.grpc.Channel channel) {
    return new AreaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AreaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AreaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AreaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AreaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AreaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_AREA, responseObserver);
    }

    /**
     */
    public void addArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_AREA, responseObserver);
    }

    /**
     */
    public void modifyArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_AREA, responseObserver);
    }

    /**
     */
    public void getAreaTree(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AREA_TREE, responseObserver);
    }

    /**
     */
    public void getArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AREA, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_AREA,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_LIST_AREA)))
          .addMethod(
            METHOD_ADD_AREA,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_ADD_AREA)))
          .addMethod(
            METHOD_MODIFY_AREA,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_MODIFY_AREA)))
          .addMethod(
            METHOD_GET_AREA_TREE,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_GET_AREA_TREE)))
          .addMethod(
            METHOD_GET_AREA,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_GET_AREA)))
          .build();
    }
  }

  /**
   */
  public static final class AreaServiceStub extends io.grpc.stub.AbstractStub<AreaServiceStub> {
    private AreaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceStub(channel, callOptions);
    }

    /**
     */
    public void listArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_AREA, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_AREA, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_AREA, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAreaTree(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AREA_TREE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AREA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AreaServiceBlockingStub extends io.grpc.stub.AbstractStub<AreaServiceBlockingStub> {
    private AreaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.area.AreaResponse listArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_AREA, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse addArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_AREA, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse modifyArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_AREA, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse getAreaTree(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AREA_TREE, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse getArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AREA, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AreaServiceFutureStub extends io.grpc.stub.AbstractStub<AreaServiceFutureStub> {
    private AreaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> listArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_AREA, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> addArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_AREA, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> modifyArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_AREA, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> getAreaTree(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AREA_TREE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> getArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AREA, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_AREA = 0;
  private static final int METHODID_ADD_AREA = 1;
  private static final int METHODID_MODIFY_AREA = 2;
  private static final int METHODID_GET_AREA_TREE = 3;
  private static final int METHODID_GET_AREA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AreaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AreaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_AREA:
          serviceImpl.listArea((com.grpc.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse>) responseObserver);
          break;
        case METHODID_ADD_AREA:
          serviceImpl.addArea((com.grpc.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse>) responseObserver);
          break;
        case METHODID_MODIFY_AREA:
          serviceImpl.modifyArea((com.grpc.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse>) responseObserver);
          break;
        case METHODID_GET_AREA_TREE:
          serviceImpl.getAreaTree((com.grpc.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse>) responseObserver);
          break;
        case METHODID_GET_AREA:
          serviceImpl.getArea((com.grpc.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse>) responseObserver);
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

  private static final class AreaServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.area.AreaOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AreaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AreaServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_AREA)
              .addMethod(METHOD_ADD_AREA)
              .addMethod(METHOD_MODIFY_AREA)
              .addMethod(METHOD_GET_AREA_TREE)
              .addMethod(METHOD_GET_AREA)
              .build();
        }
      }
    }
    return result;
  }
}
