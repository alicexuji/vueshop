package com.zb.controller;

import com.zb.model.OrderDO;
import com.zb.model.PageData;
import com.zb.model.Result;
import com.zb.query.OrderQuery;
import com.zb.service.OrderService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    @ResponseBody
    public Result orderDetail(@PathVariable("id") Integer id) {

        OrderQuery cq = new OrderQuery();
        cq.setId(id);
        OrderDO orderDO = orderService.queryOrderDetail(cq);
        Result result = Result.newInstance();
        result.setData(orderDO);
        return result;
    }

    @GetMapping("/order/list")
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

    @PostMapping("/order/create")
    @ResponseBody
    public Result createOrder(@RequestBody OrderDO orderDO) {

        int num = orderService.createOrder(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/order/update/{id}")
    @ResponseBody
    public Result updateOrder(@RequestBody OrderDO orderDO) {

        int num = orderService.updateOrder(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/order/delete/{id}")
    @ResponseBody
    public Result deleteOrder(@PathVariable("id") Integer id) {

        int num = orderService.deleteOrder(id);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }


    @PostMapping(value = "/update/delivery")
    @ResponseBody
    public Result delivery(@RequestBody OrderDO orderDO) {

        int num = orderService.delivery(orderDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

}
