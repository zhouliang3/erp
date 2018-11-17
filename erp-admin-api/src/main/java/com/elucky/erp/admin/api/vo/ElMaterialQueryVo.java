package com.elucky.erp.admin.api.vo;

import com.elucky.erp.admin.api.common.CommonQueryVo;

import java.util.List;

/**
 * Created by zero on 2018/11/8.
 */
public class ElMaterialQueryVo extends CommonQueryVo {
    private String p;
    private List<String> materialTypes;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public List<String> getMaterialTypes() {
        return materialTypes;
    }

    public void setMaterialTypes(List<String> materialTypes) {
        this.materialTypes = materialTypes;
    }
}
