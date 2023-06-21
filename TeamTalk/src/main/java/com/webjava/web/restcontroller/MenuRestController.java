package com.webjava.web.restcontroller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wx on 2017/10/27.
 */


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.menu.Menu;
import com.grpc.menu.MenuRequest;
import com.grpc.menu.MenuResponse;
import com.grpc.menu.MenuServiceGrpc;
import com.webjava.model.menu_info;
import com.webjava.model.role_info;
import com.webjava.utils.HttpUtils;
import com.webjava.utils.ResponseInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


@RestController
@RequestMapping("/users")
public class MenuRestController {

    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    @RequestMapping(value="/menu/modify", method= RequestMethod.POST)
    public void modifyMenu(HttpServletRequest request, HttpServletResponse response){

        String strData=HttpUtils.getJsonBody(request);

        Gson gson = new Gson();
        menu_info menu=gson.fromJson(strData,menu_info.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        // Create a request
        MenuRequest modifyRequest = MenuRequest.newBuilder()
                .setMenuId(menu.getMenuId())
                .setMenuUrl(menu.getMenuUrl())
                .setMenuName(menu.getMenuName())
                .setParentId(menu.getParentId())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        MenuResponse modifyResponse = stub.modifyMenu(modifyRequest);

        if(modifyResponse.getStatusId()==0){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"修改成功!"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"修改失败!"));
        }

    }

    @RequestMapping(value = "/menu/add",method = RequestMethod.POST)
    public void addMenu(HttpServletRequest request, HttpServletResponse response){

        String  strJson= HttpUtils.getJsonBody(request);

        Gson gson=new Gson();

        menu_info menu=gson.fromJson(strJson,menu_info.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        // Create a request
        MenuRequest addMenuRequest = MenuRequest.newBuilder()
                .setParentId(menu.getParentId())
                .setMenuName(menu.getMenuName())
                .setMenuUrl(menu.getMenuUrl())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        MenuResponse adminResponse = stub.addMenu(addMenuRequest);

        if(adminResponse.getStatusId()==0){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"添加成功"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"内容存在"));
        }


    }

    @RequestMapping(value = "/menu/remove",method = RequestMethod.POST)
    public void removeMenu(HttpServletRequest request,HttpServletResponse response ) {

        String strjson = HttpUtils.getJsonBody(request);
        List<Integer> list=new ArrayList<Integer>();
        Type type = new TypeToken<ArrayList<Integer>>(){}.getType();
        list = new Gson().fromJson(strjson, type);


        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        MenuRequest.Builder builder = MenuRequest.newBuilder();
        // Create a request
        for (int i :list) {
            Menu.Builder bu = Menu.newBuilder();
            bu.setMenuId(i);
            Menu user =bu.build();
            builder.addMenu(user);
        }

        MenuRequest removeMenuRequest = builder.build();

        // Send the request using the stub
        System.out.println("Client sending request");
        MenuResponse userResponse = stub.removeMenu(removeMenuRequest);

        if (userResponse.getStatusId()==0) {
            HttpUtils.setJsonBody(response, new ResponseInfo(0, "删除成功！"));
        } else {
            HttpUtils.setJsonBody(response, new ResponseInfo(1, "部分信息未找到或未删除！"));
        }

    }

    @RequestMapping(value = "/menu/list",method = RequestMethod.GET)
    public void listMenu(HttpServletRequest request, HttpServletResponse response) throws InvalidProtocolBufferException, InvalidProtocolBufferException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        // Create a request
        MenuRequest listMenuRequest = MenuRequest.newBuilder().build();

        // Send the request using the stub
        System.out.println("Client sending request");
        MenuResponse menuResponse = stub.listMenu(listMenuRequest);


        if(menuResponse.getStatusId()==0){

            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(menuResponse);
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有用户",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }

    }

    @RequestMapping(value = "/getRoute",method = RequestMethod.GET)
    public void getRoute(HttpServletRequest request,HttpServletResponse response) throws InvalidProtocolBufferException {
        String token = request.getParameter("token");
        System.out.println(token);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        MenuRequest setRequest =MenuRequest.newBuilder()
                .setToken(token)
                .build();


        MenuResponse getResponse =stub.getRoute(setRequest);

        if(getResponse.getStatusId()==0){

            String data= JsonFormat.printer().preservingProtoFieldNames().print(getResponse);

            HttpUtils.setJsonBody(response,new ResponseInfo(0,"获取路由信息",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }


    }

    @RequestMapping(value = "/getMenu",method = RequestMethod.POST)
    public void getMenu(HttpServletRequest request,HttpServletResponse response) throws InvalidProtocolBufferException {
        String strData = HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        role_info role=gson.fromJson(strData,role_info.class);
        int id = role.getRoleId();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        MenuServiceGrpc.MenuServiceBlockingStub stub =
                MenuServiceGrpc.newBlockingStub(channel);

        MenuRequest setRequest =MenuRequest.newBuilder()
                .setId(id)
                .build();


        MenuResponse getResponse =stub.getMenu(setRequest);

        if(getResponse.getStatusId()==0){

            String data= JsonFormat.printer().preservingProtoFieldNames().print(getResponse);

            HttpUtils.setJsonBody(response,new ResponseInfo(0,"获取该角色权限",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }


    }

}