package com.zb.service;

import com.zb.model.PageData;

/**
 * Created by zhangbin on 2018/8/9.
 */
public interface BookService {
    PageData selectAll(int pageNum, int pageSize);
}
