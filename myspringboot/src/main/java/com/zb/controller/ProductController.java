package com.zb.controller;

import com.zb.model.*;
import com.zb.query.BrandQuery;
import com.zb.query.CategoryQuery;
import com.zb.query.ProductQuery;
import com.zb.service.ProductService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/productCategory/list")
    @ResponseBody
    public Result categoryList(
        @RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {

        CategoryQuery cq = new CategoryQuery();
//        cq.setId(parentId);
        List<CategoryDO> list = productService.queryCategoryList(cq);

        Result result = Result.newInstance();
        result.setData(new PageData<>(list));
        return result;
    }


    @GetMapping("/productCategory/{id}")
    @ResponseBody
    public Result categoryDetail(@PathVariable("id") Integer id) {

        CategoryQuery cq = new CategoryQuery();
        cq.setId(id);
        CategoryDO categoryDO = productService.queryCategoryDetail(cq);

        Result result = Result.newInstance();
        result.setData(categoryDO);
        return result;
    }

    @PostMapping(value = "/productCategory/create")
    @ResponseBody
    public Result addCategory(@RequestBody CategoryDO categoryDO) {

        int num = productService.addCategory(categoryDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/productCategory/update/{id}")
    @ResponseBody
    public Result updateCategory(@RequestBody CategoryDO categoryDO) {

        int num = productService.updateCategory(categoryDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/productCategory/delete/{id}")
    @ResponseBody
    public Result deleteCategory(@PathVariable("id") Integer id) {

        int num = productService.deleteCategory(id);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @GetMapping("/product/list")
    @ResponseBody
    public Result productList(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {

        ProductQuery cq = new ProductQuery();
        cq.setPageNum(pageNum);
        cq.setPageSize(pageSize);


        List<ProductDO> list = productService.productList(cq);
        Result result = Result.newInstance();
        result.setData(new PageData<>(list));
        return result;
    }

    @PostMapping("/product/list")
    @ResponseBody
    public Result productListByCategory(@RequestBody CategoryQuery query ) {
//        CategoryQuery cq = new CategoryQuery();
//        cq.setId(id);
//        cq.setPageNum(pageNum);
//        cq.setPageSize(pageSize);


        List<ProductDO> list = productService.productListByCategory(query);
        Result result = Result.newInstance();
        result.setData(new PageData<>(list));
        return result;

    }

    @GetMapping("/brand/list")
    @ResponseBody
    public Result brandList(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {

        BrandQuery cq = new BrandQuery();
        cq.setPageNum(pageNum);
        cq.setPageSize(pageSize);

        List<BrandDO> list = productService.queryBrandList(cq);

        Result result = Result.newInstance();
        result.setData(new PageData<>(list));

        return result;
    }

    @GetMapping("/product/updateInfo/{id}")
    @ResponseBody
    public Result updateProduct(@PathVariable("id") Integer id) {

        ProductQuery cq = new ProductQuery();
        cq.setId(id);
        ProductDO productDO = productService.queryProductDetail(cq);
        Result result = Result.newInstance();
        result.setData(productDO);
        return result;
    }

    @PostMapping("/product/create")
    @ResponseBody
    public Result createProduct(@RequestBody ProductDO productDO) {

        int num = productService.createProduct(productDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/product/update/{id}")
    @ResponseBody
    public Result updateProduc(@RequestBody ProductDO productDO) {

        int num = productService.updateProduct(productDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/product/delete/{id}")
    @ResponseBody
    public Result deleteProduct(@PathVariable("id") Integer id) {

        int num = productService.deleteProduct(id);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/product/update/publishStatus")
    @ResponseBody
    public Result updateProductPublishStatus(@RequestParam(value = "id") Integer id, @RequestParam(value = "publishStatus") Integer publishStatus) {

        ProductDO productDO = new ProductDO();
        productDO.setId(id);
        productDO.setPublishStatus(publishStatus);
        int num = productService.updateProductPublishStatus(productDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }


}
