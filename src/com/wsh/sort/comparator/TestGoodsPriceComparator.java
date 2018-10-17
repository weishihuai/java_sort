package com.wsh.sort.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 测试Comparator接口的使用方法
 * @Author: weishihuai
 * @Date: 2018/10/17 22:02
 */
public class TestGoodsPriceComparator {

    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("商品1", 100, 2000));
        goodsList.add(new Goods("商品2", 110, 1000));
        goodsList.add(new Goods("商品3", 10, 3000));

        //按价格降序排序
        System.out.println("排序前: " + Arrays.toString(goodsList.toArray()));
        Collections.sort(goodsList, new GoodsPriceComparator());
        System.out.println("排序后: " + Arrays.toString(goodsList.toArray()));
    }

}
