package com.wsh.sort.comparator;

/**
 * @Description: 商品类
 * @Author: weishihuai
 * @Date: 2018/10/17 22:09
 */
public class Goods {
    /**
     * 商品名称
     */
    private String name;
    /**
     * 浏览量
     */
    private int hits;
    /**
     * 商品价格
     */
    private double price;

    public Goods() {
    }

    public Goods(String name, int hits, double price) {
        this.name = name;
        this.hits = hits;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", hits=" + hits +
                ", price=" + price +
                '}' + "\n";
    }

}
