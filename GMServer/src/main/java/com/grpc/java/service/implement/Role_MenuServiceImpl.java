package com.grpc.java.service.implement;


import com.grpc.java.kernel.entity.role_menu_info;
import com.grpc.java.kernel.mybatis.mapper.role_menu_infoMapper;
import com.grpc.java.service.Role_MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/*******************************
 * Created by wx on 2017/10/27.*
 *******************************/
@Service("role_menuService")
public class Role_MenuServiceImpl implements Role_MenuService {
    @Resource
    private role_menu_infoMapper role_menuMapper;

    @Override
    public role_menu_info getId(Integer id) {

        return role_menuMapper.selectById(id);
    }

    @Override
    public role_menu_info getMenuId(Integer id) {

        return role_menuMapper.selectByMenuId(id);
    }

    @Override
    public role_menu_info getRoleId(Integer id) {

        return role_menuMapper.selectByRoleId(id);
    }

    @Override
    public List<role_menu_info> getAll() {

        return this.role_menuMapper.selectAll();
    }

    @Override
    public Boolean add(role_menu_info user) {
        return this.role_menuMapper.insertSelective(user) > 0;
    }
    
    @Override
    public Boolean update(role_menu_info user){
        return this.role_menuMapper.updateByPrimaryKeySelective(user)>0;
    }
    
    @Override
    public Boolean delete(Integer id){
        return this.role_menuMapper.deleteByPrimaryKey(id) > 0;
    }


}
