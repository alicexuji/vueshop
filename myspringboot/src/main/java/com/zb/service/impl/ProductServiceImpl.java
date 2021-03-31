package com.zb.service.impl;

import com.zb.mapper.BrandMapper;
import com.zb.mapper.CategoryMapper;
import com.zb.mapper.ProductMapper;
import com.zb.model.BrandDO;
import com.zb.model.CategoryDO;
import com.zb.model.ProductDO;
import com.zb.query.BrandQuery;
import com.zb.query.CategoryQuery;
import com.zb.query.ProductQuery;
import com.zb.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public CategoryDO queryCategoryDetail(CategoryQuery cq) {
        return categoryMapper.selectByPrimaryKey(cq.getId());
    }

    @Override
    public List<CategoryDO> queryCategoryList(CategoryQuery cq) {

        return categoryMapper.selectByQuery(cq);
    }

    @Override
    public int addCategory(CategoryDO categoryDO) {
        return categoryMapper.insertSelective(categoryDO);
    }

    @Override
    public int updateCategory(CategoryDO categoryDO) {
        return categoryMapper.updateByPrimaryKeySelective(categoryDO);
    }

    @Override
    public int updateCategoryStatus(CategoryDO categoryDO) {
        return categoryMapper.updateByPrimaryKeySelective(categoryDO);
    }

    @Override
    public int deleteCategory(Integer id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int createProduct(ProductDO productDO) {

//        ProductDO productDO = new ProductDO();
//        BeanUtils.copyProperties(productDO, productDO);
//        productDO.setSellPrice(new BigDecimal(productDO.getSellPrice()));
//        productDO.setCreateTime(new Date());
//        productDO.setUpdateTime(productDO.getCreateTime());

        return productMapper.insertSelective(productDO);
    }

    @Override
    public int updateProduct(ProductDO productDO) {
        return productMapper.updateByPrimaryKeySelective(productDO);
    }

    @Override
    public int deleteProduct(Integer id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateProductPublishStatus(ProductDO productDO) {
        return productMapper.updateByPrimaryKeySelective(productDO);
    }

    @Override
    public ProductDO queryProductDetail(ProductQuery cq) {
        return productMapper.selectByPrimaryKey(cq.getId());
    }

    @Override
    public List<ProductDO> productList(ProductQuery cq) {
        return productMapper.selectByQuery(cq);
    }

    @Override
    public List<BrandDO> queryBrandList(BrandQuery cq) {

        return brandMapper.selectByQuery(cq);
    }

    @Override
    public List<ProductDO> productListByCategory(CategoryQuery cq) {
        return productMapper.selectByCategoryQuery(cq);
    }

    @Override
    public List<ProductDO> searchProduct(ProductQuery cq) {
        return productMapper.searchByName(cq);
    }

}
