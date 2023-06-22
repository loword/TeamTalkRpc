package com.grpc.group;

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
    comments = "Source: group.proto")
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.group.GroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> METHOD_LIST_GROUP =
      io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.group.GroupService", "listGroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> METHOD_ADD_GROUP =
      io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.group.GroupService", "addGroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> METHOD_REMOVE_GROUP =
      io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.group.GroupService", "removeGroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.group.GroupRequest,
      com.grpc.group.GroupResponse> METHOD_MODIFY_GROUP =
      io.grpc.MethodDescriptor.<com.grpc.group.GroupRequest, com.grpc.group.GroupResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.group.GroupService", "modifyGroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.group.GroupResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP, responseObserver);
    }

    /**
     */
    public void addGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_GROUP, responseObserver);
    }

    /**
     */
    public void removeGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_GROUP, responseObserver);
    }

    /**
     */
    public void modifyGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_GROUP, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_LIST_GROUP)))
          .addMethod(
            METHOD_ADD_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_ADD_GROUP)))
          .addMethod(
            METHOD_REMOVE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_REMOVE_GROUP)))
          .addMethod(
            METHOD_MODIFY_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.group.GroupRequest,
                com.grpc.group.GroupResponse>(
                  this, METHODID_MODIFY_GROUP)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void listGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyGroup(com.grpc.group.GroupRequest request,
        io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_GROUP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.group.GroupResponse listGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse addGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_GROUP, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse removeGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_GROUP, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.group.GroupResponse modifyGroup(com.grpc.group.GroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_GROUP, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> listGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> addGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_GROUP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> removeGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_GROUP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.group.GroupResponse> modifyGroup(
        com.grpc.group.GroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_GROUP, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUP = 0;
  private static final int METHODID_ADD_GROUP = 1;
  private static final int METHODID_REMOVE_GROUP = 2;
  private static final int METHODID_MODIFY_GROUP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GROUP:
          serviceImpl.listGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_ADD_GROUP:
          serviceImpl.addGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_GROUP:
          serviceImpl.removeGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
          break;
        case METHODID_MODIFY_GROUP:
          serviceImpl.modifyGroup((com.grpc.group.GroupRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.group.GroupResponse>) responseObserver);
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

  private static final class GroupServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.group.GroupOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_GROUP)
              .addMethod(METHOD_ADD_GROUP)
              .addMethod(METHOD_REMOVE_GROUP)
              .addMethod(METHOD_MODIFY_GROUP)
              .build();
        }
      }
    }
    return result;
  }
}
