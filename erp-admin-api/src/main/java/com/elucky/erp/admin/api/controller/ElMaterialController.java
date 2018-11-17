package com.elucky.erp.admin.api.controller;

import com.elucky.erp.admin.api.utils.OrikaBeanMapper;
import com.elucky.erp.admin.api.utils.ResponseUtil;
import com.elucky.erp.admin.api.validator.Order;
import com.elucky.erp.admin.api.validator.Sort;
import com.elucky.erp.admin.api.vo.ElMaterialQueryVo;
import com.elucky.erp.admin.api.vo.ElMaterialVo;
import com.elucky.erp.db.domain.ElMaterial;
import com.elucky.erp.db.domain.ElMaterialType;
import com.elucky.erp.db.domain.ElSupplier;
import com.elucky.erp.db.domain.ElUnit;
import com.elucky.erp.db.service.ElMaterialService;
import com.elucky.erp.db.service.ElMaterialTypeService;
import com.elucky.erp.db.service.ElSupplierService;
import com.elucky.erp.db.service.ElUnitService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zero on 2018/10/24.
 */
@RestController
@RequestMapping("/el/api/v1/material")
public class ElMaterialController {
    @Resource
    private ElMaterialService elMaterialService;
    @Resource
    private OrikaBeanMapper beanMapper;
    @Resource
    private ElUnitService elUnitService;
    @Resource
    private ElSupplierService elSupplierService;
    @Resource
    private ElMaterialTypeService elMaterialTypeService;

    @PostMapping("/list")
    public Object list(@RequestBody ElMaterialQueryVo queryVo) {
        if (null == queryVo) {
            queryVo = new ElMaterialQueryVo();
        }
        List<String> materialtypes = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(queryVo.getMaterialTypes())) {
            materialtypes = queryVo.getMaterialTypes();
        }
        String p = queryVo.getP();

        long total = elMaterialService.countByParam(p, materialtypes);
        Map<String, Object> data = new HashMap<>();
        data.put("items", null);

        if (total > 0) {
            List<ElMaterial> elMaterials = elMaterialService.queryPageByParam(p, materialtypes, queryVo.getPage(),
                    queryVo.getLimit(), queryVo.getSort(), queryVo.getOrder());
            if (CollectionUtils.isNotEmpty(elMaterials)) {
                List<ElMaterialVo> vos = new ArrayList<>(elMaterials.size());
                for (ElMaterial item : elMaterials) {
                    ElMaterialVo vo = beanMapper.map(item, ElMaterialVo.class);
                    vos.add(vo);
                    String unit = vo.getUnit();
                    if (StringUtils.isNotEmpty(unit)) {
                        List<ElUnit> elUnits = elUnitService.queryByUnit(unit);
                        if (CollectionUtils.isNotEmpty(elUnits)) {
                            vo.setUnitCn(elUnits.get(0).getUnitCn());
                        }
                    }
                    String auxiliaryUnit = vo.getAuxiliaryUnit();
                    if (StringUtils.isNotEmpty(auxiliaryUnit)) {
                        List<ElUnit> elUnits = elUnitService.queryByUnit(auxiliaryUnit);
                        if (CollectionUtils.isNotEmpty(elUnits)) {
                            vo.setAuxiliaryUnitCn(elUnits.get(0).getUnitCn());
                        }
                    }
//                    Long defaultSupplierId = vo.getDefaultSupplierId();
//                    ElSupplier elSupplier = elSupplierService.queryById(defaultSupplierId);
//                    if (null != elSupplier) {
//                        vo.setDefaultSupplierName(elSupplier.getSupplierName());
//                    }
                    String materialType = vo.getMaterialType();
                    if (StringUtils.isNotBlank(materialType)) {
                        ElMaterialType elMaterialType = elMaterialTypeService.queryByType(materialType);
                        if (null != elMaterialType) {
                            vo.setMaterialTypeName(elMaterialType.getMaterialTypeName());
                        }
                    }
                }

                data.put("items", vos);

            }
        }
        data.put("total", total);
        return ResponseUtil.ok(data);
    }


    @PostMapping("/create")
    public Object create(@RequestBody ElMaterial material) {

        elMaterialService.add(material);
        return ResponseUtil.ok(material);
    }


    @PostMapping("/update")
    public Object update(@RequestBody ElMaterial material) {
        ElMaterial supplier = elMaterialService.queryById(material.getId());
        if (null == supplier) {
            return ResponseUtil.fail(403, "物料不存在");
        }
        elMaterialService.update(material);
        return ResponseUtil.ok(material);
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable long id) {
        ElMaterial elSupplier = elMaterialService.queryById(id);
        if (null == elSupplier) {
            return ResponseUtil.fail(403, "物料不存在");
        }
        elMaterialService.delete(id);
        return ResponseUtil.ok(id);
    }
}
