package com.elucky.erp.db.service.impl;

import com.elucky.erp.db.dao.ElUserMapper;
import com.elucky.erp.db.domain.ElUser;
import com.elucky.erp.db.domain.ElUserExample;
import com.elucky.erp.db.domain.UserVo;
import com.elucky.erp.db.service.ElUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ElUserServiceImpl implements ElUserService {
    @Resource
    private ElUserMapper elUserMapper;

    @Override
    public ElUser findById(Integer userId) {
        return elUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UserVo findUserVoById(Integer userId) {
        ElUser user = findById(userId);
        UserVo userVo = new UserVo();
        userVo.setNickname(user.getNickname());
        userVo.setAvatar(user.getAvatar());
        return userVo;
    }

    @Override
    public ElUser queryByOid(String openId) {
        ElUserExample example = new ElUserExample();
        example.or().andWeixinOpenidEqualTo(openId).andIsDeletedEqualTo(false);
        return elUserMapper.selectOneByExample(example);
    }

    @Override
    public void add(ElUser user) {
        elUserMapper.insertSelective(user);
    }

    @Override
    public int updateById(ElUser user) {
        return elUserMapper.updateWithVersionByPrimaryKeySelective(user.getVersion(), user);
    }

    @Override
    public List<ElUser> querySelective(String username, String mobile, Integer page, Integer size, String sort, String order) {
        ElUserExample example = new ElUserExample();
        ElUserExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        if (!StringUtils.isEmpty(mobile)) {
            criteria.andMobileEqualTo(mobile);
        }
        criteria.andIsDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return elUserMapper.selectByExample(example);
    }

    @Override
    public int countSeletive(String username, String mobile, Integer page, Integer size, String sort, String order) {
        ElUserExample example = new ElUserExample();
        ElUserExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        if (!StringUtils.isEmpty(mobile)) {
            criteria.andMobileEqualTo(mobile);
        }
        criteria.andIsDeletedEqualTo(false);

        return (int) elUserMapper.countByExample(example);
    }

    @Override
    public int count() {
        ElUserExample example = new ElUserExample();
        example.or().andIsDeletedEqualTo(false);

        return (int) elUserMapper.countByExample(example);
    }

    @Override
    public List<ElUser> queryByUsername(String username) {
        ElUserExample example = new ElUserExample();
        example.or().andUsernameEqualTo(username).andIsDeletedEqualTo(false);
        return elUserMapper.selectByExample(example);
    }

    @Override
    public List<ElUser> queryByMobile(String mobile) {
        ElUserExample example = new ElUserExample();
        example.or().andMobileEqualTo(mobile).andIsDeletedEqualTo(false);
        return elUserMapper.selectByExample(example);
    }

    @Override
    public void deleteById(Integer id) {
        elUserMapper.logicalDeleteByPrimaryKey(id);
    }
}
