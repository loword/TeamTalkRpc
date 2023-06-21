package com.loword.java.server;


import com.grpc.role_menu.RPRequest;
import com.grpc.role_menu.RPResponse;
import com.grpc.role_menu.RPServiceGrpc;
import com.loword.java.service.Role_MenuService;

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
