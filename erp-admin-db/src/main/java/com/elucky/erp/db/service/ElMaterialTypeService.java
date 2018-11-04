package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElMaterialType;

import java.util.List;

/**
 * Created by zero on 2018/11/3.
 */
public interface ElMaterialTypeService {
    List<ElMaterialType> querySelective(String materialTypeName, Integer page, Integer limit, String sort, String order);

    List<ElMaterialType> queryByMaterialTypeName(String materialTypeName);

    ElMaterialType queryById(Long id);

    long countSelective(String materialTypeName);

    int add(ElMaterialType materialType);

    int update(ElMaterialType materialType);

    int delete(long id);
}
