package com.zb.mapper;

import com.zb.model.BrandDO;
import com.zb.query.BrandQuery;

import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrandDO record);

    int insertSelective(BrandDO record);

    BrandDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BrandDO record);

    List<BrandDO> selectByQuery(BrandQuery cq);
}
