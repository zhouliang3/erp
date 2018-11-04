package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElAdminMapper;
import com.elucky.erp.db.domain.ElAdmin;
import com.elucky.erp.db.domain.ElAdmin.Column;
import com.elucky.erp.db.domain.ElAdminExample;
import com.elucky.erp.db.service.ElAdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ElAdminServiceImpl implements ElAdminService {
    @Resource
    private ElAdminMapper elAdminMapper;

    @Override
    public List<ElAdmin> findAdmin(String username) {
        ElAdminExample example = new ElAdminExample();
        example.or().andUsernameEqualTo(username).andIsDeletedEqualTo(false);
        return elAdminMapper.selectByExample(example);
    }

    private final Column[] result = new Column[]{Column.id, Column.username, Column.avatar};

    @Override
    public List<ElAdmin> querySelective(String username, Integer page, Integer limit, String sort, String order) {
        ElAdminExample example = new ElAdminExample();
        ElAdminExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        criteria.andIsDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return elAdminMapper.selectByExampleSelective(example, result);
    }

    @Override
    public int countSelective(String username, Integer page, Integer size, String sort, String order) {
        ElAdminExample example = new ElAdminExample();
        ElAdminExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        criteria.andIsDeletedEqualTo(false);

        return (int) elAdminMapper.countByExample(example);
    }

    @Override
    public int updateById(ElAdmin admin) {
        return elAdminMapper.updateWithVersionByPrimaryKeySelective(admin.getVersion(), admin);
    }

    @Override
    public void deleteById(Integer id) {
        elAdminMapper.logicalDeleteByPrimaryKey(id);
    }

    @Override
    public void add(ElAdmin admin) {
        elAdminMapper.insertSelective(admin);
    }

    @Override
    public ElAdmin findById(Integer id) {
        return elAdminMapper.selectByPrimaryKeySelective(id, result);
    }
}
