package com.loword.java.server;

import com.grpc.group.GroupRequest;
import com.grpc.group.GroupResponse;
import com.grpc.group.GroupServiceGrpc;
import com.loword.java.service.IGroupService;

import io.grpc.stub.StreamObserver;

/**
 * Created by wx on 2017/11/9.
 */
public class GroupServerImpl extends GroupServiceGrpc.GroupServiceImplBase {
    private IGroupService groupService;

    public GroupServerImpl(BeanContainer service) {
        this.groupService= service.groupService;
    }

    @Override
    public void addGroup(GroupRequest request, StreamObserver<GroupResponse> responseStreamObserver){



        responseStreamObserver.onCompleted();
    }



}
