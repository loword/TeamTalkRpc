package com.grpc.manager;

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
    comments = "Source: manager.proto")
public final class ManagerServiceGrpc {

  private ManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.manager.ManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getLoginMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getLoginMethod;
    if ((getLoginMethod = ManagerServiceGrpc.getLoginMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getLoginMethod = ManagerServiceGrpc.getLoginMethod) == null) {
          ManagerServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getAddManagerMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getAddManagerMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getAddManagerMethod;
    if ((getAddManagerMethod = ManagerServiceGrpc.getAddManagerMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getAddManagerMethod = ManagerServiceGrpc.getAddManagerMethod) == null) {
          ManagerServiceGrpc.getAddManagerMethod = getAddManagerMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "addManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("addManager"))
                  .build();
          }
        }
     }
     return getAddManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getModifyPasswordMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getModifyPasswordMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getModifyPasswordMethod;
    if ((getModifyPasswordMethod = ManagerServiceGrpc.getModifyPasswordMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getModifyPasswordMethod = ManagerServiceGrpc.getModifyPasswordMethod) == null) {
          ManagerServiceGrpc.getModifyPasswordMethod = getModifyPasswordMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "modifyPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("modifyPassword"))
                  .build();
          }
        }
     }
     return getModifyPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getRemoveManagerMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getRemoveManagerMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getRemoveManagerMethod;
    if ((getRemoveManagerMethod = ManagerServiceGrpc.getRemoveManagerMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getRemoveManagerMethod = ManagerServiceGrpc.getRemoveManagerMethod) == null) {
          ManagerServiceGrpc.getRemoveManagerMethod = getRemoveManagerMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "removeManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("removeManager"))
                  .build();
          }
        }
     }
     return getRemoveManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getListManagerMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getListManagerMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getListManagerMethod;
    if ((getListManagerMethod = ManagerServiceGrpc.getListManagerMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getListManagerMethod = ManagerServiceGrpc.getListManagerMethod) == null) {
          ManagerServiceGrpc.getListManagerMethod = getListManagerMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "listManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("listManager"))
                  .build();
          }
        }
     }
     return getListManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getGetInfoMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getGetInfoMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getGetInfoMethod;
    if ((getGetInfoMethod = ManagerServiceGrpc.getGetInfoMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getGetInfoMethod = ManagerServiceGrpc.getGetInfoMethod) == null) {
          ManagerServiceGrpc.getGetInfoMethod = getGetInfoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "getInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("getInfo"))
                  .build();
          }
        }
     }
     return getGetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getChangeRoleMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getChangeRoleMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getChangeRoleMethod;
    if ((getChangeRoleMethod = ManagerServiceGrpc.getChangeRoleMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getChangeRoleMethod = ManagerServiceGrpc.getChangeRoleMethod) == null) {
          ManagerServiceGrpc.getChangeRoleMethod = getChangeRoleMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "changeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("changeRole"))
                  .build();
          }
        }
     }
     return getChangeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getModifyMethod;

  public static io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest,
      com.grpc.manager.ManagerResponse> getModifyMethod() {
    io.grpc.MethodDescriptor<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse> getModifyMethod;
    if ((getModifyMethod = ManagerServiceGrpc.getModifyMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getModifyMethod = ManagerServiceGrpc.getModifyMethod) == null) {
          ManagerServiceGrpc.getModifyMethod = getModifyMethod = 
              io.grpc.MethodDescriptor.<com.grpc.manager.ManagerRequest, com.grpc.manager.ManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.manager.ManagerService", "modify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.manager.ManagerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("modify"))
                  .build();
          }
        }
     }
     return getModifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagerServiceStub newStub(io.grpc.Channel channel) {
    return new ManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void addManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddManagerMethod(), responseObserver);
    }

    /**
     */
    public void modifyPassword(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyPasswordMethod(), responseObserver);
    }

    /**
     */
    public void removeManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveManagerMethod(), responseObserver);
    }

    /**
     */
    public void listManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListManagerMethod(), responseObserver);
    }

    /**
     */
    public void getInfo(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    /**
     */
    public void changeRole(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeRoleMethod(), responseObserver);
    }

    /**
     */
    public void modify(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getAddManagerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_ADD_MANAGER)))
          .addMethod(
            getModifyPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_MODIFY_PASSWORD)))
          .addMethod(
            getRemoveManagerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_REMOVE_MANAGER)))
          .addMethod(
            getListManagerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_LIST_MANAGER)))
          .addMethod(
            getGetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_GET_INFO)))
          .addMethod(
            getChangeRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_CHANGE_ROLE)))
          .addMethod(
            getModifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.manager.ManagerRequest,
                com.grpc.manager.ManagerResponse>(
                  this, METHODID_MODIFY)))
          .build();
    }
  }

  /**
   */
  public static final class ManagerServiceStub extends io.grpc.stub.AbstractStub<ManagerServiceStub> {
    private ManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyPassword(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listManager(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfo(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRole(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modify(com.grpc.manager.ManagerRequest request,
        io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<ManagerServiceBlockingStub> {
    private ManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse login(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse addManager(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse modifyPassword(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse removeManager(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse listManager(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getListManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse getInfo(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse changeRole(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.manager.ManagerResponse modify(com.grpc.manager.ManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManagerServiceFutureStub extends io.grpc.stub.AbstractStub<ManagerServiceFutureStub> {
    private ManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> login(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> addManager(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> modifyPassword(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> removeManager(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> listManager(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> getInfo(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> changeRole(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.manager.ManagerResponse> modify(
        com.grpc.manager.ManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_ADD_MANAGER = 1;
  private static final int METHODID_MODIFY_PASSWORD = 2;
  private static final int METHODID_REMOVE_MANAGER = 3;
  private static final int METHODID_LIST_MANAGER = 4;
  private static final int METHODID_GET_INFO = 5;
  private static final int METHODID_CHANGE_ROLE = 6;
  private static final int METHODID_MODIFY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_ADD_MANAGER:
          serviceImpl.addManager((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PASSWORD:
          serviceImpl.modifyPassword((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MANAGER:
          serviceImpl.removeManager((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_LIST_MANAGER:
          serviceImpl.listManager((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_GET_INFO:
          serviceImpl.getInfo((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ROLE:
          serviceImpl.changeRole((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
          break;
        case METHODID_MODIFY:
          serviceImpl.modify((com.grpc.manager.ManagerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.manager.ManagerResponse>) responseObserver);
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

  private static abstract class ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.manager.ManagerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagerService");
    }
  }

  private static final class ManagerServiceFileDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier {
    ManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ManagerServiceMethodDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagerServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getAddManagerMethod())
              .addMethod(getModifyPasswordMethod())
              .addMethod(getRemoveManagerMethod())
              .addMethod(getListManagerMethod())
              .addMethod(getGetInfoMethod())
              .addMethod(getChangeRoleMethod())
              .addMethod(getModifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
