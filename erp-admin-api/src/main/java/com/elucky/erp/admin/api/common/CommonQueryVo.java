package com.elucky.erp.admin.api.common;

/**
 * Created by zero on 2018/11/8.
 */
public class CommonQueryVo {
    private Integer page = 0;
    private Integer limit = 10;
    private String sort = "update_time";
    private String order = "desc";

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
