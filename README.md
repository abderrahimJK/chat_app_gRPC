# chat_app_gRPC

This is a simple chat application that allows users to send messages to each other in real-time. The backend is built using gRPC Web Service with the proto file defined as below:

```
syntax="proto3";
option java_package="dev.elma.stubs";

service chatApp{
  rpc sendMsg(stream request) returns (stream request);
  rpc join(connect) returns (request);
  rpc leave(connect) returns(request);
}
message request{
  string msgFrom=1;
  string msgTo=2;
  string msg=3;
}
message User {
  string id=1;
  string name=2;
}

message connect{
  User user = 1;
}
```

## Features

    - Real-time messaging between users
    - Simple user console interface
    - User authentication
