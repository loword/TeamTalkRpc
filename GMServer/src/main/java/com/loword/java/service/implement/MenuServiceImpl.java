package com.loword.java.service.implement;


import com.loword.java.kernel.entity.menu_info;
import com.loword.java.kernel.mybatis.mapper.menu_infoMapper;
import com.loword.java.service.MenuService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/*******************************
 * Created by wx on 2017/10/27.*
 *******************************/
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private menu_infoMapper menuMapper;
    
    @Override
    public menu_info getId(Integer id) {

        return menuMapper.selectById(id);
    }
   
    @Override
    public menu_info getName(String name){
        return menuMapper.selectByName(name);
    }

    @Override
    public menu_info getUrl(String url){
        return menuMapper.selectByUrl(url);
    }
    

    @Override
    public List<menu_info> getAll() {

        return this.menuMapper.selectAll();
    }

    @Override
    public Boolean add(menu_info user) {
        return this.menuMapper.insertSelective(user) > 0;
    }

    @Override
    public Boolean update(menu_info user){
        return this.menuMapper.updateByPrimaryKeySelective(user)>0;
    }

    @Override
    public Boolean delete(Integer id){
        return this.menuMapper.deleteByPrimaryKey(id) > 0;
    }


}
