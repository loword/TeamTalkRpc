package com.grpc.role_menu;

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
    comments = "Source: role_menu.proto")
public final class RPServiceGrpc {

  private RPServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.role_menu.RPService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getListRPMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getListRPMethod() {
    io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse> getListRPMethod;
    if ((getListRPMethod = RPServiceGrpc.getListRPMethod) == null) {
      synchronized (RPServiceGrpc.class) {
        if ((getListRPMethod = RPServiceGrpc.getListRPMethod) == null) {
          RPServiceGrpc.getListRPMethod = getListRPMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role_menu.RPService", "listRP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RPServiceMethodDescriptorSupplier("listRP"))
                  .build();
          }
        }
     }
     return getListRPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getAddRPMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getAddRPMethod() {
    io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse> getAddRPMethod;
    if ((getAddRPMethod = RPServiceGrpc.getAddRPMethod) == null) {
      synchronized (RPServiceGrpc.class) {
        if ((getAddRPMethod = RPServiceGrpc.getAddRPMethod) == null) {
          RPServiceGrpc.getAddRPMethod = getAddRPMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role_menu.RPService", "addRP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RPServiceMethodDescriptorSupplier("addRP"))
                  .build();
          }
        }
     }
     return getAddRPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getRemoveRPMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getRemoveRPMethod() {
    io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse> getRemoveRPMethod;
    if ((getRemoveRPMethod = RPServiceGrpc.getRemoveRPMethod) == null) {
      synchronized (RPServiceGrpc.class) {
        if ((getRemoveRPMethod = RPServiceGrpc.getRemoveRPMethod) == null) {
          RPServiceGrpc.getRemoveRPMethod = getRemoveRPMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role_menu.RPService", "removeRP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RPServiceMethodDescriptorSupplier("removeRP"))
                  .build();
          }
        }
     }
     return getRemoveRPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getModifyRPMethod;

  public static io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest,
      com.grpc.role_menu.RPResponse> getModifyRPMethod() {
    io.grpc.MethodDescriptor<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse> getModifyRPMethod;
    if ((getModifyRPMethod = RPServiceGrpc.getModifyRPMethod) == null) {
      synchronized (RPServiceGrpc.class) {
        if ((getModifyRPMethod = RPServiceGrpc.getModifyRPMethod) == null) {
          RPServiceGrpc.getModifyRPMethod = getModifyRPMethod = 
              io.grpc.MethodDescriptor.<com.grpc.role_menu.RPRequest, com.grpc.role_menu.RPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.role_menu.RPService", "modifyRP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.role_menu.RPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RPServiceMethodDescriptorSupplier("modifyRP"))
                  .build();
          }
        }
     }
     return getModifyRPMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPServiceStub newStub(io.grpc.Channel channel) {
    return new RPServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RPServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RPServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RPServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRPMethod(), responseObserver);
    }

    /**
     */
    public void addRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRPMethod(), responseObserver);
    }

    /**
     */
    public void removeRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRPMethod(), responseObserver);
    }

    /**
     */
    public void modifyRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyRPMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListRPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role_menu.RPRequest,
                com.grpc.role_menu.RPResponse>(
                  this, METHODID_LIST_RP)))
          .addMethod(
            getAddRPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role_menu.RPRequest,
                com.grpc.role_menu.RPResponse>(
                  this, METHODID_ADD_RP)))
          .addMethod(
            getRemoveRPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role_menu.RPRequest,
                com.grpc.role_menu.RPResponse>(
                  this, METHODID_REMOVE_RP)))
          .addMethod(
            getModifyRPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.role_menu.RPRequest,
                com.grpc.role_menu.RPResponse>(
                  this, METHODID_MODIFY_RP)))
          .build();
    }
  }

  /**
   */
  public static final class RPServiceStub extends io.grpc.stub.AbstractStub<RPServiceStub> {
    private RPServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPServiceStub(channel, callOptions);
    }

    /**
     */
    public void listRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyRP(com.grpc.role_menu.RPRequest request,
        io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyRPMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RPServiceBlockingStub extends io.grpc.stub.AbstractStub<RPServiceBlockingStub> {
    private RPServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.role_menu.RPResponse listRP(com.grpc.role_menu.RPRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role_menu.RPResponse addRP(com.grpc.role_menu.RPRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role_menu.RPResponse removeRP(com.grpc.role_menu.RPRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.role_menu.RPResponse modifyRP(com.grpc.role_menu.RPRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyRPMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RPServiceFutureStub extends io.grpc.stub.AbstractStub<RPServiceFutureStub> {
    private RPServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role_menu.RPResponse> listRP(
        com.grpc.role_menu.RPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role_menu.RPResponse> addRP(
        com.grpc.role_menu.RPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role_menu.RPResponse> removeRP(
        com.grpc.role_menu.RPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.role_menu.RPResponse> modifyRP(
        com.grpc.role_menu.RPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyRPMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_RP = 0;
  private static final int METHODID_ADD_RP = 1;
  private static final int METHODID_REMOVE_RP = 2;
  private static final int METHODID_MODIFY_RP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RPServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RPServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_RP:
          serviceImpl.listRP((com.grpc.role_menu.RPRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse>) responseObserver);
          break;
        case METHODID_ADD_RP:
          serviceImpl.addRP((com.grpc.role_menu.RPRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse>) responseObserver);
          break;
        case METHODID_REMOVE_RP:
          serviceImpl.removeRP((com.grpc.role_menu.RPRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse>) responseObserver);
          break;
        case METHODID_MODIFY_RP:
          serviceImpl.modifyRP((com.grpc.role_menu.RPRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.role_menu.RPResponse>) responseObserver);
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

  private static abstract class RPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.role_menu.RoleMenu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPService");
    }
  }

  private static final class RPServiceFileDescriptorSupplier
      extends RPServiceBaseDescriptorSupplier {
    RPServiceFileDescriptorSupplier() {}
  }

  private static final class RPServiceMethodDescriptorSupplier
      extends RPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RPServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPServiceFileDescriptorSupplier())
              .addMethod(getListRPMethod())
              .addMethod(getAddRPMethod())
              .addMethod(getRemoveRPMethod())
              .addMethod(getModifyRPMethod())
              .build();
        }
      }
    }
    return result;
  }
}
