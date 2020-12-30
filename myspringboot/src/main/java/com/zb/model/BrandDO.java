package com.zb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class BrandDO {

    private Integer id;

    private String brandName;

    private String description;

    private Integer display;

    private Date createTime;

    private Date updateTime;


}
