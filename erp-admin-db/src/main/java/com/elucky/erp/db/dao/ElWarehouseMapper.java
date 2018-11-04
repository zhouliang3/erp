package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElWarehouse;
import com.elucky.erp.db.domain.ElWarehouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ElWarehouseMapper {
    long countByExample(ElWarehouseExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElWarehouseExample example);

    int deleteByExample(ElWarehouseExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Long key);

    int deleteByPrimaryKey(Long id);

    int insert(ElWarehouse record);

    int insertSelective(ElWarehouse record);

    ElWarehouse selectOneByExample(ElWarehouseExample example);

    ElWarehouse selectOneByExampleSelective(@Param("example") ElWarehouseExample example, @Param("selective") ElWarehouse.Column... selective);

    List<ElWarehouse> selectByExampleSelective(@Param("example") ElWarehouseExample example, @Param("selective") ElWarehouse.Column... selective);

    List<ElWarehouse> selectByExample(ElWarehouseExample example);

    ElWarehouse selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") ElWarehouse.Column... selective);

    ElWarehouse selectByPrimaryKey(Long id);

    ElWarehouse selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElWarehouse record, @Param("example") ElWarehouseExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElWarehouse record, @Param("example") ElWarehouseExample example);

    int updateByExampleSelective(@Param("record") ElWarehouse record, @Param("example") ElWarehouseExample example);

    int updateByExample(@Param("record") ElWarehouse record, @Param("example") ElWarehouseExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElWarehouse record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElWarehouse record);

    int updateByPrimaryKeySelective(ElWarehouse record);

    int updateByPrimaryKey(ElWarehouse record);

    int logicalDeleteByExample(@Param("example") ElWarehouseExample example);

    int logicalDeleteByPrimaryKey(Long id);


    List<ElWarehouse> selectByWarehoseOrDesc(@Param("p") String p);
    long countByWarehoseOrDesc(@Param("p") String p);
}