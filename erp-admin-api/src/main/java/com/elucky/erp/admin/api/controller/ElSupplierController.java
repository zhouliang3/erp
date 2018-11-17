package com.elucky.erp.admin.api.controller;

import com.elucky.erp.admin.api.utils.RegexUtil;
import com.elucky.erp.admin.api.utils.ResponseUtil;
import com.elucky.erp.admin.api.validator.Order;
import com.elucky.erp.admin.api.validator.Sort;
import com.elucky.erp.db.domain.ElSupplier;
import com.elucky.erp.db.service.ElSupplierService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zero on 2018/10/24.
 */
@RestController
@RequestMapping("/el/api/v1/supplier")
public class ElSupplierController {
    @Resource
    private ElSupplierService elSupplierService;


    @GetMapping("/list")
    public Object list(String p,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        long total = elSupplierService.countByMultiCond(p);
        List<ElSupplier> elSuppliers = elSupplierService.queryByMultiCond(p, page, limit, sort, order);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", elSuppliers);
        return ResponseUtil.ok(data);
    }

    @GetMapping("/all")
    public Object all() {
        List<ElSupplier> supplierList = elSupplierService.queryAll();
        Map<String, Object> data = new HashMap<>();
        data.put("items", supplierList);
        return ResponseUtil.ok(data);
    }

    @PostMapping("/create")
    public Object create(@RequestBody ElSupplier supplier) {
        List<ElSupplier> suppliers = elSupplierService.queryBySupplierName(supplier.getSupplierName());
        if (CollectionUtils.isNotEmpty(suppliers)) {
            return ResponseUtil.fail(403, "存在同名的供应商");
        }
        if (!RegexUtil.isMobileExact(supplier.getTel()) && !RegexUtil.isTel(supplier.getTel())) {
            return ResponseUtil.fail(403, "联系电话格式不正确");
        }
        elSupplierService.add(supplier);
        return ResponseUtil.ok(supplier);
    }


    @PostMapping("/update")
    public Object update(@RequestBody ElSupplier supplier) {
        ElSupplier elSupplier = elSupplierService.queryById(supplier.getId());
        if (null == elSupplier) {
            return ResponseUtil.fail(403, "供应商不存在");
        }
        if (!RegexUtil.isMobileExact(supplier.getTel()) && !RegexUtil.isTel(supplier.getTel())) {
            return ResponseUtil.fail(403, "联系电话格式不正确");
        }
        elSupplierService.update(supplier);
        return ResponseUtil.ok(supplier);
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable long id) {
        ElSupplier elSupplier = elSupplierService.queryById(id);
        if (null == elSupplier) {
            return ResponseUtil.fail(403, "供应商不存在");
        }
        elSupplierService.delete(id);
        return ResponseUtil.ok(id);
    }
}
