package com.zb.model;

import java.io.Serializable;


/**
 * @author zhenwei.xu
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 5757438163355725464L;

    private Integer code = 200;

    private String message = "操作成功";

    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    //    private boolean success = true;

//    private BaseQuery query;

//    private Integer totalItem;

//    public BaseQuery getQuery() {
//        return query;
//    }
//
//    public void setQuery(BaseQuery query) {
//        this.query = query;
//    }

//    public T getModel() {
//        return model;
//    }
//
//    public void setModel(T model) {
//        this.model = model;
//    }
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public Integer getTotalItem() {
//        return totalItem;
//    }
//
//    public void setTotalItem(Integer totalItem) {
//        this.totalItem = totalItem;
//    }

    public static Result newInstance(){
        return new Result();
    }
}
