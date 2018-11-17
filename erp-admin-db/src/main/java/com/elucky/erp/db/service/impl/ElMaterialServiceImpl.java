package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElMaterialMapper;
import com.elucky.erp.db.domain.ElMaterial;
import com.elucky.erp.db.domain.ElMaterialExample;
import com.elucky.erp.db.service.ElMaterialService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
@Service
public class ElMaterialServiceImpl implements ElMaterialService {
    @Resource
    private ElMaterialMapper elMaterialMapper;

    @Override
    public List<ElMaterial> queryPageByParam(String p, List<String> materialType, Integer page, Integer limit, String sort, String order) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        PageHelper.startPage(page, limit);
        return elMaterialMapper.selectByParam("%" + p + "%", materialType);
    }


    @Override
    public ElMaterial queryById(Long id) {
        return elMaterialMapper.selectByPrimaryKeyWithLogicalDelete(id, false);
    }

    @Override
    public long countByParam(String p, List<String> materialType) {
        if (StringUtils.isBlank(p)) {
            p = "";
        }
        return elMaterialMapper.countByParam("%" + p + "%", materialType);
    }

    @Override
    public int add(ElMaterial material) {
        return elMaterialMapper.insertSelective(material);
    }

    @Override
    public int update(ElMaterial material) {
        return elMaterialMapper.updateByPrimaryKeySelective(material);
    }

    @Override
    public int delete(long id) {
        return elMaterialMapper.logicalDeleteByPrimaryKey(id);
    }


}
