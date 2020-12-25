package com.zb.mapper;


import com.zb.model.ProductDO;
import com.zb.query.CategoryQuery;
import com.zb.query.ProductQuery;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProductDO record);

    List<ProductDO> selectByQuery(ProductQuery cq);

    int updateByPrimaryKeySelective(ProductDO record);

    ProductDO selectByPrimaryKey(Integer id);

    List<ProductDO> selectByCategoryQuery(CategoryQuery cq);

}