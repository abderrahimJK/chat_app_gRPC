package ma.enset.services;

import ma.enset.stubs.Chat;
import ma.enset.stubs.chatAppGrpc;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;

public class ChatServices  extends chatAppGrpc.chatAppImplBase{
    HashMap<String,StreamObserver<Chat.request>> userobservers =new HashMap<>();


    @Override
    public void leve(Chat.connect request, StreamObserver<Chat.request> responseObserver) {
        Chat.User user = request.getUser();
        userobservers.get(user.getName()).onCompleted();
        userobservers.remove(user.getName());
        Chat.request serverRep = Chat.request.newBuilder().setMsgFrom("Server").setMsg("You are disconnected").build();
        responseObserver.onNext(serverRep);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Chat.request> sendMsg(StreamObserver<Chat.request> responseObserver) {
        return new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {
                String messageFrom = request.getMsgFrom();
                String messageTo = request.getMsgTo();
                if(!userobservers.containsKey(messageFrom)){
                    userobservers.put(messageFrom,responseObserver);
                }

                if(messageTo.isEmpty()){
//                    for(String s : userobservers.keySet()){
//                        if(!s.equals(messageFrom))
//                            userobservers.get(s).onNext(request);
//                    }
                    userobservers.forEach((user, stream)->{
                        if(!user.equals(messageFrom))
                            userobservers.get(user).onNext(request);
                    });
                }
                else if(userobservers.containsKey(messageTo)){
                    StreamObserver<Chat.request> requestStreamObserver = userobservers.get(messageTo);
                    requestStreamObserver.onNext(request);
                }
            }
            @Override
            public void onError(Throwable throwable) {}
            @Override
            public void onCompleted() {}
        };
    }
}
