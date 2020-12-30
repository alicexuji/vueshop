package com.zb.model;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
public class GoodsCartDO {

    private Integer id;

    private Integer count;

    private Integer goodsId;

    private String goodsName;

    private String goodsPicurl;

    private String username;

    private BigDecimal price;

    private Integer checked;
}
