package com.elucky.erp.admin.api.controller;

import com.elucky.erp.admin.api.utils.ResponseUtil;
import com.elucky.erp.admin.api.validator.Order;
import com.elucky.erp.admin.api.validator.Sort;
import com.elucky.erp.db.domain.ElMaterialType;
import com.elucky.erp.db.service.ElMaterialTypeService;
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
@RequestMapping("/el/api/v1/materialType")
public class ElMaterialTypeController {
    @Resource
    private ElMaterialTypeService elMaterialTypeService;


    @GetMapping("/list")
    public Object list(String p,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        long total = elMaterialTypeService.countByTypeOrName(p);
        List<ElMaterialType> materialTypes = elMaterialTypeService.selectByTypeOrName(p, page, limit, sort, order);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", materialTypes);
        return ResponseUtil.ok(data);
    }


    @GetMapping("/all")
    public Object all() {
        List<ElMaterialType> supplierList = elMaterialTypeService.queryAll();
        Map<String, Object> data = new HashMap<>();
        data.put("items", supplierList);
        return ResponseUtil.ok(data);
    }

    @PostMapping("/create")
    public Object create(@RequestBody ElMaterialType elMaterialType) {
        List<ElMaterialType> materialTypes = elMaterialTypeService.queryByMaterialTypeName(elMaterialType.getMaterialTypeName());
        if (CollectionUtils.isNotEmpty(materialTypes)) {
            return ResponseUtil.fail(403, "存在同名的原材料类型");
        }
        elMaterialTypeService.add(elMaterialType);
        return ResponseUtil.ok(elMaterialType);
    }


    @PostMapping("/update")
    public Object update(@RequestBody ElMaterialType elMaterialType) {
        ElMaterialType materialType = elMaterialTypeService.queryById(elMaterialType.getId());
        if (null == materialType) {
            return ResponseUtil.fail(403, "原材料类型不存在");
        }
        elMaterialTypeService.update(elMaterialType);
        return ResponseUtil.ok(elMaterialType);
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable long id) {
        ElMaterialType materialType = elMaterialTypeService.queryById(id);
        if (null == materialType) {
            return ResponseUtil.fail(403, "原材料类型不存在");
        }
        elMaterialTypeService.delete(id);
        return ResponseUtil.ok(id);
    }
}
