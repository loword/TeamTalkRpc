package com.grpc.java.server;


import com.grpc.java.service.Role_MenuService;
import com.role_menu.grpc.RPRequest;
import com.role_menu.grpc.RPResponse;
import com.role_menu.grpc.RPServiceGrpc;
import io.grpc.stub.StreamObserver;


/**
 * Created by wx on 2017/11/8.
 */

public class RPServerImpl extends RPServiceGrpc.RPServiceImplBase {
    private Role_MenuService role_menuService;

    public RPServerImpl(BeanContainer service) {
        this.role_menuService= service.role_menuService;
    }

    @Override
    public void addRP(RPRequest request, StreamObserver<RPResponse> responseStreamObserver){

    }

    @Override
    public void modifyRP(RPRequest request, StreamObserver<RPResponse> responseStreamObserver){

    }

    @Override
    public void listRP(RPRequest request, StreamObserver<RPResponse> responseStreamObserver){

    }

    @Override
    public void removeRP(RPRequest request,StreamObserver<RPResponse> responseStreamObserver){

    }


}
