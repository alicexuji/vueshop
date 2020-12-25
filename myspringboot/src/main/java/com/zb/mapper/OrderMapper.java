package com.zb.mapper;

import com.zb.model.OrderDO;
import com.zb.query.OrderQuery;

import java.util.List;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDO record);

    List<OrderDO> selectByQuery(OrderQuery cq);
}
