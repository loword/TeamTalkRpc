package com.webjava.web.restcontroller;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.area.AreaRequest;
import com.grpc.area.AreaResponse;
import com.grpc.area.AreaServiceGrpc;
import com.webjava.kernel.entity.SysArea;
import com.webjava.utils.HttpUtils;
import com.webjava.utils.ResponseInfo;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;


@RestController
@RequestMapping("/users")
public class AreaRestController {


    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    @RequestMapping(value = "/area/list",method = RequestMethod.POST)
    public void listArea(HttpServletRequest request, HttpServletResponse response) throws InvalidProtocolBufferException, InvalidProtocolBufferException {
        String strData =HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        SysArea area=gson.fromJson(strData,SysArea.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        AreaServiceGrpc.AreaServiceBlockingStub stub =
                AreaServiceGrpc.newBlockingStub(channel);

       AreaRequest.Builder builder = AreaRequest.newBuilder();
        // Create a request
        if(area != null) {
            builder.setLevelCode(area.getLevelCode())
                    .setAreaCode(area.getAreaCode())
                    .setName(area.getName())
                    .setPinyin(area.getPinyin());
        }
        AreaRequest listAreaRequest = builder.build();

        // Send the request using the stub
        System.out.println("Client sending request");
        AreaResponse areaResponse = stub.listArea(listAreaRequest);


        if(areaResponse.getAreaList().size() > 0){
            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(areaResponse);
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有省份",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }

    }


    @RequestMapping(value = "/area/getArea",method = RequestMethod.POST)
    public void getArea(HttpServletRequest request, HttpServletResponse response) throws InvalidProtocolBufferException, InvalidProtocolBufferException {

        String strData =HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        SysArea area=gson.fromJson(strData,SysArea.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        AreaServiceGrpc.AreaServiceBlockingStub stub =
                AreaServiceGrpc.newBlockingStub(channel);

        AreaRequest.Builder builder = AreaRequest.newBuilder();
        // Create a request
        if(area != null) {
            builder.setId(area.getId());
        }

        // Create a request
        AreaRequest listAreaRequest = builder.build();

        // Send the request using the stub
        System.out.println("Client sending request");
        AreaResponse areaResponse = stub.getArea(listAreaRequest);


        if(areaResponse.getAreaList().size() > 0){
            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(areaResponse);
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有城市",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }

    }

    @RequestMapping(value = "/area/listChild",method = RequestMethod.POST)
    public void listAreaChild(HttpServletRequest request, HttpServletResponse response) throws InvalidProtocolBufferException, InvalidProtocolBufferException {

        /*String strData =HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        SysArea area=gson.fromJson(strData,SysArea.class);*/
        String cityCode = request.getParameter("cityCode");

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        AreaServiceGrpc.AreaServiceBlockingStub stub =
                AreaServiceGrpc.newBlockingStub(channel);

        // Create a request
        AreaRequest listAreaRequest = AreaRequest.newBuilder()
                .setId(Integer.valueOf(cityCode))
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        AreaResponse areaResponse = stub.getAreaTree(listAreaRequest);


        if(areaResponse.getAreaList().size() > 0){

            String data= JsonFormat.printer().includingDefaultValueFields().preservingProtoFieldNames().print(areaResponse);

            HttpUtils.setJsonBody(response,new ResponseInfo(0,"显示所有省份",data));
        }else
        {
            System.out.println("nothing");
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"无内容"));
        }

    }

    @RequestMapping(value = "/area/add",method = RequestMethod.POST)
    public void addUser(HttpServletRequest request, HttpServletResponse response){

        String saltStr = Integer.toString(new Random().nextInt(10000));
        String  strJson= HttpUtils.getJsonBody(request);

        Gson gson=new Gson();

        SysArea area=gson.fromJson(strJson,SysArea.class);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        AreaServiceGrpc.AreaServiceBlockingStub stub =
                AreaServiceGrpc.newBlockingStub(channel);

        // Create a request
        AreaRequest addUserRequest = AreaRequest.newBuilder()
                .setLevelCode(area.getLevelCode())
                .setParentCode(area.getParentCode())
                .setAreaCode(area.getAreaCode())
                .setName(area.getName())
                .setShortName(area.getShortName())
                .setPinyin(area.getPinyin())
                .setLng(area.getLng())
                .setLat(area.getLat())
                .setRemark(area.getRemark())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        AreaResponse areaResponse = stub.addArea(addUserRequest);

        if(areaResponse.getShortName() == null){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"添加成功"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"地区存在"));
        }


    }

    @RequestMapping(value = "/area/update",method = RequestMethod.POST)
    public void updateUser (HttpServletRequest request,HttpServletResponse response){
        String strData =HttpUtils.getJsonBody(request);
        Gson gson=new Gson();
        SysArea area=gson.fromJson(strData,SysArea.class);


        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext(true)
                .build();

        // Create a blocking stub with the channel
        AreaServiceGrpc.AreaServiceBlockingStub stub =
                AreaServiceGrpc.newBlockingStub(channel);

        // Create a request
        AreaRequest modifyAreaRequest = AreaRequest.newBuilder()
                .setLevelCode(area.getLevelCode())
                .setParentCode(area.getParentCode())
                .setAreaCode(area.getAreaCode())
                .setName(area.getName())
                .setShortName(area.getShortName())
                .setPinyin(area.getPinyin())
                .setLng(area.getLng())
                .setLat(area.getLat())
                .setRemark(area.getRemark())
                .build();

        // Send the request using the stub
        System.out.println("Client sending request");
        AreaResponse areaResponse = stub.modifyArea(modifyAreaRequest);

        if(areaResponse.getShortName() == null){
            HttpUtils.setJsonBody(response,new ResponseInfo(0,"修改成功"));
        }else
        {
            HttpUtils.setJsonBody(response,new ResponseInfo(1,"内容不存在"));
        }
    }

}