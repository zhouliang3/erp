package com.elucky.erp.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public ElMaterialExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public ElMaterialExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ElMaterialExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getRows() {
        return this.rows;
    }

    public ElMaterialExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public ElMaterialExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public ElMaterialExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("unit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitIsNull() {
            addCriterion("auxiliary_unit is null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitIsNotNull() {
            addCriterion("auxiliary_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitEqualTo(String value) {
            addCriterion("auxiliary_unit =", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitNotEqualTo(String value) {
            addCriterion("auxiliary_unit <>", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitGreaterThan(String value) {
            addCriterion("auxiliary_unit >", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitGreaterThanOrEqualTo(String value) {
            addCriterion("auxiliary_unit >=", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitLessThan(String value) {
            addCriterion("auxiliary_unit <", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitLessThanOrEqualTo(String value) {
            addCriterion("auxiliary_unit <=", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("auxiliary_unit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitLike(String value) {
            addCriterion("auxiliary_unit like", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitNotLike(String value) {
            addCriterion("auxiliary_unit not like", value, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitIn(List<String> values) {
            addCriterion("auxiliary_unit in", values, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitNotIn(List<String> values) {
            addCriterion("auxiliary_unit not in", values, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitBetween(String value1, String value2) {
            addCriterion("auxiliary_unit between", value1, value2, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryUnitNotBetween(String value1, String value2) {
            addCriterion("auxiliary_unit not between", value1, value2, "auxiliaryUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("material_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdIsNull() {
            addCriterion("default_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdIsNotNull() {
            addCriterion("default_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdEqualTo(Long value) {
            addCriterion("default_supplier_id =", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdNotEqualTo(Long value) {
            addCriterion("default_supplier_id <>", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdGreaterThan(Long value) {
            addCriterion("default_supplier_id >", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("default_supplier_id >=", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdLessThan(Long value) {
            addCriterion("default_supplier_id <", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("default_supplier_id <=", value, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("default_supplier_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdIn(List<Long> values) {
            addCriterion("default_supplier_id in", values, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdNotIn(List<Long> values) {
            addCriterion("default_supplier_id not in", values, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdBetween(Long value1, Long value2) {
            addCriterion("default_supplier_id between", value1, value2, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andDefaultSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("default_supplier_id not between", value1, value2, "defaultSupplierId");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("bar_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("quantity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceIsNull() {
            addCriterion("market_ref_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceIsNotNull() {
            addCriterion("market_ref_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceEqualTo(Double value) {
            addCriterion("market_ref_price =", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceNotEqualTo(Double value) {
            addCriterion("market_ref_price <>", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceGreaterThan(Double value) {
            addCriterion("market_ref_price >", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("market_ref_price >=", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceLessThan(Double value) {
            addCriterion("market_ref_price <", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceLessThanOrEqualTo(Double value) {
            addCriterion("market_ref_price <=", value, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("market_ref_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceIn(List<Double> values) {
            addCriterion("market_ref_price in", values, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceNotIn(List<Double> values) {
            addCriterion("market_ref_price not in", values, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceBetween(Double value1, Double value2) {
            addCriterion("market_ref_price between", value1, value2, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andMarketRefPriceNotBetween(Double value1, Double value2) {
            addCriterion("market_ref_price not between", value1, value2, "marketRefPrice");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNull() {
            addCriterion("specs is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNotNull() {
            addCriterion("specs is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualTo(String value) {
            addCriterion("specs =", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualTo(String value) {
            addCriterion("specs <>", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThan(String value) {
            addCriterion("specs >", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("specs >=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsLessThan(String value) {
            addCriterion("specs <", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualTo(String value) {
            addCriterion("specs <=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("specs <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecsLike(String value) {
            addCriterion("specs like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotLike(String value) {
            addCriterion("specs not like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsIn(List<String> values) {
            addCriterion("specs in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotIn(List<String> values) {
            addCriterion("specs not in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsBetween(String value1, String value2) {
            addCriterion("specs between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotBetween(String value1, String value2) {
            addCriterion("specs not between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityIsNull() {
            addCriterion("max_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityIsNotNull() {
            addCriterion("max_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityEqualTo(Double value) {
            addCriterion("max_quantity =", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotEqualTo(Double value) {
            addCriterion("max_quantity <>", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThan(Double value) {
            addCriterion("max_quantity >", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("max_quantity >=", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThan(Double value) {
            addCriterion("max_quantity <", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThanOrEqualTo(Double value) {
            addCriterion("max_quantity <=", value, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("max_quantity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMaxQuantityIn(List<Double> values) {
            addCriterion("max_quantity in", values, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotIn(List<Double> values) {
            addCriterion("max_quantity not in", values, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityBetween(Double value1, Double value2) {
            addCriterion("max_quantity between", value1, value2, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxQuantityNotBetween(Double value1, Double value2) {
            addCriterion("max_quantity not between", value1, value2, "maxQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityIsNull() {
            addCriterion("min_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMinQuantityIsNotNull() {
            addCriterion("min_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinQuantityEqualTo(Double value) {
            addCriterion("min_quantity =", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotEqualTo(Double value) {
            addCriterion("min_quantity <>", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThan(Double value) {
            addCriterion("min_quantity >", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("min_quantity >=", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThan(Double value) {
            addCriterion("min_quantity <", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThanOrEqualTo(Double value) {
            addCriterion("min_quantity <=", value, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("min_quantity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinQuantityIn(List<Double> values) {
            addCriterion("min_quantity in", values, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotIn(List<Double> values) {
            addCriterion("min_quantity not in", values, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityBetween(Double value1, Double value2) {
            addCriterion("min_quantity between", value1, value2, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andMinQuantityNotBetween(Double value1, Double value2) {
            addCriterion("min_quantity not between", value1, value2, "minQuantity");
            return (Criteria) this;
        }

        public Criteria andGalleryIsNull() {
            addCriterion("gallery is null");
            return (Criteria) this;
        }

        public Criteria andGalleryIsNotNull() {
            addCriterion("gallery is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryEqualTo(String value) {
            addCriterion("gallery =", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryNotEqualTo(String value) {
            addCriterion("gallery <>", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryGreaterThan(String value) {
            addCriterion("gallery >", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryGreaterThanOrEqualTo(String value) {
            addCriterion("gallery >=", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryLessThan(String value) {
            addCriterion("gallery <", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryLessThanOrEqualTo(String value) {
            addCriterion("gallery <=", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("gallery <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGalleryLike(String value) {
            addCriterion("gallery like", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryNotLike(String value) {
            addCriterion("gallery not like", value, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryIn(List<String> values) {
            addCriterion("gallery in", values, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryNotIn(List<String> values) {
            addCriterion("gallery not in", values, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryBetween(String value1, String value2) {
            addCriterion("gallery between", value1, value2, "gallery");
            return (Criteria) this;
        }

        public Criteria andGalleryNotBetween(String value1, String value2) {
            addCriterion("gallery not between", value1, value2, "gallery");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("is_deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualToColumn(ElMaterial.Column column) {
            addCriterion(new StringBuilder("version <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ElMaterialExample example;

        protected Criteria(ElMaterialExample example) {
            super();
            this.example = example;
        }

        public ElMaterialExample example() {
            return this.example;
        }

        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIsDeletedEqualTo(ElMaterial.IS_DELETED) : andIsDeletedNotEqualTo(ElMaterial.IS_DELETED);
        }

        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}