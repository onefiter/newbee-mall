package com.onefiter.newbeemall.controller;

import com.onefiter.newbeemall.entity.SalesGoods;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @RequestMapping("/test/type/conversion")
    public void typeConversionTest(String goodsName, float weight, int type, Boolean onSale) {
        System.out.println("goodsName:" + goodsName);
        System.out.println("weight:" + weight);
        System.out.println("type:" + type);
        System.out.println("onSale:" + onSale);
    }

    @RequestMapping(value = "/test/httpmessageconverter", method = RequestMethod.POST)
    public SalesGoods httpMessageConverterTest(@RequestBody SalesGoods salesGoods) {
        System.out.println(salesGoods.toString());
        salesGoods.setType(salesGoods.getType() + 1);
        salesGoods.setGoodsName("商品名：" + salesGoods.getGoodsName());
        return  salesGoods;

    }
}
