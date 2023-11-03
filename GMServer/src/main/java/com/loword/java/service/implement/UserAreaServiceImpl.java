package com.loword.java.service.implement;

import com.loword.java.kernel.entity.user_area;
import com.loword.java.kernel.mybatis.mapper.UserAreaMapper;
import com.loword.java.service.UserAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userAreaService")
public class UserAreaServiceImpl implements UserAreaService {

    @Resource
    private UserAreaMapper userAreaMapper;

    @Override
    public user_area getById(Integer id) {
        return userAreaMapper.selectById(id);
    }

    @Override
    public int addUserArea(user_area uarea) {
        uarea.setStatus(0);
        uarea.setAreaType(1);
        int timeNow = (int) (System.currentTimeMillis()/1000);
        uarea.setCreateTime(timeNow);
        return userAreaMapper.insert(uarea);
    }

    @Override
    public int modifyUserArea(user_area uarea) {
        uarea.setStatus(0);
        int timeNow = (int) (System.currentTimeMillis()/1000);
        uarea.setUpdateTime(timeNow);
        return userAreaMapper.updateById(uarea);
    }


    @Override
    public user_area getUserArea(user_area user) {
        return null;
    }

}
