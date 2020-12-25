package com.zb.service;

import com.zb.model.BrandDO;
import com.zb.model.CategoryDO;
import com.zb.model.ProductDO;
import com.zb.query.BrandQuery;
import com.zb.query.CategoryQuery;
import com.zb.query.ProductQuery;

import java.util.List;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 20:33
 */
public interface ProductService {
    List<CategoryDO> queryCategoryList(CategoryQuery cq);

    CategoryDO queryCategoryDetail(CategoryQuery cq);

    int addCategory(CategoryDO categoryDO);

    int updateCategory(CategoryDO categoryDO);

    int deleteCategory(Integer id);

    int createProduct(ProductDO productDO);

    int updateProductPublishStatus(ProductDO productDO);

    int updateProduct(ProductDO productDO);

    int deleteProduct(Integer id);

    ProductDO queryProductDetail(ProductQuery cq);

    List<ProductDO> productList(ProductQuery cq);

    List<ProductDO> productListByCategory(CategoryQuery cq);

    List<BrandDO> queryBrandList(BrandQuery cq);
}
