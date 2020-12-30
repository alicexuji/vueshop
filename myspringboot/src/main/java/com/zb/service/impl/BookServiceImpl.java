package com.zb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zb.dao.BookDao;
import com.zb.model.Book;
import com.zb.model.PageData;
import com.zb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public PageData selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Book> books = bookDao.selectAll();
        PageData<Book> pageData = new PageData<>(books);
        return pageData;
    }
}
