package com.zb.query;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CategoryQuery extends BaseQuery {
    private static final long serialVersionUID = -766480787182918438L;

    private Integer id;
    private Integer categoryId;
    private Integer display;

}
