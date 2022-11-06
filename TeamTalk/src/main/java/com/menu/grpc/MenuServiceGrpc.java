package com.menu.grpc;

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
 * <pre>
 * Menu服务定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: menu.proto")
public final class MenuServiceGrpc {

  private MenuServiceGrpc() {}

  public static final String SERVICE_NAME = "com.menu.grpc.MenuService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_LIST_MENU =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "listMenu"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_ADD_MENU =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "addMenu"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_REMOVE_MENU =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "removeMenu"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_MODIFY_MENU =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "modifyMenu"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_GET_ROUTE =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "getRoute"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.menu.grpc.MenuRequest,
      com.menu.grpc.MenuResponse> METHOD_GET_MENU =
      io.grpc.MethodDescriptor.<com.menu.grpc.MenuRequest, com.menu.grpc.MenuResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.menu.grpc.MenuService", "getMenu"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.menu.grpc.MenuResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuServiceStub newStub(io.grpc.Channel channel) {
    return new MenuServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MenuServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MenuServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Menu服务定义
   * </pre>
   */
  public static abstract class MenuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MENU, responseObserver);
    }

    /**
     */
    public void addMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_MENU, responseObserver);
    }

    /**
     */
    public void removeMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_MENU, responseObserver);
    }

    /**
     */
    public void modifyMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_MENU, responseObserver);
    }

    /**
     */
    public void getRoute(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ROUTE, responseObserver);
    }

    /**
     */
    public void getMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MENU, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_MENU,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_LIST_MENU)))
          .addMethod(
            METHOD_ADD_MENU,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_ADD_MENU)))
          .addMethod(
            METHOD_REMOVE_MENU,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_REMOVE_MENU)))
          .addMethod(
            METHOD_MODIFY_MENU,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_MODIFY_MENU)))
          .addMethod(
            METHOD_GET_ROUTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_GET_ROUTE)))
          .addMethod(
            METHOD_GET_MENU,
            asyncUnaryCall(
              new MethodHandlers<
                com.menu.grpc.MenuRequest,
                com.menu.grpc.MenuResponse>(
                  this, METHODID_GET_MENU)))
          .build();
    }
  }

  /**
   * <pre>
   * Menu服务定义
   * </pre>
   */
  public static final class MenuServiceStub extends io.grpc.stub.AbstractStub<MenuServiceStub> {
    private MenuServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceStub(channel, callOptions);
    }

    /**
     */
    public void listMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MENU, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_MENU, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_MENU, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_MENU, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoute(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ROUTE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMenu(com.menu.grpc.MenuRequest request,
        io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MENU, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Menu服务定义
   * </pre>
   */
  public static final class MenuServiceBlockingStub extends io.grpc.stub.AbstractStub<MenuServiceBlockingStub> {
    private MenuServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.menu.grpc.MenuResponse listMenu(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MENU, getCallOptions(), request);
    }

    /**
     */
    public com.menu.grpc.MenuResponse addMenu(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_MENU, getCallOptions(), request);
    }

    /**
     */
    public com.menu.grpc.MenuResponse removeMenu(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_MENU, getCallOptions(), request);
    }

    /**
     */
    public com.menu.grpc.MenuResponse modifyMenu(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_MENU, getCallOptions(), request);
    }

    /**
     */
    public com.menu.grpc.MenuResponse getRoute(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ROUTE, getCallOptions(), request);
    }

    /**
     */
    public com.menu.grpc.MenuResponse getMenu(com.menu.grpc.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MENU, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Menu服务定义
   * </pre>
   */
  public static final class MenuServiceFutureStub extends io.grpc.stub.AbstractStub<MenuServiceFutureStub> {
    private MenuServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> listMenu(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MENU, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> addMenu(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_MENU, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> removeMenu(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_MENU, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> modifyMenu(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_MENU, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> getRoute(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ROUTE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.menu.grpc.MenuResponse> getMenu(
        com.menu.grpc.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MENU, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MENU = 0;
  private static final int METHODID_ADD_MENU = 1;
  private static final int METHODID_REMOVE_MENU = 2;
  private static final int METHODID_MODIFY_MENU = 3;
  private static final int METHODID_GET_ROUTE = 4;
  private static final int METHODID_GET_MENU = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MenuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MenuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MENU:
          serviceImpl.listMenu((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
          break;
        case METHODID_ADD_MENU:
          serviceImpl.addMenu((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MENU:
          serviceImpl.removeMenu((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MENU:
          serviceImpl.modifyMenu((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
          break;
        case METHODID_GET_MENU:
          serviceImpl.getMenu((com.menu.grpc.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.menu.grpc.MenuResponse>) responseObserver);
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

  private static final class MenuServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.menu.grpc.MenuOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MenuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_MENU)
              .addMethod(METHOD_ADD_MENU)
              .addMethod(METHOD_REMOVE_MENU)
              .addMethod(METHOD_MODIFY_MENU)
              .addMethod(METHOD_GET_ROUTE)
              .addMethod(METHOD_GET_MENU)
              .build();
        }
      }
    }
    return result;
  }
}
