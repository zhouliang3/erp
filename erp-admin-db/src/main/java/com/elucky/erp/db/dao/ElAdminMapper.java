package com.elucky.erp.db.dao;

import com.elucky.erp.db.domain.ElAdmin;
import com.elucky.erp.db.domain.ElAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElAdminMapper {
    long countByExample(ElAdminExample example);

    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") ElAdminExample example);

    int deleteByExample(ElAdminExample example);

    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    int deleteByPrimaryKey(Integer id);

    int insert(ElAdmin record);

    int insertSelective(ElAdmin record);

    ElAdmin selectOneByExample(ElAdminExample example);

    ElAdmin selectOneByExampleSelective(@Param("example") ElAdminExample example, @Param("selective") ElAdmin.Column ... selective);

    List<ElAdmin> selectByExampleSelective(@Param("example") ElAdminExample example, @Param("selective") ElAdmin.Column ... selective);

    List<ElAdmin> selectByExample(ElAdminExample example);

    ElAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ElAdmin.Column ... selective);

    ElAdmin selectByPrimaryKey(Integer id);

    ElAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") ElAdmin record, @Param("example") ElAdminExample example);

    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") ElAdmin record, @Param("example") ElAdminExample example);

    int updateByExampleSelective(@Param("record") ElAdmin record, @Param("example") ElAdminExample example);

    int updateByExample(@Param("record") ElAdmin record, @Param("example") ElAdminExample example);

    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") ElAdmin record);

    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") ElAdmin record);

    int updateByPrimaryKeySelective(ElAdmin record);

    int updateByPrimaryKey(ElAdmin record);

    int logicalDeleteByExample(@Param("example") ElAdminExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}