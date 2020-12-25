package com.zb.service.impl;

import com.zb.mapper.GoodsCartMapper;
import com.zb.model.GoodsCartDO;
import com.zb.query.GoodsCarQuery;
import com.zb.service.GoodsCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCartImpl implements GoodsCartService {

    @Autowired
    private GoodsCartMapper goodsCartMapper;
    @Override
    public List<GoodsCartDO> queryGoodsCartList(GoodsCarQuery cq) {

        return goodsCartMapper.selectByQuery(cq);
    }

    @Override
    public int addGoodsToCart(GoodsCartDO goodsCartDO) {

        return goodsCartMapper.insertSelective(goodsCartDO);
    }

    @Override
    public int updateGoodsCart(GoodsCartDO goodsCartDO) {

        return goodsCartMapper.updateByPrimaryKeySelective(goodsCartDO);
    }

    @Override
    public int deleteGoods(Integer id) {

        return goodsCartMapper.deleteByPrimaryKey(id);
    }
}
