package com.zb.model;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 5757438163355725464L;

    private Integer code = 200;

    private String message = "操作成功";

    private T data;


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
