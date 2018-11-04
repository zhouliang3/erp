package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElWarehouse;

import java.util.List;

/**
 * Created by zero on 2018/11/4.
 */
public interface ElWarehouseService {


    List<ElWarehouse> queryByParam(String p, Integer page, Integer limit);

    List<ElWarehouse> queryByWarehouse(String warehouse);

    ElWarehouse queryById(Long id);


    long countByParam(String p);

    int add(ElWarehouse materialType);

    int update(ElWarehouse materialType);

    int delete(long id);
}
