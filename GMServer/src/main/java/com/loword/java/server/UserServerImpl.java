package com.loword.java.server;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.grpc.user.User;
import com.grpc.user.UserRequest;
import com.grpc.user.UserResponse;
import com.grpc.user.UserServiceGrpc;
import com.loword.java.kernel.entity.IMUser;
import com.loword.java.kernel.entity.user_area;
import com.loword.java.service.IUserService;
import com.loword.java.service.UserAreaService;
import io.grpc.stub.StreamObserver;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wx on 2017/11/9.
 */
public class UserServerImpl extends UserServiceGrpc.UserServiceImplBase {
    private IUserService userService;

    public UserServerImpl(BeanContainer service) {
        this.userService= service.userService;
    }

    @Override
    public void addUser(UserRequest request, StreamObserver<UserResponse> responseStreamObserver){
        String name=request.getName();
        IMUser user=new IMUser();
        user_area uarea=new user_area();

        IMUser existUser =this.userService.getUserByName(name);
        if(existUser !=null){
            System.out.println("用户已存在");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);
        }  else {
            /*user.setName(name);
            user.setSex((byte)request.getSex());
            user.setNick(request.getNick());
            user.setPassword(request.getPassword());
            user.setSalt(request.getSalt());
            user.setPhone(request.getPhone());
            user.setEmail(request.getEmail());
            user.setdepartid(request.getDepartid());
            uarea.setAreaType(request.getAreaType());
            uarea.setProvinceCode(request.getProvinceCode());
            uarea.setCityCode(request.getCityCode());
            uarea.setCountyCode(request.getCountyCode());
            uarea.setCounty(request.getCounty());
            uarea.setTownCode(request.getTownCode());
            uarea.setTown(request.getTown());
            uarea.setVillageCode(request.getVillageCode());
            uarea.setVillage(request.getVillage());*/
            String strData= null;
            try {
                strData = JsonFormat.printer().preservingProtoFieldNames().print(request);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
            Gson gson=new Gson();
            user=gson.fromJson(strData,IMUser.class);
            uarea=gson.fromJson(strData,user_area.class);
            this.userService.addUser(user,uarea);
            System.out.println("添加成功");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }

        responseStreamObserver.onCompleted();
    }

    @Override
    public void modifyUser(UserRequest request, StreamObserver<UserResponse> responseStreamObserver){

        int id=request.getId();

        IMUser existUser =this.userService.getUserById(id);
        if(existUser !=null){
            existUser.setName(request.getName());
            existUser.setSex((byte)request.getSex());
            existUser.setNick(request.getNick());
            existUser.setPhone(request.getPhone());
            existUser.setEmail(request.getEmail());
            existUser.setdepartid(request.getDepartid());

            String strData= null;
            try {
                strData = JsonFormat.printer().preservingProtoFieldNames().print(request);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
            Gson gson=new Gson();
            user_area uarea=gson.fromJson(strData,user_area.class);
            this.userService.updateUser(existUser,uarea);
            System.out.println("修改成功");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);

        }
        else{
            System.out.println("内容不存在");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }

        responseStreamObserver.onCompleted();
    }


    @Override
    public void listUser(UserRequest request, StreamObserver<UserResponse> responseStreamObserver){
        int currentPage = request.getCurPage();
        int pageSize = request.getPageSize();
        UserResponse.Builder builder = UserResponse.newBuilder();
        Map<String,Object> paraMap = new HashMap<String,Object>();
        paraMap.put("curPage",(currentPage-1)*pageSize);
        paraMap.put("pageSize",pageSize);

        Integer sumNum  =this.userService.getCountUser();
        java.util.List<IMUser> data  =this.userService.getAllUser(paraMap);
        if(data.size()>0){
            for(int i=0;i<data.size();i++){
                User.Builder bu=User.newBuilder();

                bu.setId(data.get(i).getId());
                bu.setName(data.get(i).getName());
                bu.setSex(data.get(i).getSex());
                bu.setNick(data.get(i).getNick());
                bu.setPassword(data.get(i).getPassword());
                bu.setSalt(data.get(i).getSalt());
                bu.setPhone(data.get(i).getPhone());
                bu.setEmail(data.get(i).getEmail());
                bu.setDepartid(data.get(i).getdepartid());

                User ab = bu.build();
                builder.addUser(ab);
            }
            UserResponse response = builder.setStatusId(1)
                    .setTotal(sumNum)
                    .build();

            responseStreamObserver.onNext(response);
        }else
        {
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }


        responseStreamObserver.onCompleted();
    }


    @Override
    public void removeUser(UserRequest request,StreamObserver<UserResponse> responseStreamObserver){

        List<User> disId=request.getUserList();

        int status=0;
        int removeCount=0;
        for (User ids:disId) {
            IMUser exitId = this.userService.getUserById(ids.getId());

            if(exitId!=null){
                this.userService.deleteUser(exitId.getId());
                removeCount++;
            }else
            {
                System.out.println("数据库没有该数据-->id为:"+exitId.getId());
            }
        }

        if(removeCount==disId.size())
            status =1;

        UserResponse response = UserResponse.newBuilder()
                .setStatusId(status)
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }


    @Override
    public void modifyPassword(UserRequest request, StreamObserver<UserResponse> responseStreamObserver){

        int id=request.getId();

        IMUser existUser =this.userService.getUserById(id);
        if(existUser !=null){
            existUser.setPassword(request.getPassword());
            existUser.setSalt(request.getSalt());
            this.userService.updatePassword(existUser);
            System.out.println("修改成功");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(1)
                    .build();
            responseStreamObserver.onNext(response);

        }
        else{
            System.out.println("内容不存在");
            UserResponse response = UserResponse.newBuilder()
                    .setStatusId(0)
                    .build();
            responseStreamObserver.onNext(response);
        }

        responseStreamObserver.onCompleted();
    }




}
