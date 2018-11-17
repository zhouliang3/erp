package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElSupplierMapper;
import com.elucky.erp.db.domain.ElMaterialTypeExample;
import com.elucky.erp.db.domain.ElSupplier;
import com.elucky.erp.db.domain.ElSupplierExample;
import com.elucky.erp.db.service.ElSupplierService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
@Service
public class ElSupplierServiceImpl implements ElSupplierService {
    @Resource
    private ElSupplierMapper elSupplierMapper;

    @Override
    public List<ElSupplier> queryByMultiCond(String p, Integer page, Integer limit, String sort, String order) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        PageHelper.startPage(page, limit);
        return elSupplierMapper.selectByMultiCond("%" + p + "%");
    }


    @Override
    public List<ElSupplier> queryAll() {
        ElSupplierExample example = new ElSupplierExample();
        ElSupplierExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeletedEqualTo(false);
        return elSupplierMapper.selectByExample(example);
    }

    @Override
    public List<ElSupplier> queryBySupplierName(String supplierName) {
        ElSupplierExample example = new ElSupplierExample();
        ElSupplierExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(supplierName)) {
            criteria.andSupplierNameEqualTo(supplierName);
            criteria.andIsDeletedEqualTo(false);
            return elSupplierMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public ElSupplier queryById(Long id) {
        return elSupplierMapper.selectByPrimaryKeyWithLogicalDelete(id, false);
    }

    @Override
    public long countByMultiCond(String p) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elSupplierMapper.countByByMultiCond("%" + p + "%");
    }

    @Override
    public int add(ElSupplier supplier) {
        return elSupplierMapper.insertSelective(supplier);
    }

    @Override
    public int update(ElSupplier supplier) {
        return elSupplierMapper.updateByPrimaryKeySelective(supplier);
    }

    @Override
    public int delete(long id) {
        return elSupplierMapper.logicalDeleteByPrimaryKey(id);
    }


}
