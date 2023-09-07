package com.loword.java.kernel.mybatis.mapper;

import com.loword.java.kernel.entity.user_area;
import org.springframework.stereotype.Repository;


@Repository
public interface UserAreaMapper extends BaseMapper<user_area>{

    public user_area getById(Integer id);
}
