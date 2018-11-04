package com.elucky.erp.admin.api.controller;

import com.elucky.erp.admin.api.utils.ResponseUtil;
import com.elucky.erp.db.domain.ElUnit;
import com.elucky.erp.db.service.ElUnitService;
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
@RequestMapping("/el/api/v1/unit")
public class ElUnitController {
    @Resource
    private ElUnitService elUnitService;


    @GetMapping("/list")
    public Object list(String p,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        long total = elUnitService.countByParam(p);
        List<ElUnit> elUnits = elUnitService.queryByParam(p, page, limit);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", elUnits);
        return ResponseUtil.ok(data);
    }

    @PostMapping("/create")
    public Object create(@RequestBody ElUnit elUnit) {
        List<ElUnit> elUnits = elUnitService.queryByUnit(elUnit.getUnit());
        if (CollectionUtils.isNotEmpty(elUnits)) {
            return ResponseUtil.fail(403, "计量单位已存在");
        }
        elUnitService.add(elUnit);
        return ResponseUtil.ok(elUnit);
    }


    @PostMapping("/update")
    public Object update(@RequestBody ElUnit elUnit) {
        ElUnit unit = elUnitService.queryById(elUnit.getId());
        if (null == unit) {
            return ResponseUtil.fail(403, "计量单位不存在");
        }
        elUnitService.update(elUnit);
        return ResponseUtil.ok(elUnit);
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable long id) {
        ElUnit warehouse = elUnitService.queryById(id);
        if (null == warehouse) {
            return ResponseUtil.fail(403, "计量单位不存在");
        }
        elUnitService.delete(id);
        return ResponseUtil.ok(id);
    }
}
