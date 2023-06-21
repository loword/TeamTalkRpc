package com.loword.java.service;


import java.util.List;

import com.loword.java.kernel.entity.manager_role_info;

/**
 * Created by wx on 2017/10/27.
 */
public interface Manager_RoleService {

    manager_role_info getId(Integer id);

    manager_role_info getManagerId(Integer id);

    manager_role_info getRoleId(Integer id);

    List<manager_role_info> getAll();

    Boolean add(manager_role_info user);

    Boolean delete(Integer id);

    Boolean update(manager_role_info user);


}
