package com.loword.java.server;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.grpc.area.Area;
import com.grpc.area.AreaRequest;
import com.grpc.area.AreaResponse;
import com.grpc.area.AreaServiceGrpc.AreaServiceImplBase;
import com.loword.java.kernel.entity.sys_area;
import com.loword.java.service.AreaService;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import io.grpc.stub.StreamObserver;

public class AreaServerImpl extends AreaServiceImplBase {

	@Resource
    public AreaService areaService;
    
    /**
     * 行政区域列表
     */
    public void listArea(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
 
         String shortName = request.getName();
         String pinyin = request.getPinyin();
         
         List<sys_area> areaList = new ArrayList<sys_area>();
         AreaResponse.Builder builder=AreaResponse.newBuilder();
         
         if(!StrUtil.isBlank(shortName)) {
        	 areaList =this.areaService.getByShortName(shortName); 
         } else if (!StrUtil.isBlank(pinyin)) {
        	 areaList =this.areaService.getByPinyin(pinyin);
         } else {
        	 sys_area area = new sys_area();
        	 BeanUtil.toBean(request, area.getClass());
        	 areaList =this.areaService.listArea(area);
         }
         
         
         if(areaList.size()>0){
             for(sys_area ri :areaList) {
                 Area.Builder bu = Area.newBuilder();
                 BeanUtil.toBean(bu, ri.getClass());
                 builder.addArea(bu);
             }
         }

         AreaResponse response=builder.build();
         responseObserver.onNext(response);
         responseObserver.onCompleted();
    }

	/**
	 * 添加行政区域
	 */
	public void addArea(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
        sys_area area = new sys_area();
        AreaResponse.Builder builder=AreaResponse.newBuilder();
        BeanUtil.toBean(request, area.getClass());
        this.areaService.addArea(area);
        System.out.println("添加成功");
        AreaResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
	
	/**
	 * 修改行政区域
	 */
	public void modifyArea(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
        int id=request.getId();
        AreaResponse.Builder builder=AreaResponse.newBuilder();
        
        sys_area area =this.areaService.getById(id);
        if(area !=null){
        	sys_area inArea = new sys_area();
        	BeanUtil.toBean(inArea, request.getClass());
            this.areaService.updateArea(inArea);
            System.out.println("修改成功");
            AreaResponse response = builder.build();
            responseObserver.onNext(response);
        } else {
            System.out.println("内容不存在");
            AreaResponse response = builder.build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();    
	}
	
	/**
	 * 根据父级行政代码获取下级行政区域信息
	 */
	public void getAreaTree(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
        List<sys_area> areaList = new ArrayList<sys_area>();
        AreaResponse.Builder builder=AreaResponse.newBuilder();
        
       	sys_area area = new sys_area();
       	BeanUtil.toBean(request, area.getClass());
       	areaList =this.areaService.listArea(area);

        if(areaList.size()>0){
            for(sys_area ri :areaList) {
                Area.Builder bu = Area.newBuilder();
                BeanUtil.toBean(bu, ri.getClass());
                builder.addArea(bu);
            }
        }

        AreaResponse response=builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
	
	/**
	 * 获取地区
	 */
	public void getArea(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
        Integer id = request.getId();
        
        sys_area area = new sys_area();
        AreaResponse.Builder builder=AreaResponse.newBuilder();
        
        if(id != null) {
        	area = this.areaService.getById(id);
        }

        if(area != null) {
            Area.Builder bu = Area.newBuilder();
            BeanUtil.toBean(bu, area.getClass());
            builder.addArea(bu);
        }

        AreaResponse response=builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
}
