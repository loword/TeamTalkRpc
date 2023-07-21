package com.grpc.user;

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
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getListUserMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getListUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.UserRequest, com.grpc.user.UserResponse> getListUserMethod;
    if ((getListUserMethod = UserServiceGrpc.getListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserMethod = UserServiceGrpc.getListUserMethod) == null) {
          UserServiceGrpc.getListUserMethod = getListUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user.UserRequest, com.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user.UserService", "listUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("listUser"))
                  .build();
          }
        }
     }
     return getListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getAddUserMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.UserRequest, com.grpc.user.UserResponse> getAddUserMethod;
    if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
          UserServiceGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user.UserRequest, com.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user.UserService", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getModifyPasswordMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getModifyPasswordMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.UserRequest, com.grpc.user.UserResponse> getModifyPasswordMethod;
    if ((getModifyPasswordMethod = UserServiceGrpc.getModifyPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getModifyPasswordMethod = UserServiceGrpc.getModifyPasswordMethod) == null) {
          UserServiceGrpc.getModifyPasswordMethod = getModifyPasswordMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user.UserRequest, com.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user.UserService", "modifyPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("modifyPassword"))
                  .build();
          }
        }
     }
     return getModifyPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getRemoveUserMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getRemoveUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.UserRequest, com.grpc.user.UserResponse> getRemoveUserMethod;
    if ((getRemoveUserMethod = UserServiceGrpc.getRemoveUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveUserMethod = UserServiceGrpc.getRemoveUserMethod) == null) {
          UserServiceGrpc.getRemoveUserMethod = getRemoveUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user.UserRequest, com.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user.UserService", "removeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUser"))
                  .build();
          }
        }
     }
     return getRemoveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getModifyUserMethod;

  public static io.grpc.MethodDescriptor<com.grpc.user.UserRequest,
      com.grpc.user.UserResponse> getModifyUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.UserRequest, com.grpc.user.UserResponse> getModifyUserMethod;
    if ((getModifyUserMethod = UserServiceGrpc.getModifyUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getModifyUserMethod = UserServiceGrpc.getModifyUserMethod) == null) {
          UserServiceGrpc.getModifyUserMethod = getModifyUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.user.UserRequest, com.grpc.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.user.UserService", "modifyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("modifyUser"))
                  .build();
          }
        }
     }
     return getModifyUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserMethod(), responseObserver);
    }

    /**
     */
    public void addUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void modifyPassword(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyPasswordMethod(), responseObserver);
    }

    /**
     */
    public void removeUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserMethod(), responseObserver);
    }

    /**
     */
    public void modifyUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user.UserRequest,
                com.grpc.user.UserResponse>(
                  this, METHODID_LIST_USER)))
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user.UserRequest,
                com.grpc.user.UserResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getModifyPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user.UserRequest,
                com.grpc.user.UserResponse>(
                  this, METHODID_MODIFY_PASSWORD)))
          .addMethod(
            getRemoveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user.UserRequest,
                com.grpc.user.UserResponse>(
                  this, METHODID_REMOVE_USER)))
          .addMethod(
            getModifyUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.user.UserRequest,
                com.grpc.user.UserResponse>(
                  this, METHODID_MODIFY_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void listUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyPassword(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyUser(com.grpc.user.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.UserResponse listUser(com.grpc.user.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user.UserResponse addUser(com.grpc.user.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user.UserResponse modifyPassword(com.grpc.user.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user.UserResponse removeUser(com.grpc.user.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.user.UserResponse modifyUser(com.grpc.user.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.UserResponse> listUser(
        com.grpc.user.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.UserResponse> addUser(
        com.grpc.user.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.UserResponse> modifyPassword(
        com.grpc.user.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.UserResponse> removeUser(
        com.grpc.user.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.UserResponse> modifyUser(
        com.grpc.user.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USER = 0;
  private static final int METHODID_ADD_USER = 1;
  private static final int METHODID_MODIFY_PASSWORD = 2;
  private static final int METHODID_REMOVE_USER = 3;
  private static final int METHODID_MODIFY_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USER:
          serviceImpl.listUser((com.grpc.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.grpc.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PASSWORD:
          serviceImpl.modifyPassword((com.grpc.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER:
          serviceImpl.removeUser((com.grpc.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.UserResponse>) responseObserver);
          break;
        case METHODID_MODIFY_USER:
          serviceImpl.modifyUser((com.grpc.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.UserResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getListUserMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getModifyPasswordMethod())
              .addMethod(getRemoveUserMethod())
              .addMethod(getModifyUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
