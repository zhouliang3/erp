package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElMaterialType;
import com.elucky.erp.db.domain.ElMaterialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElMaterialTypeMapper {
    long countByExample(ElMaterialTypeExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElMaterialTypeExample example);

    int deleteByExample(ElMaterialTypeExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Long key);

    int deleteByPrimaryKey(Long id);

    int insert(ElMaterialType record);

    int insertSelective(ElMaterialType record);

    ElMaterialType selectOneByExample(ElMaterialTypeExample example);

    ElMaterialType selectOneByExampleSelective(@Param("example") ElMaterialTypeExample example, @Param("selective") ElMaterialType.Column ... selective);

    List<ElMaterialType> selectByExampleSelective(@Param("example") ElMaterialTypeExample example, @Param("selective") ElMaterialType.Column ... selective);

    List<ElMaterialType> selectByExample(ElMaterialTypeExample example);

    ElMaterialType selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") ElMaterialType.Column ... selective);

    ElMaterialType selectByPrimaryKey(Long id);

    ElMaterialType selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElMaterialType record, @Param("example") ElMaterialTypeExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElMaterialType record, @Param("example") ElMaterialTypeExample example);

    int updateByExampleSelective(@Param("record") ElMaterialType record, @Param("example") ElMaterialTypeExample example);

    int updateByExample(@Param("record") ElMaterialType record, @Param("example") ElMaterialTypeExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElMaterialType record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElMaterialType record);

    int updateByPrimaryKeySelective(ElMaterialType record);

    int updateByPrimaryKey(ElMaterialType record);

    int logicalDeleteByExample(@Param("example") ElMaterialTypeExample example);

    int logicalDeleteByPrimaryKey(Long id);

    List<ElMaterialType> selectByTypeOrName(@Param("p") String p);
    long countByTypeOrName(@Param("p") String p);
}