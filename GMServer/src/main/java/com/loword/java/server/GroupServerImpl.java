package com.loword.java.server;

import com.google.gson.Gson;
import com.grpc.depart.Depart;
import com.grpc.depart.DepartRequest;
import com.grpc.depart.DepartResponse;
import com.grpc.discovery.Discovery;
import com.grpc.discovery.DiscoveryRequest;
import com.grpc.discovery.DiscoveryResponse;
import com.grpc.group.Group;
import com.grpc.group.GroupRequest;
import com.grpc.group.GroupResponse;
import com.grpc.group.GroupServiceGrpc;
import com.loword.java.kernel.entity.IMDepart;
import com.loword.java.kernel.entity.IMDiscovery;
import com.loword.java.kernel.entity.IMGroup;
import com.loword.java.service.IGroupService;

import io.grpc.stub.StreamObserver;

import java.util.List;

/**
 * Created by wx on 2017/11/9.
 */
public class GroupServerImpl extends GroupServiceGrpc.GroupServiceImplBase {
    private IGroupService groupService;

    public GroupServerImpl(BeanContainer service) {
        this.groupService= service.groupService;
    }

    @Override
    public void listGroup(GroupRequest request, StreamObserver<GroupResponse> responseStreamObserver){
        GroupResponse.Builder builder = GroupResponse.newBuilder();

        List<IMGroup> groupList =this.groupService.getAllGroup();

        if(groupList.size()>0){
            for(IMGroup group:groupList){
                Group.Builder bu = Group.newBuilder();

                bu.setId(group.getId());
                bu.setName(group.getName());
                bu.setCreator(group.getCreator());
                bu.setUserCnt(group.getUsercnt());
                bu.setStatus(group.getStatus());
                bu.setCreated(group.getCreated());
                bu.setUpdated(group.getUpdated());

                Group ab = bu.build();
                builder.addGroup(ab);
            }
            GroupResponse response = builder.setStatusId(1).build();

            responseStreamObserver.onNext(response);
        } else {
            GroupResponse response = GroupResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }
        responseStreamObserver.onCompleted();
    }

    @Override
    public void addGroup(GroupRequest request, StreamObserver<GroupResponse> responseStreamObserver){

        int id=request.getId();
        String groupName=request.getName();
        IMGroup group=new IMGroup();

        IMGroup existgroup =this.groupService.getGroupByName(groupName);
        if(existgroup !=null){
            System.out.println("用户名已存在！");
            GroupResponse response = GroupResponse.newBuilder()
                    .setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);

        } else {
            group.setName(groupName);
            group.setCreator(request.getCreator());
            group.setCreated((int) (System.currentTimeMillis()/1000));
            group.setType((byte) 2);
            this.groupService.addGroup(group);
            System.out.println("添加成功");
            GroupResponse response = GroupResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }

        responseStreamObserver.onCompleted();
    }


    @Override
    public void removeGroup(GroupRequest request, StreamObserver<GroupResponse> responseStreamObserver){
        List<Group> groupIds=request.getGroupList();

        int status = 0;
        int removeCount=0;
        for (Group ids:groupIds) {
            IMGroup exitId = this.groupService.getGroupById(ids.getId());
            if(exitId!=null){
                this.groupService.deleteGroup(exitId.getId());
                removeCount++;
            }else {
                System.out.println("数据库没有该数据-->id为:"+ids.getId());
            }
        }
        if(removeCount==groupIds.size())
            status=1;

        GroupResponse response = GroupResponse.newBuilder()
                .setStatusId(status)
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void modifyGroup(GroupRequest request, StreamObserver<GroupResponse> responseStreamObserver){
        int id=request.getId();
        String name=request.getName();
        String avatar=request.getAvatar();
        int usercnt = request.getUserCnt();
        int updated = request.getUpdated();

        IMGroup existGroup =this.groupService.getGroupById(id);
        if(existGroup !=null){
            existGroup.setName(name);
            existGroup.setAvatar(avatar);
            existGroup.setUsercnt(usercnt);
            existGroup.setUpdated(updated);
            existGroup.setVersion(existGroup.getVersion() + 1);
            this.groupService.updateGroup(existGroup);
            System.out.println("修改成功");
            GroupResponse response = GroupResponse.newBuilder()
                    .setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);
        } else {
            System.out.println("群组不存在");
            GroupResponse response = GroupResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }

        responseStreamObserver.onCompleted();
    }
}
