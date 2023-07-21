package com.webjava.web.restcontroller;
/**
 * Created by wx on 2017/10/27.
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.group.Group;
import com.grpc.group.GroupRequest;
import com.grpc.group.GroupResponse;
import com.grpc.group.GroupServiceGrpc;
import com.webjava.kernel.entity.IMGroup;
import com.webjava.utils.HttpUtils;
import com.webjava.utils.ResponseInfo;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
public class GroupRestController {

    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    @RequestMapping(value = "/group/list",method = RequestMethod.GET)
    public void listGroup(HttpServletRequest request, HttpServletResponse response) throws InvalidProtocolBufferException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();
        // Create a blocking stub with the channel
        GroupServiceGrpc.GroupServiceBlockingStub stub =
                GroupServiceGrpc.newBlockingStub(channel);

        // Create a request
        GroupRequest listGroupRequest = GroupRequest.newBuilder().build();

        System.out.println("Client sending request");
        GroupResponse groupResponse = stub.listGroup(listGroupRequest);

        if(groupResponse.getStatusId()==1){

            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(groupResponse);

            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有群组",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }
    }

    @RequestMapping(value = "/group/add",method = RequestMethod.POST)
    public void addGroup(HttpServletRequest request, HttpServletResponse response){

        String  strJson= HttpUtils.getJsonBody(request);

        Gson gson=new Gson();

        IMGroup group=gson.fromJson(strJson,IMGroup.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        GroupServiceGrpc.GroupServiceBlockingStub stub =
                GroupServiceGrpc.newBlockingStub(channel);

        // Create a request
        GroupRequest addGroupRequest = GroupRequest.newBuilder()
                .setName(group.getName())
                .setUserCnt(group.getUserCnt())
                .setCreator(group.getCreator())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        GroupResponse groupResponse = stub.addGroup(addGroupRequest);

        if(groupResponse.getStatusId()==0){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"添加用户成功！"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"用户名已存在！"));
        }
    }

    @RequestMapping(value = "/group/remove",method = RequestMethod.POST)
    public void removeGroup(HttpServletRequest request,HttpServletResponse response ){

        String strjson = HttpUtils.getJsonBody(request);
        List<Integer> list=new ArrayList<Integer>();
        Type type = new TypeToken<ArrayList<Integer>>(){}.getType();
        list = new Gson().fromJson(strjson, type);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        GroupServiceGrpc.GroupServiceBlockingStub stub =
                GroupServiceGrpc.newBlockingStub(channel);

        GroupRequest.Builder builder = GroupRequest.newBuilder();

        for(int i : list){
            Group.Builder bu = Group.newBuilder();
            bu.setId(i);
            Group group =bu.build();
            builder.addGroup(group);
        }

        GroupRequest removeGroupRequest = builder.build();

        // Send the request using the stub
        System.out.println("Client sending request");
        GroupResponse groupResponse = stub.removeGroup(removeGroupRequest);

        if (groupResponse.getStatusId()==1) {
            HttpUtils.setJsonBody(response, new ResponseInfo(0, "删除成功！"));
        } else {
            HttpUtils.setJsonBody(response, new ResponseInfo(1, "无此ID信息！"));
        }
    }

    @RequestMapping(value = "/group/update",method = RequestMethod.POST)
    public void updateGroup (HttpServletRequest request,HttpServletResponse response){
        String strData =HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        IMGroup group = gson.fromJson(strData,IMGroup.class);


        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        GroupServiceGrpc.GroupServiceBlockingStub stub =
                GroupServiceGrpc.newBlockingStub(channel);

        // Create a request
        GroupRequest modifyGroupRequest = GroupRequest.newBuilder()
                .setId(group.getId())
                .setName(group.getName())
                .setUserCnt(group.getUserCnt())
                .setUpdated(group.getUpdated())
                .setAvatar(group.getAvatar())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        GroupResponse groupResponse = stub.modifyGroup(modifyGroupRequest);

        if(groupResponse.getStatusId()==1){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"更新群组信息成功！"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"群组不存在"));
        }
    }

}