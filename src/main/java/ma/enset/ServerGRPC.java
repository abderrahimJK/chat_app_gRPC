package ma.enset;

import ma.enset.services.ChatServices;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerGRPC {
    public static void main(String[] args) throws InterruptedException, IOException {
        ServerBuilder.forPort(2001).addService(new ChatServices()).build().start().awaitTermination();
    }
}
