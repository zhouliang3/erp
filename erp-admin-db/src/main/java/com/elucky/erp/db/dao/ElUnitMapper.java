package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElUnit;
import com.elucky.erp.db.domain.ElUnitExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ElUnitMapper {
    long countByExample(ElUnitExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElUnitExample example);

    int deleteByExample(ElUnitExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Long key);

    int deleteByPrimaryKey(Long id);

    int insert(ElUnit record);

    int insertSelective(ElUnit record);

    ElUnit selectOneByExample(ElUnitExample example);

    ElUnit selectOneByExampleSelective(@Param("example") ElUnitExample example, @Param("selective") ElUnit.Column ... selective);

    List<ElUnit> selectByExampleSelective(@Param("example") ElUnitExample example, @Param("selective") ElUnit.Column ... selective);

    List<ElUnit> selectByExample(ElUnitExample example);

    ElUnit selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") ElUnit.Column ... selective);

    ElUnit selectByPrimaryKey(Long id);

    ElUnit selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElUnit record, @Param("example") ElUnitExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElUnit record, @Param("example") ElUnitExample example);

    int updateByExampleSelective(@Param("record") ElUnit record, @Param("example") ElUnitExample example);

    int updateByExample(@Param("record") ElUnit record, @Param("example") ElUnitExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElUnit record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElUnit record);

    int updateByPrimaryKeySelective(ElUnit record);

    int updateByPrimaryKey(ElUnit record);

    int logicalDeleteByExample(@Param("example") ElUnitExample example);

    int logicalDeleteByPrimaryKey(Long id);

    List<ElUnit> selectByParam(@Param("p") String p);
    long countByParam(@Param("p") String p);
}