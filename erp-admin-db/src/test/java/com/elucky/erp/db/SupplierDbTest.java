package com.elucky.erp.db;

import com.elucky.erp.db.dao.ElSupplierMapper;
import com.elucky.erp.db.domain.ElSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by zero on 2018/10/24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class SupplierDbTest {
    @Autowired
    private ElSupplierMapper elSupplierMapper;

    @Test
    public void testCreate() {
        ElSupplier record = new ElSupplier();
        record.setAddress("aa");
        record.setContact("bb");
        elSupplierMapper.insertSelective(record);
    }
}
