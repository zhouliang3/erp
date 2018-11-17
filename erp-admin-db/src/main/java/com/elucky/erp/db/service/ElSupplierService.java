package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElSupplier;

import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
public interface ElSupplierService {

    List<ElSupplier> queryByMultiCond(String p, Integer page, Integer limit, String sort, String order);

    List<ElSupplier> queryAll();

    List<ElSupplier> queryBySupplierName(String supplierName);

    ElSupplier queryById(Long id);


    long countByMultiCond(String p);

    int add(ElSupplier supplier);

    int update(ElSupplier supplier);

    int delete(long id);
}
