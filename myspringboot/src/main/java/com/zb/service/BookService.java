package com.zb.service;

import com.zb.model.PageData;


public interface BookService {
    PageData selectAll(int pageNum, int pageSize);
}
