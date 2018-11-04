package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElWarehouseMapper;
import com.elucky.erp.db.domain.ElWarehouse;
import com.elucky.erp.db.domain.ElWarehouseExample;
import com.elucky.erp.db.service.ElWarehouseService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
@Service
public class ElWarehouseServiceImpl implements ElWarehouseService {
    @Resource
    private ElWarehouseMapper elWarehouseMapper;

    @Override
    public List<ElWarehouse> queryByParam(String p, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elWarehouseMapper.selectByWarehoseOrDesc("%" + p + "%");
    }

    private ElWarehouseExample createWarehouseExample(String waresehouse, String desc) {
        ElWarehouseExample example = new ElWarehouseExample();
        ElWarehouseExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeletedEqualTo(false);
        if (StringUtils.isNotBlank(waresehouse)) {
            criteria.andWarehouseLike("%" + waresehouse + "%");
        }
        if (StringUtils.isNotBlank(desc)) {
            criteria.andDescLike("%" + desc + "%");
        }
        return example;
    }

    @Override
    public List<ElWarehouse> queryByWarehouse(String warehouse) {
        ElWarehouseExample example = new ElWarehouseExample();
        ElWarehouseExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(warehouse)) {
            criteria.andWarehouseEqualTo(warehouse);
            criteria.andIsDeletedEqualTo(false);
            return elWarehouseMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public ElWarehouse queryById(Long id) {
        return elWarehouseMapper.selectByPrimaryKeyWithLogicalDelete(id, false);
    }

    @Override
    public long countByParam(String p) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elWarehouseMapper.countByWarehoseOrDesc(p);
    }

    @Override
    public int add(ElWarehouse materialType) {
        return elWarehouseMapper.insertSelective(materialType);
    }

    @Override
    public int update(ElWarehouse materialType) {
        return elWarehouseMapper.updateByPrimaryKeySelective(materialType);
    }

    @Override
    public int delete(long id) {
        return elWarehouseMapper.logicalDeleteByPrimaryKey(id);
    }


}
