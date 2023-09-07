package com.loword.java.kernel.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loword.java.kernel.entity.IMUser;

import java.util.List;
import java.util.Map;

@Repository
public interface IMUserMapper {

    IMUser selectUserById(@Param("id") Integer Id);

    IMUser selectUserByName(@Param("name") String Name);

    int getCountUser();

    List<IMUser> selectAllUser(@Param("cm") Map<String, Object> columnMap);

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insertSelective(IMUser record);

    int updateByPrimaryKeySelective(IMUser record);

    int updatePasswordSelective(IMUser record);

}