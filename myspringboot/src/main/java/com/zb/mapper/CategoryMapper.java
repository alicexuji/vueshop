package com.zb.mapper;


import com.zb.model.CategoryDO;
import com.zb.query.CategoryQuery;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryDO record);

    int insertSelective(CategoryDO record);

    CategoryDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryDO record);

    List<CategoryDO> selectByQuery(CategoryQuery cq);
}