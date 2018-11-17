package com.elucky.erp.db.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ElMaterial {
    public static final Boolean NOT_DELETED = false;

    public static final Boolean IS_DELETED = true;

    private Long id;

    private String materialCode;

    private String materialName;

    private String unit;

    private String auxiliaryUnit;

    private String materialType;

    private Long defaultSupplierId;

    private String barCode;

    private Double quantity;

    private Double marketRefPrice;

    private String specs;

    private Double maxQuantity;

    private Double minQuantity;

    private String gallery;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private Boolean isDeleted;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAuxiliaryUnit() {
        return auxiliaryUnit;
    }

    public void setAuxiliaryUnit(String auxiliaryUnit) {
        this.auxiliaryUnit = auxiliaryUnit;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public Long getDefaultSupplierId() {
        return defaultSupplierId;
    }

    public void setDefaultSupplierId(Long defaultSupplierId) {
        this.defaultSupplierId = defaultSupplierId;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getMarketRefPrice() {
        return marketRefPrice;
    }

    public void setMarketRefPrice(Double marketRefPrice) {
        this.marketRefPrice = marketRefPrice;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public Double getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Double maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Double getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Double minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", materialCode=").append(materialCode);
        sb.append(", materialName=").append(materialName);
        sb.append(", unit=").append(unit);
        sb.append(", auxiliaryUnit=").append(auxiliaryUnit);
        sb.append(", materialType=").append(materialType);
        sb.append(", defaultSupplierId=").append(defaultSupplierId);
        sb.append(", barCode=").append(barCode);
        sb.append(", quantity=").append(quantity);
        sb.append(", marketRefPrice=").append(marketRefPrice);
        sb.append(", specs=").append(specs);
        sb.append(", maxQuantity=").append(maxQuantity);
        sb.append(", minQuantity=").append(minQuantity);
        sb.append(", gallery=").append(gallery);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", version=").append(version);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ElMaterial other = (ElMaterial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMaterialCode() == null ? other.getMaterialCode() == null : this.getMaterialCode().equals(other.getMaterialCode()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getAuxiliaryUnit() == null ? other.getAuxiliaryUnit() == null : this.getAuxiliaryUnit().equals(other.getAuxiliaryUnit()))
            && (this.getMaterialType() == null ? other.getMaterialType() == null : this.getMaterialType().equals(other.getMaterialType()))
            && (this.getDefaultSupplierId() == null ? other.getDefaultSupplierId() == null : this.getDefaultSupplierId().equals(other.getDefaultSupplierId()))
            && (this.getBarCode() == null ? other.getBarCode() == null : this.getBarCode().equals(other.getBarCode()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getMarketRefPrice() == null ? other.getMarketRefPrice() == null : this.getMarketRefPrice().equals(other.getMarketRefPrice()))
            && (this.getSpecs() == null ? other.getSpecs() == null : this.getSpecs().equals(other.getSpecs()))
            && (this.getMaxQuantity() == null ? other.getMaxQuantity() == null : this.getMaxQuantity().equals(other.getMaxQuantity()))
            && (this.getMinQuantity() == null ? other.getMinQuantity() == null : this.getMinQuantity().equals(other.getMinQuantity()))
            && (this.getGallery() == null ? other.getGallery() == null : this.getGallery().equals(other.getGallery()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMaterialCode() == null) ? 0 : getMaterialCode().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getAuxiliaryUnit() == null) ? 0 : getAuxiliaryUnit().hashCode());
        result = prime * result + ((getMaterialType() == null) ? 0 : getMaterialType().hashCode());
        result = prime * result + ((getDefaultSupplierId() == null) ? 0 : getDefaultSupplierId().hashCode());
        result = prime * result + ((getBarCode() == null) ? 0 : getBarCode().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getMarketRefPrice() == null) ? 0 : getMarketRefPrice().hashCode());
        result = prime * result + ((getSpecs() == null) ? 0 : getSpecs().hashCode());
        result = prime * result + ((getMaxQuantity() == null) ? 0 : getMaxQuantity().hashCode());
        result = prime * result + ((getMinQuantity() == null) ? 0 : getMinQuantity().hashCode());
        result = prime * result + ((getGallery() == null) ? 0 : getGallery().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    public void andLogicalDeleted(boolean deleted) {
        setIsDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
        materialCode("material_code", "materialCode", "VARCHAR", false),
        materialName("material_name", "materialName", "VARCHAR", false),
        unit("unit", "unit", "VARCHAR", false),
        auxiliaryUnit("auxiliary_unit", "auxiliaryUnit", "VARCHAR", false),
        materialType("material_type", "materialType", "VARCHAR", false),
        defaultSupplierId("default_supplier_id", "defaultSupplierId", "BIGINT", false),
        barCode("bar_code", "barCode", "VARCHAR", false),
        quantity("quantity", "quantity", "DOUBLE", false),
        marketRefPrice("market_ref_price", "marketRefPrice", "DOUBLE", false),
        specs("specs", "specs", "VARCHAR", false),
        maxQuantity("max_quantity", "maxQuantity", "DOUBLE", false),
        minQuantity("min_quantity", "minQuantity", "DOUBLE", false),
        gallery("gallery", "gallery", "VARCHAR", false),
        createUser("create_user", "createUser", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateUser("update_user", "updateUser", "VARCHAR", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        isDeleted("is_deleted", "isDeleted", "BIT", false),
        version("version", "version", "INTEGER", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}