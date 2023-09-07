package com.grpc.user_area;

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
    comments = "Source: user_area.proto")
public final class UserAreaServiceGrpc {

  private UserAreaServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.user_area.UserAreaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getListUserAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getListUserAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse> getListUserAreaMethod;
    if ((getListUserAreaMethod = UserAreaServiceGrpc.getListUserAreaMethod) == null) {
      synchronized (UserAreaServiceGrpc.class) {
        if ((getListUserAreaMethod = UserAreaServiceGrpc.getListUserAreaMethod) == null) {
          UserAreaServiceGrpc.getListUserAreaMethod = getListUserAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user_area.UserAreaService", "listUserArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserAreaServiceMethodDescriptorSupplier("listUserArea"))
                  .build();
          }
        }
     }
     return getListUserAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getAddUserAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getAddUserAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse> getAddUserAreaMethod;
    if ((getAddUserAreaMethod = UserAreaServiceGrpc.getAddUserAreaMethod) == null) {
      synchronized (UserAreaServiceGrpc.class) {
        if ((getAddUserAreaMethod = UserAreaServiceGrpc.getAddUserAreaMethod) == null) {
          UserAreaServiceGrpc.getAddUserAreaMethod = getAddUserAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user_area.UserAreaService", "addUserArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserAreaServiceMethodDescriptorSupplier("addUserArea"))
                  .build();
          }
        }
     }
     return getAddUserAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getRemoveUserAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getRemoveUserAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse> getRemoveUserAreaMethod;
    if ((getRemoveUserAreaMethod = UserAreaServiceGrpc.getRemoveUserAreaMethod) == null) {
      synchronized (UserAreaServiceGrpc.class) {
        if ((getRemoveUserAreaMethod = UserAreaServiceGrpc.getRemoveUserAreaMethod) == null) {
          UserAreaServiceGrpc.getRemoveUserAreaMethod = getRemoveUserAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user_area.UserAreaService", "removeUserArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserAreaServiceMethodDescriptorSupplier("removeUserArea"))
                  .build();
          }
        }
     }
     return getRemoveUserAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getModifyUserAreaMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest,
      com.grpc.user_area.UserAreaResponse> getModifyUserAreaMethod() {
    io.grpc.MethodDescriptor<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse> getModifyUserAreaMethod;
    if ((getModifyUserAreaMethod = UserAreaServiceGrpc.getModifyUserAreaMethod) == null) {
      synchronized (UserAreaServiceGrpc.class) {
        if ((getModifyUserAreaMethod = UserAreaServiceGrpc.getModifyUserAreaMethod) == null) {
          UserAreaServiceGrpc.getModifyUserAreaMethod = getModifyUserAreaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user_area.UserAreaRequest, com.grpc.user_area.UserAreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user_area.UserAreaService", "modifyUserArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user_area.UserAreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserAreaServiceMethodDescriptorSupplier("modifyUserArea"))
                  .build();
          }
        }
     }
     return getModifyUserAreaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAreaServiceStub newStub(io.grpc.Channel channel) {
    return new UserAreaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAreaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserAreaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAreaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserAreaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserAreaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserAreaMethod(), responseObserver);
    }

    /**
     */
    public void addUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserAreaMethod(), responseObserver);
    }

    /**
     */
    public void removeUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserAreaMethod(), responseObserver);
    }

    /**
     */
    public void modifyUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyUserAreaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUserAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user_area.UserAreaRequest,
                com.grpc.user_area.UserAreaResponse>(
                  this, METHODID_LIST_USER_AREA)))
          .addMethod(
            getAddUserAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user_area.UserAreaRequest,
                com.grpc.user_area.UserAreaResponse>(
                  this, METHODID_ADD_USER_AREA)))
          .addMethod(
            getRemoveUserAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user_area.UserAreaRequest,
                com.grpc.user_area.UserAreaResponse>(
                  this, METHODID_REMOVE_USER_AREA)))
          .addMethod(
            getModifyUserAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user_area.UserAreaRequest,
                com.grpc.user_area.UserAreaResponse>(
                  this, METHODID_MODIFY_USER_AREA)))
          .build();
    }
  }

  /**
   */
  public static final class UserAreaServiceStub extends io.grpc.stub.AbstractStub<UserAreaServiceStub> {
    private UserAreaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAreaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAreaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAreaServiceStub(channel, callOptions);
    }

    /**
     */
    public void listUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyUserArea(com.grpc.user_area.UserAreaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyUserAreaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAreaServiceBlockingStub extends io.grpc.stub.AbstractStub<UserAreaServiceBlockingStub> {
    private UserAreaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAreaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAreaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAreaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user_area.UserAreaResponse listUserArea(com.grpc.user_area.UserAreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user_area.UserAreaResponse addUserArea(com.grpc.user_area.UserAreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user_area.UserAreaResponse removeUserArea(com.grpc.user_area.UserAreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user_area.UserAreaResponse modifyUserArea(com.grpc.user_area.UserAreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyUserAreaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAreaServiceFutureStub extends io.grpc.stub.AbstractStub<UserAreaServiceFutureStub> {
    private UserAreaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAreaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAreaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAreaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user_area.UserAreaResponse> listUserArea(
        com.grpc.user_area.UserAreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user_area.UserAreaResponse> addUserArea(
        com.grpc.user_area.UserAreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user_area.UserAreaResponse> removeUserArea(
        com.grpc.user_area.UserAreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user_area.UserAreaResponse> modifyUserArea(
        com.grpc.user_area.UserAreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyUserAreaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USER_AREA = 0;
  private static final int METHODID_ADD_USER_AREA = 1;
  private static final int METHODID_REMOVE_USER_AREA = 2;
  private static final int METHODID_MODIFY_USER_AREA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAreaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAreaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USER_AREA:
          serviceImpl.listUserArea((com.grpc.user_area.UserAreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_AREA:
          serviceImpl.addUserArea((com.grpc.user_area.UserAreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_AREA:
          serviceImpl.removeUserArea((com.grpc.user_area.UserAreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse>) responseObserver);
          break;
        case METHODID_MODIFY_USER_AREA:
          serviceImpl.modifyUserArea((com.grpc.user_area.UserAreaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user_area.UserAreaResponse>) responseObserver);
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

  private static abstract class UserAreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAreaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user_area.UserAreaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAreaService");
    }
  }

  private static final class UserAreaServiceFileDescriptorSupplier
      extends UserAreaServiceBaseDescriptorSupplier {
    UserAreaServiceFileDescriptorSupplier() {}
  }

  private static final class UserAreaServiceMethodDescriptorSupplier
      extends UserAreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAreaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAreaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAreaServiceFileDescriptorSupplier())
              .addMethod(getListUserAreaMethod())
              .addMethod(getAddUserAreaMethod())
              .addMethod(getRemoveUserAreaMethod())
              .addMethod(getModifyUserAreaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
