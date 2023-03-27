package ma.enset.users;

import ma.enset.stubs.Chat;
import ma.enset.stubs.chatAppGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IOException {
        ManagedChannel localhost = ManagedChannelBuilder.forAddress("localhost", 2001).usePlaintext().build();
        chatAppGrpc.chatAppStub chatStub = chatAppGrpc.newStub(localhost);

        String username;
        String message;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Username : ");
        username=scanner.next();
        System.out.println(username+ " connected");
        System.out.println("Tape (Q) to disconnect");;


       StreamObserver<Chat.request> send = chatStub.sendMsg(new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {
                String messageFrom = request.getMsgFrom();
                String message = request.getMsg();
                System.out.println(messageFrom+" : "+message);
            }

           @Override
           public void onError(Throwable throwable) {}

           @Override
           public void onCompleted() {}
       });

       while (true){
           System.out.println("---------------------------------------------");
           System.out.print("Message To : ");
           String messageTo=scanner.next();
           scanner.nextLine();
           System.out.print("Message : ");
           message=scanner.nextLine();
           System.out.println(message);
           if(message.equals("q")) {
               Chat.connect disconnect = Chat.connect.newBuilder().setUser(Chat.User.newBuilder().setName(username)).build();
               chatStub.leve(disconnect, new StreamObserver<Chat.request>() {
                   @Override
                   public void onNext(Chat.request request) {
                       System.out.println(request.getMsg());
                   }

                   @Override
                   public void onError(Throwable throwable) {

                   }

                   @Override
                   public void onCompleted() {

                   }
               });
               //System.in.read();
               break;
           }
           Chat.request request = Chat.request.newBuilder().setMsgFrom(username).setMsgTo(messageTo).setMsg(message).build();
           send.onNext(request);
       }
    }
}
