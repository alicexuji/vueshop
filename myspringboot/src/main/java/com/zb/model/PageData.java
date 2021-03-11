package com.zb.model;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

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
    private Long total;
    private List<T> list;

    public PageData(List<T> list) {

//        this.list = list;
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        this.setPageNum(pageInfo.getPageNum());
        this.setPageSize(pageInfo.getPageSize());
        this.setTotalPage(pageInfo.getPages());
        this.setList(pageInfo.getList());
        this.setTotal(pageInfo.getTotal());
    }

//    /**
//     * 将PageHelper分页后的list转为分页信息
//     */
//    public static <T> PageData<T> PageData(List<T> list) {
//        PageData<T> result = new PageData<>();
////        PageData<T> result = new PageData<T>();
//        PageInfo<T> pageInfo = new PageInfo<T>(list);
//        result.setTotalPage(pageInfo.getPages());
//        result.setPageNum(pageInfo.getPageNum());
//        result.setPageSize(pageInfo.getPageSize());
//        result.setTotal(pageInfo.getTotal());
//        result.setList(pageInfo.getList());
//        return result;
//    }
//
//    /**
//     * 将SpringData分页后的list转为分页信息
//     */
//    public static <T> PageData<T> restPage(Page<T> pageInfo) {
//        PageData<T> result = new PageData<T>();
//        result.setTotalPage(pageInfo.getTotalPages());
//        result.setPageNum(pageInfo.getNumber());
//        result.setPageSize(pageInfo.getSize());
//        result.setTotal(pageInfo.getTotalElements());
//        result.setList(pageInfo.getContent());
//        return result;
//    }

}
