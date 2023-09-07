package com.loword.java.server;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.user_area.UserAreaRequest;
import com.grpc.user_area.UserAreaResponse;
import com.grpc.user_area.UserAreaServiceGrpc;
import com.loword.java.kernel.entity.user_area;
import com.loword.java.service.UserAreaService;
import io.grpc.stub.StreamObserver;

/**
 * Created by lhj on 2023/07/27.
 */
public class UserAreaServerImpl extends UserAreaServiceGrpc.UserAreaServiceImplBase {
    private UserAreaService userAreaService;

    public UserAreaServerImpl(BeanContainer service) {
        this.userAreaService= service.userAreaService;
    }

    @Override
    public void listUserArea(UserAreaRequest request, StreamObserver<UserAreaResponse> responseStreamObserver){
        int currentId = request.getUserId();
        UserAreaResponse.Builder builder = UserAreaResponse.newBuilder();

        user_area uArea  =this.userAreaService.getById(currentId);
        if(uArea != null){
            Gson gson=new Gson();
            String  strJson = gson.toJson(uArea);
            try {
                JsonFormat.parser().merge(strJson,builder);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
            UserAreaResponse response = builder.setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);
        }else
        {
            UserAreaResponse response = UserAreaResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }


        responseStreamObserver.onCompleted();
    }
}
