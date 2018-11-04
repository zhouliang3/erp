package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElSupplier;

import java.util.List;

/**
 * Created by zero on 2018/10/24.
 */
public interface ElSupplierService {
    List<ElSupplier> querySelective(String supplierName, String contact, String tel, Integer page, Integer limit, String sort, String order);

    List<ElSupplier> queryBySupplierName(String supplierName);

    ElSupplier queryById(Long id);

    long countSelective(String supplierName, String contact, String tel);

    int add(ElSupplier supplier);

    int update(ElSupplier supplier);

    int delete(long id);
}
