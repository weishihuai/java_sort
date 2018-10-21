package com.wsh.sort.comparator;

import java.util.Comparator;

/**
 * @Description: 商品点击量比较Comparator (升序)
 * @Author: weishihuai
 * @Date: 2018/10/17 22:12
 */
public class GoodsFitsComparator implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getHits() - o2.getHits() > 0 ? 1 : (o1.getHits() - o2.getHits() == 0 ? 0 : -1);
    }
}
