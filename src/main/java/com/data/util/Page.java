package com.data.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AndrewH on 2016/10/9.
 */
public class Page<T> implements Serializable {
    /**
     * 当前页
     */
    private Integer page;
    /**
     * 总计记录数
     */
    private Integer total;
    /**
     * 页面容量
     */
    private List rows;
    /**
     * 排序字段
     */
    private String sort;
    /**
     * 排序方式 asc desc
     */
    private String order;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
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
