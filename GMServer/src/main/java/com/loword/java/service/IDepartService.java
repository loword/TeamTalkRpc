package com.loword.java.service;

import java.util.List;

import com.loword.java.kernel.entity.IMDepart;

/**
 * Created by wx on 2017/10/27.
 */
public interface IDepartService {

    IMDepart getDepartById(Integer id);

    IMDepart getDepartByName(String departName);

    List<IMDepart> getAllDepart();

    Boolean addDepart(IMDepart user);

    Boolean deleteDepart(Integer id);

    Boolean updateDepart(IMDepart user);
}
