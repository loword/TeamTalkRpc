package com.loword.java.server;

import java.util.ArrayList;
import java.util.List;

import com.grpc.role.Role;
import com.grpc.role.RoleRequest;
import com.grpc.role.RoleResponse;
import com.grpc.role.RoleServiceGrpc;
import com.loword.java.kernel.entity.manager_info;
import com.loword.java.kernel.entity.manager_role_info;
import com.loword.java.kernel.entity.role_info;
import com.loword.java.kernel.entity.role_menu_info;
import com.loword.java.service.ManagerService;
import com.loword.java.service.Manager_RoleService;
import com.loword.java.service.RoleService;
import com.loword.java.service.Role_MenuService;

import io.grpc.stub.StreamObserver;


/**
 * Created by wx on 2017/11/8.
 */

public class RoleServerImpl extends RoleServiceGrpc.RoleServiceImplBase {
    private RoleService roleService;
    private Role_MenuService  role_menuService;
    private ManagerService managerService;
    private Manager_RoleService manager_roleService;

    public RoleServerImpl(BeanContainer service) {
        this.roleService=service.roleService;
        this.role_menuService=service.role_menuService;
        this.managerService=service.managerService;
        this.manager_roleService=service.manager_roleService;
    }

    @Override
    public void addRole(RoleRequest request, StreamObserver<RoleResponse> responseStreamObserver){
        String name=request.getRoleName();
        int status=-1;

        role_info role=roleService.getName(name);
        if(role!=null){
            status=1;
        }else {
            role_info ri =new role_info();
            ri.setRoleName(name);
            roleService.add(ri);
            status=0;
        }

        RoleResponse response = RoleResponse.newBuilder()
                .setStatusId(status)
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void modifyRole(RoleRequest request, StreamObserver<RoleResponse> responseStreamObserver){
        int id=request.getRoleId();
        int status=-1;

        role_info role=roleService.getId(id);
        if(role!=null){
            role.setRoleName(request.getRoleName());
            roleService.update(role);
            status=0;
        }
        else {
            status=1;
        }

        RoleResponse response=RoleResponse.newBuilder()
                .setStatusId(status)
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void listRole(RoleRequest request, StreamObserver<RoleResponse> responseStreamObserver){
        List<role_info> data =roleService.getAll();
        RoleResponse.Builder builder=RoleResponse.newBuilder();
        int status=-1;

        if(data.size()>0){
            for(role_info ri :data) {
                Role.Builder bu = Role.newBuilder();
                bu.setRoleId(ri.getRoleId());
                bu.setRoleName(ri.getRoleName());
                builder.addRole(bu);
            }
            status=0;
        }
        else
        {
            status=1;
        }

        RoleResponse response=builder.setStatusId(status).build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void removeRole(RoleRequest request,StreamObserver<RoleResponse> responseStreamObserver){
        List<Role> ids=request.getRoleList();
        List<role_menu_info> list_role=new ArrayList<role_menu_info>();
        int status=-1;
        int conunt=0;

        for(Role id : ids){
            role_info role =roleService.getId(id.getRoleId());
            if(role!=null){
                list_role =role_menuService.getAll();
                for(role_menu_info rp : list_role){
                    if(rp.getRoleId()==role.getRoleId()){
                        role_menuService.delete(rp.getId());
                    }
                }
                roleService.delete(role.getRoleId());
                conunt++;
            }else {
                System.out.println("数据库无此id:" + role.getRoleId() + "对应的信息!");
            }
        }
        if(conunt==ids.size()){
            status=0;
        }else {
            status=1;
        }

        RoleResponse response=RoleResponse.newBuilder()
                .setStatusId(status)
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void changeMenu(RoleRequest request,StreamObserver<RoleResponse> responseStreamObserver){
        int id=request.getRoleId();
        List<Integer> list=new ArrayList<Integer>();
        List<role_menu_info> list_menu =new ArrayList<role_menu_info>();
        list = request.getIdList();
        int status= -1;
        int count=0;

        role_info role =roleService.getId(id);
        if(role!=null) {
            list_menu = role_menuService.getAll();
            for (role_menu_info rp : list_menu) {
                 if(rp.getRoleId()==role.getRoleId()){
                    role_menuService.delete(rp.getId());
                 }
            }

            for(int i: list){
                role_menu_info rp=new role_menu_info();
                rp.setRoleId(id);
                rp.setMenuId(i);
                role_menuService.add(rp);
                count++;
            }
        }else {
            status = 1;
        }

        if(count==list.size()){
            status = 0;
        }

        RoleResponse response=RoleResponse.newBuilder()
                .setStatusId(status)
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getRole(RoleRequest request,StreamObserver<RoleResponse> responseStreamObserver){
        int id=request.getManagerId();
        int count=0;
        int status=-1;
        List<Integer> cc=new ArrayList<Integer>();
        List<Integer> dd=new ArrayList<Integer>();
        dd.add(0);

        RoleResponse.Builder builder=RoleResponse.newBuilder();

        manager_info manager =managerService.getId(id);
        if(manager!=null){
            List<manager_role_info> mr=manager_roleService.getAll();
            for(manager_role_info aa:mr) {
                if (aa.getManagerId() == manager.getManagerId()) {
                    cc.add(aa.getRoleId());
                }
            }
        }else {
            status=1;
        }

        if(cc.size()>0){
            for(int zz : cc){
                for(int i=0; i<dd.size(); i++){ //去除重复权限id
                    if(dd.get(i)==zz){
                        count=1;
                    }
                }
                if(count==0){
                    dd.add(zz);
                }
                count=0;
            }
            dd.remove(0);
            for(int role_id :dd){
                role_info role=roleService.getId(role_id);
                if(role!=null){
                    Role.Builder bu=Role.newBuilder();
                    bu.setRoleId(role_id);
                    bu.setRoleName(role.getRoleName());
                    builder.addRole(bu);
                }
            }
            status=0;
        }


        RoleResponse response=builder.setStatusId(status).build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

}
