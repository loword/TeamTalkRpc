package com.loword.java.service;

import com.loword.java.kernel.entity.user_area;

public interface UserAreaService {
    public user_area getById(Integer id);

    public user_area getUserArea(user_area uarea);

    public int addUserArea(user_area uarea);

    public int modifyUserArea(user_area uarea);
}
