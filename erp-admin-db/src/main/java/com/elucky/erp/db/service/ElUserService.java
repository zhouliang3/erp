package com.elucky.erp.db.service;

import com.elucky.erp.db.domain.ElUser;
import com.elucky.erp.db.domain.UserVo;

import java.util.List;

/**
 * Created by zero on 2018/10/28.
 */
public interface ElUserService {
    ElUser findById(Integer userId);

    UserVo findUserVoById(Integer userId);

    ElUser queryByOid(String openId);

    void add(ElUser user);

    int updateById(ElUser user);

    List<ElUser> querySelective(String username, String mobile, Integer page, Integer size, String sort, String order);

    int countSeletive(String username, String mobile, Integer page, Integer size, String sort, String order);

    int count();

    List<ElUser> queryByUsername(String username);

    List<ElUser> queryByMobile(String mobile);

    void deleteById(Integer id);
}
