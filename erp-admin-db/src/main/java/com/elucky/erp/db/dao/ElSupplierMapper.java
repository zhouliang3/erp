package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElSupplier;
import com.elucky.erp.db.domain.ElSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElSupplierMapper {
    long countByExample(ElSupplierExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElSupplierExample example);

    int deleteByExample(ElSupplierExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Long key);

    int deleteByPrimaryKey(Long id);

    int insert(ElSupplier record);

    int insertSelective(ElSupplier record);

    ElSupplier selectOneByExample(ElSupplierExample example);

    ElSupplier selectOneByExampleSelective(@Param("example") ElSupplierExample example, @Param("selective") ElSupplier.Column ... selective);

    List<ElSupplier> selectByExampleSelective(@Param("example") ElSupplierExample example, @Param("selective") ElSupplier.Column ... selective);

    List<ElSupplier> selectByExample(ElSupplierExample example);

    ElSupplier selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") ElSupplier.Column ... selective);

    ElSupplier selectByPrimaryKey(Long id);

    ElSupplier selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElSupplier record, @Param("example") ElSupplierExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElSupplier record, @Param("example") ElSupplierExample example);

    int updateByExampleSelective(@Param("record") ElSupplier record, @Param("example") ElSupplierExample example);

    int updateByExample(@Param("record") ElSupplier record, @Param("example") ElSupplierExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElSupplier record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElSupplier record);

    int updateByPrimaryKeySelective(ElSupplier record);

    int updateByPrimaryKey(ElSupplier record);

    int logicalDeleteByExample(@Param("example") ElSupplierExample example);

    int logicalDeleteByPrimaryKey(Long id);


    List<ElSupplier> selectByMultiCond(@Param("p") String p);
    long countByByMultiCond(@Param("p") String p);
}