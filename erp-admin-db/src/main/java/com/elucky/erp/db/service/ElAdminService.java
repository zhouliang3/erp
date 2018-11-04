package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElAdmin;

import java.util.List;

/**
 * Created by zero on 2018/10/28.
 */
public interface ElAdminService {
    List<ElAdmin> findAdmin(String username);

    List<ElAdmin> querySelective(String username, Integer page, Integer limit, String sort, String order);

    int countSelective(String username, Integer page, Integer size, String sort, String order);

    int updateById(ElAdmin admin);

    void deleteById(Integer id);

    void add(ElAdmin admin);

    ElAdmin findById(Integer id);
}
