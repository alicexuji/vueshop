package com.zb.service;

import com.zb.model.OrderDO;
import com.zb.query.OrderQuery;

import java.util.List;

public interface OrderService {

    List<OrderDO> queryOrderList(OrderQuery cq);

    OrderDO queryOrderDetail(OrderQuery cq);

    int updateOrder(OrderDO orderDO);

    int deleteOrder(Integer id);

    int createOrder(OrderDO orderDO);

    //发货
    int delivery(OrderDO orderDO);


}
