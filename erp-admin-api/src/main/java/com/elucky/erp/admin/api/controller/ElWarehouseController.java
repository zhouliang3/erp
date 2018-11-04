package com.elucky.erp.admin.api.controller;

import com.elucky.erp.admin.api.utils.ResponseUtil;
import com.elucky.erp.admin.api.validator.Order;
import com.elucky.erp.admin.api.validator.Sort;
import com.elucky.erp.db.domain.ElWarehouse;
import com.elucky.erp.db.service.ElWarehouseService;
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
@RequestMapping("/el/api/v1/warehouse")
public class ElWarehouseController {
    @Resource
    private ElWarehouseService elWarehouseService;


    @GetMapping("/list")
    public Object list(String p,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        long total = elWarehouseService.countByParam(p);
        List<ElWarehouse> warehouses = elWarehouseService.queryByParam(p, page, limit);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", warehouses);
        return ResponseUtil.ok(data);
    }

    @PostMapping("/create")
    public Object create(@RequestBody ElWarehouse elWarehouse) {
        List<ElWarehouse> warehouses = elWarehouseService.queryByWarehouse(elWarehouse.getWarehouse());
        if (CollectionUtils.isNotEmpty(warehouses)) {
            return ResponseUtil.fail(403, "存在同名的仓库");
        }
        elWarehouseService.add(elWarehouse);
        return ResponseUtil.ok(elWarehouse);
    }


    @PostMapping("/update")
    public Object update(@RequestBody ElWarehouse elWarehouse) {
        ElWarehouse warehouse = elWarehouseService.queryById(elWarehouse.getId());
        if (null == warehouse) {
            return ResponseUtil.fail(403, "仓库不存在");
        }
        elWarehouseService.update(elWarehouse);
        return ResponseUtil.ok(elWarehouse);
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable long id) {
        ElWarehouse warehouse = elWarehouseService.queryById(id);
        if (null == warehouse) {
            return ResponseUtil.fail(403, "仓库不存在");
        }
        elWarehouseService.delete(id);
        return ResponseUtil.ok(id);
    }
}
