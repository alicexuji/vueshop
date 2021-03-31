package com.zb.query;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductQuery extends BaseQuery {

    private Integer id;
    private Integer display;
    private String name;
}
