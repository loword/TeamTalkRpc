package com.webjava.service;

import com.webjava.kernel.entity.SysArea;
import com.webjava.model.vo.CustomCityData;

import java.util.List;

public interface AreaService {

	List<CustomCityData> listAreaTree(SysArea user);

}
