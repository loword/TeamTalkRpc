package com.loword.java.service.implement;


import com.loword.java.kernel.entity.IMGroup;
import com.loword.java.kernel.entity.IMGroupMember;
import com.loword.java.kernel.entity.IMUser;
import com.loword.java.kernel.entity.user_area;
import com.loword.java.kernel.mybatis.mapper.IMGroupMemberMapper;
import com.loword.java.kernel.mybatis.mapper.IMUserMapper;
import com.loword.java.service.IGroupService;
import com.loword.java.service.IUserService;
import com.loword.java.service.UserAreaService;
import com.loword.java.utils.name.ChineseNameGenerator;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wx on 2017/10/27.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IMUserMapper userMapper;

    @Resource
    private UserAreaService userAreaService;

    @Resource
    private IGroupService groupService;

    @Resource
    private IMGroupMemberMapper groupMemberMapper;

    @Override
    public IMUser getUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public IMUser getUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }

    @Override
    public int getCountUser() {
        return userMapper.getCountUser();
    }

    @Override
    public List<IMUser> getAllUser() {
        return userMapper.selectAllUser(null);
    }

    @Override
    public List<IMUser> getAllUser(Map<String, Object> columnMap) {
        return userMapper.selectAllUser(columnMap);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addUser(IMUser user, user_area uarea) {
		ChineseNameGenerator instance = ChineseNameGenerator.getInstance();
		user.setNick(instance.generate());
        int timeNow = (int) (System.currentTimeMillis()/1000);
        user.setCreated(timeNow);
        userMapper.insertSelective(user);
        uarea.setUserId(user.getId());
        userAreaService.addUserArea(uarea);

        saveGroupMember(user,uarea,timeNow);
        return true;
    }

    private void saveGroupMember(IMUser user,user_area uarea,int timeNow){
        IMGroup cityGroup =this.groupService.getAreaGroup(uarea.getCity());
        IMGroup countyGroup =this.groupService.getAreaGroup(uarea.getCounty());
        IMGroup townGroup =this.groupService.getAreaGroup(uarea.getTown());
        IMGroup villageGroup =this.groupService.getAreaGroup(uarea.getVillage());

        IMGroup imGroup = new IMGroup();
        imGroup.setCreator(user.getId());
        imGroup.setType((byte)1);
        imGroup.setStatus((byte)0);
        imGroup.setVersion(1);
        imGroup.setCreated(timeNow);

        IMGroupMember groupMember = new IMGroupMember();
        groupMember.setUserid(user.getId());
        groupMember.setStatus(0);
        groupMember.setCreated(timeNow);

        if(cityGroup == null) {
            imGroup.setName(uarea.getCity());
            imGroup.setStatus((byte)1);
            groupService.addGroup(imGroup);
            groupMember.setGroupid(imGroup.getId());
        } else {
            groupMember.setGroupid(cityGroup.getId());
        }
        List<IMGroupMember> cityGroupMemberList =groupMemberMapper.findGroupMember(groupMember);
        if(cityGroupMemberList.size() == 0) {
            groupMemberMapper.insertSelective(groupMember);
        }

        if(countyGroup == null) {
            if (imGroup.getId() != null) { imGroup.setId(imGroup.getId()+1);}
            imGroup.setName(uarea.getCounty());
            imGroup.setStatus((byte)1);
            groupService.addGroup(imGroup);
            groupMember.setGroupid(imGroup.getId());
        } else {
            groupMember.setGroupid(countyGroup.getId());
        }
        List<IMGroupMember> cGroupMemberList =groupMemberMapper.findGroupMember(groupMember);
        if(cGroupMemberList.size() == 0) {
            groupMemberMapper.insertSelective(groupMember);
        }

        if(townGroup == null) {
            if (imGroup.getId() != null) { imGroup.setId(imGroup.getId()+1);}
            imGroup.setName(uarea.getTown());
            imGroup.setStatus((byte)0);
            groupService.addGroup(imGroup);
            groupMember.setGroupid(imGroup.getId());
        } else {
            groupMember.setGroupid(townGroup.getId());
        }
        List<IMGroupMember> tGroupMemberList =groupMemberMapper.findGroupMember(groupMember);
        if(tGroupMemberList.size() == 0) {
            groupMemberMapper.insertSelective(groupMember);
        }

        if(villageGroup == null) {
            if (imGroup.getId() != null) { imGroup.setId(imGroup.getId()+1);}
            imGroup.setName(uarea.getVillage());
            imGroup.setStatus((byte)0);
            groupService.addGroup(imGroup);
            groupMember.setGroupid(imGroup.getId());
        } else {
            groupMember.setGroupid(villageGroup.getId());
        }
        List<IMGroupMember> vGroupMemberList =groupMemberMapper.findGroupMember(groupMember);
        if(vGroupMemberList.size() == 0) {
            groupMemberMapper.insertSelective(groupMember);
        }
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return userMapper.deleteByPrimaryKey(id) > 0;
    }


    @Override
    public Boolean updateUser(IMUser user, user_area uArea) {
        userMapper.updateByPrimaryKeySelective(user);
        user_area oldUserArea = userAreaService.getById(user.getId());
        if(oldUserArea == null) {
            uArea.setUserId(user.getId());
            //todo 获取地区表新增更新逻辑未实现
            //uArea.setShortName(user.get);
            return userAreaService.addUserArea(uArea) > 0;
        } else {
            uArea.setId(oldUserArea.getId());
            uArea.setUserId(user.getId());
            return userAreaService.modifyUserArea(uArea) > 0;
        }
    }

    @Override
    public Boolean updatePassword(IMUser user) {
        return userMapper.updatePasswordSelective(user) > 0;
    }

}
