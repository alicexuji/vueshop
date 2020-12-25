package com.zb.mapper;

import com.zb.model.GoodsCartDO;
import com.zb.query.GoodsCarQuery;

import java.util.List;

public interface GoodsCartMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(GoodsCartDO record);

    List<GoodsCartDO> selectByQuery(GoodsCarQuery cq);

    int updateByPrimaryKeySelective(GoodsCartDO record);

    GoodsCartDO selectByPrimaryKey(Integer id);

}
