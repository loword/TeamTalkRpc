package com.grpc.area;

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
    comments = "Source: area.proto")
public final class AreaServiceGrpc {

  private AreaServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.area.AreaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getListAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getListAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse> getListAreaMethod;
    if ((getListAreaMethod = AreaServiceGrpc.getListAreaMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getListAreaMethod = AreaServiceGrpc.getListAreaMethod) == null) {
          AreaServiceGrpc.getListAreaMethod = getListAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.area.AreaService", "listArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("listArea"))
                  .build();
          }
        }
     }
     return getListAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getAddAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getAddAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse> getAddAreaMethod;
    if ((getAddAreaMethod = AreaServiceGrpc.getAddAreaMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getAddAreaMethod = AreaServiceGrpc.getAddAreaMethod) == null) {
          AreaServiceGrpc.getAddAreaMethod = getAddAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.area.AreaService", "addArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("addArea"))
                  .build();
          }
        }
     }
     return getAddAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getModifyAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getModifyAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse> getModifyAreaMethod;
    if ((getModifyAreaMethod = AreaServiceGrpc.getModifyAreaMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getModifyAreaMethod = AreaServiceGrpc.getModifyAreaMethod) == null) {
          AreaServiceGrpc.getModifyAreaMethod = getModifyAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.area.AreaService", "modifyArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("modifyArea"))
                  .build();
          }
        }
     }
     return getModifyAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaTree> getGetAreaTreeMethod;

  public static io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaTree> getGetAreaTreeMethod() {
    io.grpc.MethodDescriptor<com.grpc.area.AreaRequest, com.grpc.area.AreaTree> getGetAreaTreeMethod;
    if ((getGetAreaTreeMethod = AreaServiceGrpc.getGetAreaTreeMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getGetAreaTreeMethod = AreaServiceGrpc.getGetAreaTreeMethod) == null) {
          AreaServiceGrpc.getGetAreaTreeMethod = getGetAreaTreeMethod = 
              io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaTree>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.area.AreaService", "getAreaTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaTree.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("getAreaTree"))
                  .build();
          }
        }
     }
     return getGetAreaTreeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getGetAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.area.AreaRequest,
      com.grpc.area.AreaResponse> getGetAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse> getGetAreaMethod;
    if ((getGetAreaMethod = AreaServiceGrpc.getGetAreaMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getGetAreaMethod = AreaServiceGrpc.getGetAreaMethod) == null) {
          AreaServiceGrpc.getGetAreaMethod = getGetAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.area.AreaRequest, com.grpc.area.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.area.AreaService", "getArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.area.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("getArea"))
                  .build();
          }
        }
     }
     return getGetAreaMethod;
  }

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
      asyncUnimplementedUnaryCall(getListAreaMethod(), responseObserver);
    }

    /**
     */
    public void addArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAreaMethod(), responseObserver);
    }

    /**
     */
    public void modifyArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyAreaMethod(), responseObserver);
    }

    /**
     */
    public void getAreaTree(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaTree> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAreaTreeMethod(), responseObserver);
    }

    /**
     */
    public void getArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAreaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_LIST_AREA)))
          .addMethod(
            getAddAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_ADD_AREA)))
          .addMethod(
            getModifyAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaResponse>(
                  this, METHODID_MODIFY_AREA)))
          .addMethod(
            getGetAreaTreeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.area.AreaRequest,
                com.grpc.area.AreaTree>(
                  this, METHODID_GET_AREA_TREE)))
          .addMethod(
            getGetAreaMethod(),
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
          getChannel().newCall(getListAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAreaTree(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaTree> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAreaTreeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArea(com.grpc.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAreaMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getListAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse addArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse modifyArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaTree getAreaTree(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAreaTreeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.area.AreaResponse getArea(com.grpc.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAreaMethod(), getCallOptions(), request);
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
          getChannel().newCall(getListAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> addArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> modifyArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaTree> getAreaTree(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAreaTreeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.area.AreaResponse> getArea(
        com.grpc.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAreaMethod(), getCallOptions()), request);
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
              (io.grpc.stub.StreamObserver<com.grpc.area.AreaTree>) responseObserver);
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

  private static abstract class AreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AreaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.area.AreaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AreaService");
    }
  }

  private static final class AreaServiceFileDescriptorSupplier
      extends AreaServiceBaseDescriptorSupplier {
    AreaServiceFileDescriptorSupplier() {}
  }

  private static final class AreaServiceMethodDescriptorSupplier
      extends AreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AreaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AreaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AreaServiceFileDescriptorSupplier())
              .addMethod(getListAreaMethod())
              .addMethod(getAddAreaMethod())
              .addMethod(getModifyAreaMethod())
              .addMethod(getGetAreaTreeMethod())
              .addMethod(getGetAreaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
