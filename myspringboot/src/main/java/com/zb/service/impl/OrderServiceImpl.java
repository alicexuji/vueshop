package com.zb.service.impl;

import com.zb.mapper.OrderMapper;
import com.zb.model.OrderDO;
import com.zb.query.OrderQuery;
import com.zb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderDO queryOrderDetail(OrderQuery cq) {
        return orderMapper.selectByPrimaryKey(cq.getId());
    }

    @Override
    public List<OrderDO> queryOrderList(OrderQuery cq) {

        return orderMapper.selectByQuery(cq);
    }

    @Override
    public int createOrder(OrderDO orderDO) {
        return orderMapper.insertSelective(orderDO);
    }

    @Override
    public int updateOrder(OrderDO orderDO) {
        return orderMapper.updateByPrimaryKeySelective(orderDO);
    }

    @Override
    public int deleteOrder(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }


    @Override
    public int delivery(OrderDO orderDO) {
        return orderMapper.updateByPrimaryKeySelective(orderDO);
    }



}
