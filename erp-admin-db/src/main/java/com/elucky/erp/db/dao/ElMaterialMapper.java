package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElMaterial;
import com.elucky.erp.db.domain.ElMaterialExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ElMaterialMapper {
    long countByExample(ElMaterialExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElMaterialExample example);

    int deleteByExample(ElMaterialExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Long key);

    int deleteByPrimaryKey(Long id);

    int insert(ElMaterial record);

    int insertSelective(ElMaterial record);

    ElMaterial selectOneByExample(ElMaterialExample example);

    ElMaterial selectOneByExampleSelective(@Param("example") ElMaterialExample example, @Param("selective") ElMaterial.Column... selective);

    List<ElMaterial> selectByExampleSelective(@Param("example") ElMaterialExample example, @Param("selective") ElMaterial.Column... selective);

    List<ElMaterial> selectByExample(ElMaterialExample example);

    ElMaterial selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") ElMaterial.Column... selective);

    ElMaterial selectByPrimaryKey(Long id);

    ElMaterial selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElMaterial record, @Param("example") ElMaterialExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElMaterial record, @Param("example") ElMaterialExample example);

    int updateByExampleSelective(@Param("record") ElMaterial record, @Param("example") ElMaterialExample example);

    int updateByExample(@Param("record") ElMaterial record, @Param("example") ElMaterialExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElMaterial record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElMaterial record);

    int updateByPrimaryKeySelective(ElMaterial record);

    int updateByPrimaryKey(ElMaterial record);

    int logicalDeleteByExample(@Param("example") ElMaterialExample example);

    int logicalDeleteByPrimaryKey(Long id);

    List<ElMaterial> selectByParam(@Param("p") String p, @Param("materialType") List<String> materialType);

    long countByParam(@Param("p") String p, @Param("materialType") List<String> materialType);
}