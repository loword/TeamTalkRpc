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
@RequestMapping("/tianyuan")
public class TianYuanController {

    @RequestMapping(value = "/version",method = RequestMethod.GET)
    public void listArea(HttpServletRequest request, HttpServletResponse response ) throws InvalidProtocolBufferException {
        String data= "20231027";
        HttpUtils.setJsonBody(response,new ResponseInfo(0,"版本获取成功",data));
    }

}
