package com.webjava.web.restcontroller;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.user_area.UserAreaRequest;
import com.grpc.user_area.UserAreaResponse;
import com.grpc.user_area.UserAreaServiceGrpc;
import com.webjava.utils.HttpUtils;
import com.webjava.utils.ResponseInfo;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/users")
public class UserAreaController {
    private static final String HOST = "localhost";
    private static final int PORT = 50051;
    @RequestMapping(value = "/user_area/get",method = RequestMethod.GET)
    public void listArea(HttpServletRequest request, HttpServletResponse response ) throws InvalidProtocolBufferException {
        Integer userId = Integer.valueOf(request.getParameter("id"));
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        UserAreaServiceGrpc.UserAreaServiceBlockingStub stub =
                UserAreaServiceGrpc.newBlockingStub(channel);

        // Create a request
        UserAreaRequest userAreaRequest = UserAreaRequest.newBuilder()
                .setUserId(userId).build();

        // Send the request using the stub
        System.out.println("Client sending request");
        UserAreaResponse userAreaResponse = stub.listUserArea(userAreaRequest);

        if(userAreaResponse.getStatusId()==1){
            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(userAreaResponse);

            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有用户",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }
    }

}
