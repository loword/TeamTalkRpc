package com.loword.java.server;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loword.java.service.IDepartService;
import com.loword.java.service.IDiscoveryService;
import com.loword.java.service.IGroupService;
import com.loword.java.service.IUserService;
import com.loword.java.service.ManagerService;
import com.loword.java.service.Manager_RoleService;
import com.loword.java.service.MenuService;
import com.loword.java.service.RoleService;
import com.loword.java.service.Role_MenuService;

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
