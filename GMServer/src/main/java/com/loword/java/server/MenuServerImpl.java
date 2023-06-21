package com.loword.java.server;

import java.util.ArrayList;
import java.util.List;

import com.grpc.menu.Menu;
import com.grpc.menu.MenuRequest;
import com.grpc.menu.MenuResponse;
import com.grpc.menu.MenuServiceGrpc;
import com.loword.java.kernel.entity.manager_info;
import com.loword.java.kernel.entity.manager_role_info;
import com.loword.java.kernel.entity.menu_info;
import com.loword.java.kernel.entity.role_info;
import com.loword.java.kernel.entity.role_menu_info;
import com.loword.java.service.ManagerService;
import com.loword.java.service.Manager_RoleService;
import com.loword.java.service.MenuService;
import com.loword.java.service.RoleService;
import com.loword.java.service.Role_MenuService;

import io.grpc.stub.StreamObserver;


/**
 * Created by wx on 2017/11/8.
 */

public class MenuServerImpl extends MenuServiceGrpc.MenuServiceImplBase {
    private MenuService menuService;
    private ManagerService managerService;
    private Role_MenuService role_menuService;
    private RoleService roleService;
    private Manager_RoleService manager_roleService;

    public MenuServerImpl(BeanContainer service) {
        this.menuService= service.menuService;
        this.manager_roleService=service.manager_roleService;
        this.managerService=service.managerService;
        this.role_menuService=service.role_menuService;
        this.roleService=service.roleService;
    }

    @Override
    public void addMenu(MenuRequest request, StreamObserver<MenuResponse> responseStreamObserver){
        String name=request.getMenuName();
        String url=request.getMenuUrl();
        int parent_id=request.getParentId();

        int status=-1;

        menu_info menu=menuService.getName(name);
        if(menu!=null){
            status=1;
        }else {
            menu_info pi =new menu_info();
            pi.setParentId(parent_id);
            pi.setMenuName(name);
            pi.setMenuUrl(url);
            menuService.add(pi);
            status=0;
        }

        MenuResponse response = MenuResponse.newBuilder()
                .setStatusId(status)
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();    
    }

    @Override
    public void modifyMenu(MenuRequest request, StreamObserver<MenuResponse> responseStreamObserver){
        int id=request.getMenuId();
        String name=request.getMenuName();
        String url=request.getMenuUrl();
        int parent_id=request.getParentId();
        int status=-1;

        menu_info menu=menuService.getId(id);
        if(menu!=null){
            menu.setMenuName(name);
            menu.setParentId(parent_id);
            menu.setMenuUrl(url);
            menuService.update(menu);
            status=0;
        }
        else {
            status=1;
        }

        MenuResponse response=MenuResponse.newBuilder()
                .setStatusId(status)
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void listMenu(MenuRequest request, StreamObserver<MenuResponse> responseStreamObserver){
        List<menu_info> data =menuService.getAll();
        MenuResponse.Builder builder=MenuResponse.newBuilder();
        int status=-1;

        if(data.size()>0){
            for(menu_info ri :data) {
                Menu.Builder bu = Menu.newBuilder();
                bu.setMenuId(ri.getMenuId());
                bu.setMenuName(ri.getMenuName());
                bu.setMenuUrl(ri.getMenuUrl());
                bu.setParentId(ri.getParentId());
                builder.addMenu(bu);
            }
            status=0;
        }
        else
        {
            status=1;
        }

        MenuResponse response=builder.setStatusId(status).build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void removeMenu(MenuRequest request,StreamObserver<MenuResponse> responseStreamObserver){
        List<Menu> ids=request.getMenuList();
        int status=-1;
        int conunt=0;

        for(Menu id : ids){
            menu_info menu =menuService.getId(id.getMenuId());
            if(menu!=null){
                menuService.delete(menu.getMenuId());
                conunt++;
            }else {
                System.out.println("数据库无此id:" + menu.getMenuId() + "对应的信息!");
            }
        }
        if(conunt==ids.size()){
            status=0;
        }else {
            status=1;
        }

        MenuResponse response=MenuResponse.newBuilder()
                .setStatusId(status)
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getRoute(MenuRequest request,StreamObserver<MenuResponse> responseStreamObserver){
        String token=request.getToken();
        List<Integer> cc=new ArrayList<Integer>();
        List<Integer> dd=new ArrayList<Integer>();
        dd.add(0);
        int count=0;
        int status=-1;

        MenuResponse.Builder builder=MenuResponse.newBuilder();

        manager_info manager = managerService.getToken(token);
        if(manager!=null){
            List<manager_role_info> mr=manager_roleService.getAll();
            for(manager_role_info aa: mr){
                if(aa.getManagerId()==manager.getManagerId()){
                    List<role_menu_info> rp=role_menuService.getAll();
                    for(role_menu_info bb:rp){
                        if(aa.getRoleId()==bb.getRoleId()){
                            cc.add(bb.getMenuId());
                        }
                    }
                }
            }
        }else
        {
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
            for(int menu_id :dd){
                menu_info menu=menuService.getId(menu_id);
                if(menu!=null){
                    Menu.Builder bu=Menu.newBuilder();
                    bu.setMenuId(menu_id);
                    bu.setMenuUrl(menu.getMenuUrl());
                    bu.setMenuName(menu.getMenuName());
                    bu.setParentId(menu.getParentId());
                    builder.addMenu(bu);
                }
            }
            status=0;
        }

        MenuResponse response=builder.setStatusId(status).build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getMenu(MenuRequest request,StreamObserver<MenuResponse> responseStreamObserver){
        int id=request.getId();
        int count=0;
        int status=-1;
        List<Integer> cc=new ArrayList<Integer>();
        List<Integer> dd=new ArrayList<Integer>();
        dd.add(0);

        MenuResponse.Builder builder=MenuResponse.newBuilder();

        role_info role =roleService.getId(id);
        if(role!=null){
            List<role_menu_info> rp=role_menuService.getAll();
            for(role_menu_info aa:rp) {
                if (aa.getRoleId() == role.getRoleId()) {
                    cc.add(aa.getMenuId());
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
            for(int menu_id :dd){
                menu_info menu=menuService.getId(menu_id);
                if(menu!=null){
                    Menu.Builder bu=Menu.newBuilder();
                    bu.setMenuId(menu_id);
                    bu.setMenuUrl(menu.getMenuUrl());
                    bu.setMenuName(menu.getMenuName());
                    bu.setParentId(menu.getParentId());
                    builder.addMenu(bu);
                }
            }
            status=0;
        }


        MenuResponse response=builder.setStatusId(status).build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

}
