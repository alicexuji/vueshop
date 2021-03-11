package com.zb.query;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 8994082128504200117L;

    /**
     * 起始页从1开始
     */
    private static final Integer defaultFirstPage = 1;
    private static final Integer defaultPageSize = 10;
    private static final Integer defaultTotalItem = 0;
    private static final Boolean defaultNeedPage = Boolean.TRUE;

    private Integer pageSize;
    private Integer pageNum;
    private Integer totalItem;
    private Boolean needPage;
    private int pageFirstItem;
    private String orderBy;
    private String orderColumn;

}
