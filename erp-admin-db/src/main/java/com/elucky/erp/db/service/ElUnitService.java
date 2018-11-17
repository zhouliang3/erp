package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElUnit;

import java.util.List;

/**
 * Created by zero on 2018/11/4.
 */
public interface ElUnitService {
    List<ElUnit> queryByParam(String p, Integer page, Integer limit);

    List<ElUnit> queryAll();

    List<ElUnit> queryByUnit(String unit);

    ElUnit queryById(Long id);

    long countByParam(String p);

    int add(ElUnit unit);

    int update(ElUnit unit);

    int delete(long id);
}
