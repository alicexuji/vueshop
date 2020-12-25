package com.zb.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/6 21:59
 */
public class PageData<T>  implements Serializable {

    private static final long serialVersionUID = 1577070212241563738L;

    private int pageNum;
    private int pageSize;
    private int totalPage;
    private int total;
    private List<T> list;

    public PageData(List<T> list) {
        this.list = list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
