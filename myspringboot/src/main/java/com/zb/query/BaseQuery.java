package com.zb.query;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 8994082128504200117L;

    /**
     * 起始页从1开始
     */
    private static final Integer defaultFirstPage = 1;
    private static final Integer defaultPageSize = 10;
    private static final Integer defaultTotalItem = 0;
    private static final Boolean defaultNeedPage = Boolean.TRUE;

    private Integer pageSize;
    private Integer pageNum;
    private Integer totalItem;
    private Boolean needPage;
    private int pageFirstItem;
    private String orderBy;
    private String orderColumn;

    public Boolean isNeedPage() {
        if (needPage == null) {
            return defaultNeedPage;
        }
        return needPage;
    }

    public void setNeedPage(Boolean needPage) {
        if (null == needPage) {
            this.needPage = defaultNeedPage;
        } else {
            this.needPage = needPage;
        }
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return defaultPageSize;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if ((pageSize == null) || (pageSize <= 0)) {
            this.pageSize = null;
        } else {
            this.pageSize = pageSize;
        }
    }

    public Integer getPageNum() {
        if (pageNum == null) {
            return defaultFirstPage;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if ((pageNum == null) || (pageNum <= 0)) {
            this.pageNum = null;
        } else {
            this.pageNum = pageNum;
        }
    }

    public Integer getTotalItem() {
        if (totalItem == null) {
            return defaultTotalItem;
        }
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    public int getPageFirstItem() {
        int cPage = this.getPageNum();
        int pgSize = this.getPageSize();
        return (cPage - 1) * pgSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = StringUtils.isNotBlank(orderBy) ? orderBy : null;
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = StringUtils.isNotBlank(orderColumn) ? orderColumn : null;
    }

}
