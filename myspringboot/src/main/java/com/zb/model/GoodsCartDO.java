package com.zb.model;


import java.math.BigDecimal;

public class GoodsCartDO {

    private Integer id;

    private Integer count;

    private Integer goodsId;

    private String goodsName;

    private String goodsPicurl;

    private String username;

    private BigDecimal price;

    private Integer checked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsPicurl() {
        return goodsPicurl;
    }

    public void setGoodsPicurl(String goodsPicurl) {
        this.goodsPicurl = goodsPicurl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public Integer getChecked() {
        return checked;
    }
}
