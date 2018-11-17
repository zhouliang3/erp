package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElMaterial;

import java.util.List;

/**
 * Created by zero on 2018/11/6.
 */
public interface ElMaterialService {
    List<ElMaterial> queryPageByParam(String p, List<String> materialType, Integer page, Integer limit, String sort, String order);


    ElMaterial queryById(Long id);

    long countByParam(String p, List<String> materialType);

    int add(ElMaterial material);

    int update(ElMaterial material);

    int delete(long id);
}
