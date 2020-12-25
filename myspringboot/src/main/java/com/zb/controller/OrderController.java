package com.zb.controller;

import com.zb.model.OrderDO;
import com.zb.model.PageData;
import com.zb.model.Result;
import com.zb.query.OrderQuery;
import com.zb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 20:12
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/api/order/{id}")
    @ResponseBody
    public Result orderDetail(@PathVariable("id") Integer id) {

        OrderQuery cq = new OrderQuery();
        cq.setId(id);
        OrderDO orderDO = orderService.queryOrderDetail(cq);
        Result result = Result.newInstance();
        result.setData(orderDO);
        return result;
    }

    @GetMapping("/api/order/list")
    @ResponseBody
    public Result orderList(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        OrderQuery cq = new OrderQuery();
        cq.setPageNum(pageNum);
        cq.setPageSize(pageSize);
        List<OrderDO> list = orderService.queryOrderList(cq);
        Result result = Result.newInstance();
        result.setData(new PageData<>(list));

        return result;
    }

    @PostMapping("/api/order/create")
    @ResponseBody
    public Result createOrder(@RequestBody OrderDO orderDO) {

        int num = orderService.createOrder(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/api/order/update/{id}")
    @ResponseBody
    public Result updateOrder(@RequestBody OrderDO orderDO) {

        int num = orderService.updateOrder(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/api/order/delete/{id}")
    @ResponseBody
    public Result deleteOrder(@PathVariable("id") Integer id) {

        int num = orderService.deleteOrder(id);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }


    @PostMapping(value = "/api/update/delivery")
    @ResponseBody
    public Result delivery(@RequestBody OrderDO orderDO) {

        int num = orderService.delivery(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

}
