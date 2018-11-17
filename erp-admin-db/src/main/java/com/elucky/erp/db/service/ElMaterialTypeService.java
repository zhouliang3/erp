package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElMaterialType;

import java.util.List;

/**
 * Created by zero on 2018/11/3.
 */
public interface ElMaterialTypeService {
    List<ElMaterialType> selectByTypeOrName(String materialTypeName, Integer page, Integer limit, String sort, String order);

    List<ElMaterialType> queryAll();

    List<ElMaterialType> queryByMaterialTypeName(String materialTypeName);

    ElMaterialType queryById(Long id);

    ElMaterialType queryByType(String materialType);

    long countByTypeOrName(String materialTypeName);

    int add(ElMaterialType materialType);

    int update(ElMaterialType materialType);

    int delete(long id);
}
