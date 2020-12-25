package com.zb.controller;

import com.zb.model.GoodsCartDO;
import com.zb.model.PageData;
import com.zb.model.Result;
import com.zb.query.GoodsCarQuery;
import com.zb.service.GoodsCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class GoodsCartController {

    @Autowired
    private GoodsCartService goodsCartService;

    @GetMapping("/api/cartGoods/list")
    @ResponseBody
    public Result queryGoodsCartList(@RequestParam(value = "username") String username,@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {

        GoodsCarQuery cq = new GoodsCarQuery();
        cq.setPageNum(pageNum);
        cq.setPageSize(pageSize);
        cq.setUsername(username);
        List<GoodsCartDO> list = goodsCartService.queryGoodsCartList(cq);

        Result result = Result.newInstance();
        result.setData(new PageData<>(list));
        return result;
    }

    @PostMapping("/api/cartGoods/add")
    @ResponseBody
    public Result addGoodsToCart(@RequestBody GoodsCartDO goodsCartDO) {

        int num = goodsCartService.addGoodsToCart(goodsCartDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

    @PostMapping("/api/cartGoods/update/{id}")
    @ResponseBody
    public Result updateGoodsCart(@RequestBody GoodsCartDO goodsCartDO) {

        int num = goodsCartService.updateGoodsCart(goodsCartDO);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }



    @PostMapping("/api/cartGoods/delete/{id}")
    @ResponseBody
    public Result deleteGoods(@PathVariable("id") Integer id) {

        int num = goodsCartService.deleteGoods(id);
        Result result = Result.newInstance();
        result.setData(num == 1);
        return result;
    }

}
