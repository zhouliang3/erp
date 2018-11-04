package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElUnitMapper;
import com.elucky.erp.db.domain.ElUnit;
import com.elucky.erp.db.domain.ElUnitExample;
import com.elucky.erp.db.service.ElUnitService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
@Service
public class ElUnitServiceImpl implements ElUnitService {
    @Resource
    private ElUnitMapper elUnitMapper;

    @Override
    public List<ElUnit> queryByParam(String p, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elUnitMapper.selectByParam("%" + p + "%");
    }

    @Override
    public List<ElUnit> queryByUnit(String unit) {
        ElUnitExample example = new ElUnitExample();
        ElUnitExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(unit)) {
            criteria.andUnitEqualTo(unit);
            criteria.andIsDeletedEqualTo(false);
            return elUnitMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public ElUnit queryById(Long id) {
        return elUnitMapper.selectByPrimaryKeyWithLogicalDelete(id, false);
    }

    @Override
    public long countByParam(String p) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elUnitMapper.countByParam("%" + p + "%");
    }

    @Override
    public int add(ElUnit unit) {
        return elUnitMapper.insertSelective(unit);
    }

    @Override
    public int update(ElUnit unit) {
        return elUnitMapper.updateByPrimaryKeySelective(unit);
    }

    @Override
    public int delete(long id) {
        return elUnitMapper.logicalDeleteByPrimaryKey(id);
    }


}
