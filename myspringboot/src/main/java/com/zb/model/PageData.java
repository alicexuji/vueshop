package com.zb.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/6 21:59
 */
@Setter
@Getter
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

}
