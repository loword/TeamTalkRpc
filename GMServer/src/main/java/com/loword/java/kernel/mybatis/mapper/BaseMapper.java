package com.loword.java.kernel.mybatis.mapper;

import com.google.common.base.Equivalence;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {

    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    default int insert(T entity) {
        return 0;
    };

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    default int deleteById(Serializable id) {
        return 0;
    };

    /**
     * 根据实体(ID)删除
     *
     * @param entity 实体对象
     * @since 3.4.4
     */
    default int deleteById(T entity) {
        return 0;
    };

    /**
     * 根据 columnMap 条件，删除记录
     *
     * @param columnMap 表字段 map 对象
     */
    default int deleteByMap(@Param("cm") Map<String, Object> columnMap) {
        return 0;
    };

    /**
     * 删除（根据ID或实体 批量删除）
     *
     * @param idList 主键ID列表或实体列表(不能为 null 以及 empty)
     */
    default int deleteBatchIds(@Param("coll") Collection<?> idList) {
        return 0;
    };

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    default int updateById(@Param("et") T entity) {
        return 0;
    };

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    default T selectById(Serializable id) {
        return null;
    };

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     */
    default List<T> selectBatchIds(@Param("coll") Collection<? extends Serializable> idList) {
        return null;
    };

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    default List<T> selectByMap(@Param("cm") Map<String, Object> columnMap) {
        return null;
    };

}