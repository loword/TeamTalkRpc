package com.grpc.java.server;

import com.grpc.java.service.*;
import com.menu.grpc.MenuServiceGrpc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wx on 2017/11/8.
 */
@Service("beanService")
public class BeanContainer {

    @Resource
    public ManagerService managerService;

    @Resource
    public IDepartService departService;

    @Resource
    public IDiscoveryService discoveryService;

    @Resource
    public IGroupService groupService;

    @Resource
    public IUserService userService;

    @Resource
    public MenuService menuService;

    @Resource
    public Role_MenuService  role_menuService;

    @Resource
    public RoleService roleService;

    @Resource
    public Manager_RoleService manager_roleService;

}
