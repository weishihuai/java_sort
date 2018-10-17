package com.wsh.sort.comparable;

import java.util.*;

/**
 * @Description: 测试Comparable接口的使用方法
 * @Author: weishihuai
 * @Date: 2018/10/17 22:02
 */
public class TestNewsComparable {

    public static void main(String[] args) {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(100, new Date(), "hello1"));
        newsList.add(new News(70, new Date(System.currentTimeMillis() - 1000 * 60 * 60), "hello2"));
        newsList.add(new News(110, new Date(System.currentTimeMillis() - 1000 * 60 * 60), "hello4"));
        newsList.add(new News(110, new Date(System.currentTimeMillis() - 1000 * 60 * 60), "hello5"));
        newsList.add(new News(80, new Date(System.currentTimeMillis() + 1000 * 60 * 60), "hello3"));
        System.out.println("排序前: " + Arrays.toString(newsList.toArray()));
        Collections.sort(newsList);
        System.out.println("排序后: " + Arrays.toString(newsList.toArray()));
    }

}
