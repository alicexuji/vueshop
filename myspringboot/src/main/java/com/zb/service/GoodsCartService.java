package com.zb.service;

import com.zb.model.GoodsCartDO;
import com.zb.query.GoodsCarQuery;

import java.util.List;

public interface GoodsCartService {

    List<GoodsCartDO> queryGoodsCartList(GoodsCarQuery cq);

    int addGoodsToCart(GoodsCartDO goodsCartDO);

    int updateGoodsCart(GoodsCartDO goodsCartDO);

    int deleteGoods(Integer id);
}
