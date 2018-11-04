package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElUser;
import com.elucky.erp.db.domain.ElUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElUserMapper {
    long countByExample(ElUserExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElUserExample example);

    int deleteByExample(ElUserExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    int deleteByPrimaryKey(Integer id);

    int insert(ElUser record);

    int insertSelective(ElUser record);

    ElUser selectOneByExample(ElUserExample example);

    ElUser selectOneByExampleSelective(@Param("example") ElUserExample example, @Param("selective") ElUser.Column ... selective);

    List<ElUser> selectByExampleSelective(@Param("example") ElUserExample example, @Param("selective") ElUser.Column ... selective);

    List<ElUser> selectByExample(ElUserExample example);

    ElUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ElUser.Column ... selective);

    ElUser selectByPrimaryKey(Integer id);

    ElUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElUser record, @Param("example") ElUserExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElUser record, @Param("example") ElUserExample example);

    int updateByExampleSelective(@Param("record") ElUser record, @Param("example") ElUserExample example);

    int updateByExample(@Param("record") ElUser record, @Param("example") ElUserExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElUser record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElUser record);

    int updateByPrimaryKeySelective(ElUser record);

    int updateByPrimaryKey(ElUser record);

    int logicalDeleteByExample(@Param("example") ElUserExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}