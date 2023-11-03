package com.loword.java.server;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.google.protobuf.Descriptors;
import com.grpc.area.Area;
import com.grpc.area.AreaRequest;
import com.grpc.area.AreaResponse;
import com.grpc.area.AreaServiceGrpc.AreaServiceImplBase;
import com.grpc.area.AreaTree;
import com.loword.java.kernel.entity.sys_area;
import com.loword.java.model.vo.AreaTreeVo;
import com.loword.java.model.vo.AreaVo;
import com.loword.java.service.AreaService;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class AreaServerImpl extends AreaServiceImplBase {

    public AreaService areaService;

    public AreaServerImpl(BeanContainer service) {
        this.areaService= service.areaService;
    }

    /**
     * 行政区域列表
     */
    public void listArea(AreaRequest request, StreamObserver<AreaResponse> responseStreamObserver) {
         String shortName = request.getName();
         String pinyin = request.getPinyin();

         List<sys_area> areaList  = new ArrayList<sys_area>();
         List<AreaTreeVo> AreaTreeList = new ArrayList<AreaTreeVo>();
         AreaResponse.Builder builder=AreaResponse.newBuilder();
         
         if(!StrUtil.isBlank(shortName)) {
             areaList =this.areaService.getByShortName(shortName);
         } else if (!StrUtil.isBlank(pinyin)) {
             areaList =this.areaService.getByPinyin(pinyin);
         } else {
        	 sys_area area = new sys_area();
             area.setParentCode(request.getAreaCode());//根据上级code获取下级区域信息
             area.setLevelCode(request.getLevelCode());
             AreaTreeList =this.areaService.listArea(area);
         }
         
         
         if(AreaTreeList.size()>0){
             for(AreaTreeVo ri :AreaTreeList) {
                 Area.Builder bu = Area.newBuilder();
                 bu.setId(Integer.valueOf(ri.getId()));
                 //bu.setLevelCode(ri.getLevelCode());
                 //bu.setParentCode(ri.getParentCode());
                 bu.setAreaCode(ri.getCode());
                 //bu.setZipCode(ri.getZipCode());
                 //bu.setCityCode(ri.getCityCode());
                 bu.setName(ri.getName());
                 //bu.setShortName(ri.getShortName());
                 //bu.setMergerName(ri.getMergerName());
                 //bu.setPinyin(ri.getPinyin());
                 /*bu.setLng(ri.getLng());
                 bu.setLat(ri.getLat());*/
                 Area area =bu.build();
                 builder.addArea(area);
             }
         }else if(areaList.size() > 0) {
             for(sys_area ri :areaList) {
                 Area.Builder bu = Area.newBuilder();
                 bu.setId(ri.getId());
                 bu.setLevelCode(ri.getLevelCode());
                 bu.setParentCode(ri.getParentCode());
                 bu.setAreaCode(ri.getAreaCode());
                 bu.setZipCode(ri.getZipCode());
                 bu.setCityCode(ri.getCityCode());
                 bu.setName(ri.getName());
                 bu.setShortName(ri.getShortName());
                 bu.setMergerName(ri.getMergerName());
                 bu.setPinyin(ri.getPinyin());
                 bu.setLng(ri.getLng());
                 bu.setLat(ri.getLat());
                 Area area =bu.build();
                 builder.addArea(area);
             }

         }

         AreaResponse response=builder.build();
         responseStreamObserver.onNext(response);
         responseStreamObserver.onCompleted();
    }

	/**
	 * 添加行政区域
	 */
	public void addArea(AreaRequest request,StreamObserver<AreaResponse> responseObserver) {
        sys_area area = new sys_area();
        AreaResponse.Builder builder=AreaResponse.newBuilder();
        area.setLevelCode(request.getLevelCode());
        area.setParentCode(request.getParentCode());
        area.setAreaCode(request.getAreaCode());
        area.setZipCode(request.getZipCode());
        area.setCityCode(request.getCityCode());
        area.setName(request.getName());
        area.setShortName(request.getShortName());
        area.setMergerName(request.getMergerName());
        area.setPinyin(request.getPinyin());
        area.setLng(request.getLng());
        area.setLat(request.getLat());
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

    private void dataTree(List<AreaVo> areaList,AreaTree.Builder areaTree){
        //AreaTreeVo villageVo = new AreaTreeVo();
        //List<AreaTreeVo> villageList = new ArrayList<AreaTreeVo>();
        AreaTree.Builder villageInfo =  AreaTree.newBuilder();
        //AreaTreeVo townVo = new AreaTreeVo();
        AreaTree.Builder townInfo =  AreaTree.newBuilder();
        //AreaTreeVo countyVo = new AreaTreeVo();
        AreaTree.Builder countyInfo =  AreaTree.newBuilder();
        //List<AreaTreeVo> countyList = new ArrayList<AreaTreeVo>();
        //AreaTreeVo cityVo = new AreaTreeVo();
        //List<AreaTreeVo> cityList = new ArrayList<AreaTreeVo>();
        for(int i=0; i<areaList.size(); i++){
            AreaVo ri = areaList.get(i);
            if(i==0) {
                villageInfo.setId(ri.getVillageCode());
                villageInfo.setName(ri.getVillage());
                townInfo.addChild(villageInfo);
                townInfo.setId(ri.getTownCode());
                townInfo.setName(ri.getTown());
                countyInfo.setId(ri.getCountyCode());
                countyInfo.setName(ri.getCounty());
            }else if(ri.getTownCode().equals(String.valueOf(townInfo.getId()))) {
                villageInfo.setId(ri.getVillageCode());
                villageInfo.setName(ri.getVillage());
                townInfo.addChild(villageInfo);
            }else if(!ri.getTownCode().equals(String.valueOf(townInfo.getId()))){
                countyInfo.addChild(townInfo);
                townInfo.clearChild();
                villageInfo.setId(ri.getVillageCode());
                villageInfo.setName(ri.getVillage());
                townInfo.addChild(villageInfo);
                townInfo.setId(ri.getTownCode());
                townInfo.setName(ri.getTown());
            }

            if(!ri.getCountyCode().equals(String.valueOf(countyInfo.getId()))) {
                areaTree.addChild(countyInfo);
                countyInfo.clearChild();
                countyInfo.setId(ri.getCountyCode());
                countyInfo.setName(ri.getCounty());
            } else if(i==areaList.size()-1) {
                countyInfo.addChild(townInfo);
                countyInfo.setId(ri.getCountyCode());
                countyInfo.setName(ri.getCounty());
                areaTree.addChild(countyInfo);
                countyInfo.clearChild();
            }
        }
    }
	/**
	 * 根据父级行政代码获取下级行政区域信息
	 */
	public void getAreaTree(AreaRequest request,StreamObserver<AreaTree> responseObserver) {
        List<AreaVo> areaList;
        AreaTree.Builder bu = AreaTree.newBuilder();

       	sys_area area = new sys_area();
        //area.setId(request.getId());
       	//area.setParentCode(request.getParentCode());
        area.setAreaCode(request.getAreaCode());
        //area.setName(request.getName());
        //area.setShortName(request.getShortName());
        //area.setPinyin(request.getPinyin());
        area.setLat(request.getLat());
        area.setLng(request.getLng());
       	areaList =this.areaService.listAreaTree(area);

        if(areaList.size()>0){

            /*List<AreaTreeVo> treelist = dataTree(areaList,bu);
            for(AreaTreeVo treeVo:treelist){
                bu.setId(treeVo.getId());
                bu.setName(treeVo.getName());
                Gson gson=new Gson();
                bu.setChildTree(gson.toJson(treeVo.getChildren()));
            }*/
            bu.setId(request.getAreaCode());
            bu.setName(request.getShortName());
            dataTree(areaList,bu);
            AreaTree areaTree=bu.build();
            responseObserver.onNext(areaTree);
        }else{
            System.out.println("内容不存在");
            AreaTree areaResponse = AreaTree.newBuilder()
                    .build();
            responseObserver.onNext(areaResponse);
        }

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
            bu.setId(Integer.valueOf(area.getId()));
            bu.setLevelCode(area.getLevelCode());
            bu.setParentCode(area.getParentCode());
            bu.setAreaCode(area.getAreaCode());
            bu.setZipCode(area.getZipCode());
            bu.setCityCode(area.getCityCode());
            bu.setName(area.getName());
            bu.setShortName(area.getShortName());
            bu.setMergerName(area.getMergerName());
            bu.setPinyin(area.getPinyin());
            bu.setLng(area.getLng());
            bu.setLat(area.getLat());
            Area ar =bu.build();
            builder.addArea(ar);
        }

        AreaResponse response=builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
}
