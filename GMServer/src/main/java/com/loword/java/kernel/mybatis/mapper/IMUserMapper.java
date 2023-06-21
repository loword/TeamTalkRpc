package com.loword.java.kernel.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loword.java.kernel.entity.IMUser;

import java.util.List;

@Repository
public interface IMUserMapper {

    IMUser selectUserById(@Param("id") Integer Id);

    IMUser selectUserByName(@Param("name") String Name);

    List<IMUser> selectAllUser();

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insertSelective(IMUser record);

    int updateByPrimaryKeySelective(IMUser record);

    int updatePasswordSelective(IMUser record);

}