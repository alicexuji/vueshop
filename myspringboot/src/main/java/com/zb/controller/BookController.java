package com.zb.controller;

import com.zb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zb.model.Result;
import com.zb.service.BookService;

/**
 * Created by zhangbin on 2018/8/9.
 */
@Controller
public class BookController {

    @Autowired
    private BookService userService;

    @RequestMapping("/booklist")
    @ResponseBody
    public Result getUserList(@RequestBody User user){
//        int pageNum  = (pageInfo.getPageNum() == 0)? 1 : pageInfo.getPageNum();
//        int pageSize  = (pageInfo.getPageSize() == 0)? 10 : pageInfo.getPageSize();
//
        Result result = Result.newInstance();
//        result.setData(userService.selectAll(pageNum, pageSize));

        return result;
    }
}
