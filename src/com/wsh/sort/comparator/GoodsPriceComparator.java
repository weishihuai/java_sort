package com.wsh.sort.comparator;

import java.util.Comparator;

/**
 * @Description: 商品价格比较Comparator (降序)
 * @Author: weishihuai
 * @Date: 2018/10/17 22:12
 */
public class GoodsPriceComparator implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return -(o1.getPrice() - o2.getPrice() > 0 ? 1 : (o1.getPrice() - o2.getPrice()) == 0 ? 0 : -1);
    }
}
