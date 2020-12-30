package com.zb.dao;

import com.zb.model.Book;

import java.util.List;


public interface BookDao {
    List<Book> selectAll();
}
