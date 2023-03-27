package ma.enset.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: chat.proto")
public final class chatAppGrpc {

  private chatAppGrpc() {}

  public static final String SERVICE_NAME = "chatApp";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Chat.request,
          Chat.request> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMsg",
      requestType = Chat.request.class,
      responseType = Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Chat.request,
          Chat.request> getSendMsgMethod() {
    io.grpc.MethodDescriptor<Chat.request, Chat.request> getSendMsgMethod;
    if ((getSendMsgMethod = chatAppGrpc.getSendMsgMethod) == null) {
      synchronized (chatAppGrpc.class) {
        if ((getSendMsgMethod = chatAppGrpc.getSendMsgMethod) == null) {
          chatAppGrpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<Chat.request, Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chatApp", "sendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatAppMethodDescriptorSupplier("sendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Chat.connect,
          Chat.request> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "join",
      requestType = Chat.connect.class,
      responseType = Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Chat.connect,
          Chat.request> getJoinMethod() {
    io.grpc.MethodDescriptor<Chat.connect, Chat.request> getJoinMethod;
    if ((getJoinMethod = chatAppGrpc.getJoinMethod) == null) {
      synchronized (chatAppGrpc.class) {
        if ((getJoinMethod = chatAppGrpc.getJoinMethod) == null) {
          chatAppGrpc.getJoinMethod = getJoinMethod = 
              io.grpc.MethodDescriptor.<Chat.connect, Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chatApp", "join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.connect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatAppMethodDescriptorSupplier("join"))
                  .build();
          }
        }
     }
     return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Chat.connect,
          Chat.request> getLeveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "leve",
      requestType = Chat.connect.class,
      responseType = Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Chat.connect,
          Chat.request> getLeveMethod() {
    io.grpc.MethodDescriptor<Chat.connect, Chat.request> getLeveMethod;
    if ((getLeveMethod = chatAppGrpc.getLeveMethod) == null) {
      synchronized (chatAppGrpc.class) {
        if ((getLeveMethod = chatAppGrpc.getLeveMethod) == null) {
          chatAppGrpc.getLeveMethod = getLeveMethod = 
              io.grpc.MethodDescriptor.<Chat.connect, Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chatApp", "leve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.connect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatAppMethodDescriptorSupplier("leve"))
                  .build();
          }
        }
     }
     return getLeveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static chatAppStub newStub(io.grpc.Channel channel) {
    return new chatAppStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static chatAppBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new chatAppBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static chatAppFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new chatAppFutureStub(channel);
  }

  /**
   */
  public static abstract class chatAppImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<Chat.request> sendMsg(
        io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMsgMethod(), responseObserver);
    }

    /**
     */
    public void join(Chat.connect request,
                     io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    public void leve(Chat.connect request,
                     io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      asyncUnimplementedUnaryCall(getLeveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMsgMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                      Chat.request,
                      Chat.request>(
                  this, METHODID_SEND_MSG)))
          .addMethod(
            getJoinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Chat.connect,
                      Chat.request>(
                  this, METHODID_JOIN)))
          .addMethod(
            getLeveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Chat.connect,
                      Chat.request>(
                  this, METHODID_LEVE)))
          .build();
    }
  }

  /**
   */
  public static final class chatAppStub extends io.grpc.stub.AbstractStub<chatAppStub> {
    private chatAppStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatAppStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatAppStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatAppStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Chat.request> sendMsg(
        io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void join(Chat.connect request,
                     io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leve(Chat.connect request,
                     io.grpc.stub.StreamObserver<Chat.request> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class chatAppBlockingStub extends io.grpc.stub.AbstractStub<chatAppBlockingStub> {
    private chatAppBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatAppBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatAppBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatAppBlockingStub(channel, callOptions);
    }

    /**
     */
    public Chat.request join(Chat.connect request) {
      return blockingUnaryCall(
          getChannel(), getJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public Chat.request leve(Chat.connect request) {
      return blockingUnaryCall(
          getChannel(), getLeveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class chatAppFutureStub extends io.grpc.stub.AbstractStub<chatAppFutureStub> {
    private chatAppFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatAppFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatAppFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatAppFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Chat.request> join(
        Chat.connect request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Chat.request> leve(
        Chat.connect request) {
      return futureUnaryCall(
          getChannel().newCall(getLeveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOIN = 0;
  private static final int METHODID_LEVE = 1;
  private static final int METHODID_SEND_MSG = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final chatAppImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(chatAppImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN:
          serviceImpl.join((Chat.connect) request,
              (io.grpc.stub.StreamObserver<Chat.request>) responseObserver);
          break;
        case METHODID_LEVE:
          serviceImpl.leve((Chat.connect) request,
              (io.grpc.stub.StreamObserver<Chat.request>) responseObserver);
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
        case METHODID_SEND_MSG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMsg(
              (io.grpc.stub.StreamObserver<Chat.request>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class chatAppBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    chatAppBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("chatApp");
    }
  }

  private static final class chatAppFileDescriptorSupplier
      extends chatAppBaseDescriptorSupplier {
    chatAppFileDescriptorSupplier() {}
  }

  private static final class chatAppMethodDescriptorSupplier
      extends chatAppBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    chatAppMethodDescriptorSupplier(String methodName) {
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
      synchronized (chatAppGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new chatAppFileDescriptorSupplier())
              .addMethod(getSendMsgMethod())
              .addMethod(getJoinMethod())
              .addMethod(getLeveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
