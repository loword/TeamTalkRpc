package com.loword.java.service.implement;

import com.loword.java.kernel.entity.IMGroup;
import com.loword.java.kernel.entity.IMGroupMember;
import com.loword.java.kernel.mybatis.mapper.IMGroupMapper;
import com.loword.java.kernel.mybatis.mapper.IMGroupMemberMapper;
import com.loword.java.service.IGroupService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wx on 2017/10/27.
 */
@Service("groupService")
public class GroupServiceImpl implements IGroupService {
    @Resource
    private IMGroupMapper groupMapper;
    @Resource
    private IMGroupMemberMapper groupMemberMapper;

    @Override
    public IMGroup getGroupById(Integer userId) {
       return groupMapper.selectGroupById(userId);
    }

    @Override
    public IMGroup getGroupByName(String userName) {
       return groupMapper.selectGroupByName(userName);
    }

    @Override
    public List<IMGroup> getAllGroup() {
        return groupMapper.selectAllGroup();
    }

    @Override
    public Boolean addGroup(IMGroup user) {
        return groupMapper.insertSelective(user) > 0;
    }

    @Override
    public Boolean deleteGroup(Integer id) {
        IMGroupMember groupMember = new IMGroupMember();
        groupMember.setGroupid(id);
        groupMember.setStatus(1);
        groupMemberMapper.updateByPrimaryKeySelective(groupMember);
        return groupMapper.deleteByPrimaryKey(id) > 0;
    }


    @Override
    public Boolean updateGroup(IMGroup user) {
        return groupMapper.updateByPrimaryKeySelective(user) > 0;
    }

    @Override
    public IMGroup getAreaGroup(String groupName) {
        return groupMapper.selectAreaGroup(groupName);
    }

}
