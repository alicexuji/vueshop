package com.zb.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDO {

    private Integer id;

    private Integer categoryId;

    private Integer brandId;

    private String name;

    private String sale;

    private BigDecimal sellPrice;

    private String description;

    private String picUrl;

    private Integer publishStatus;

    private Date createTime;

    private Date updateTime;
}