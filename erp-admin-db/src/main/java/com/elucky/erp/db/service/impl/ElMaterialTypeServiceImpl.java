package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElMaterialTypeMapper;
import com.elucky.erp.db.dao.ElMaterialTypeMapper;
import com.elucky.erp.db.domain.ElMaterialType;
import com.elucky.erp.db.domain.ElMaterialTypeExample;
import com.elucky.erp.db.service.ElMaterialTypeService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
@Service
public class ElMaterialTypeServiceImpl implements ElMaterialTypeService {
    @Resource
    private ElMaterialTypeMapper elMaterialTypeMapper;

    @Override
    public List<ElMaterialType> querySelective(String materialTypeName, Integer page, Integer limit, String sort, String order) {
        ElMaterialTypeExample example = createMaterialTypeExample(materialTypeName);
        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        PageHelper.startPage(page, limit);
        return elMaterialTypeMapper.selectByExample(example);
    }

    private ElMaterialTypeExample createMaterialTypeExample(String materialTypeName) {
        ElMaterialTypeExample example = new ElMaterialTypeExample();
        ElMaterialTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeletedEqualTo(false);
        if (StringUtils.isNotBlank(materialTypeName)) {
            criteria.andMaterialTypeNameLike("%" + materialTypeName + "%");
        }
        return example;
    }

    @Override
    public List<ElMaterialType> queryByMaterialTypeName(String materialTypeName) {
        ElMaterialTypeExample example = new ElMaterialTypeExample();
        ElMaterialTypeExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(materialTypeName)) {
            criteria.andMaterialTypeNameEqualTo(materialTypeName);
            criteria.andIsDeletedEqualTo(false);
            return elMaterialTypeMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public ElMaterialType queryById(Long id) {
        return elMaterialTypeMapper.selectByPrimaryKeyWithLogicalDelete(id, false);
    }


    @Override
    public long countSelective(String materialTypeName) {
        ElMaterialTypeExample example = createMaterialTypeExample(materialTypeName);
        return elMaterialTypeMapper.countByExample(example);
    }

    @Override
    public int add(ElMaterialType materialType) {
        return elMaterialTypeMapper.insertSelective(materialType);
    }

    @Override
    public int update(ElMaterialType materialType) {
        return elMaterialTypeMapper.updateByPrimaryKeySelective(materialType);
    }

    @Override
    public int delete(long id) {
        return elMaterialTypeMapper.logicalDeleteByPrimaryKey(id);
    }


}