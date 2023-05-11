package com.onefiter.newbeemall.entity;

public class SalesGoods {
    private Integer id;
    private String goodsName;
    private float weight;

    private int type;

    private Boolean onSale;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SaleGoods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                ", onSale=" + onSale +
                '}';
    }
}
