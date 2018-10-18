package com.wsh.sort.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 测试
 * @Author: weishihuai
 * @Date: 2018/10/18 22:47
 */
public class TestStringComparator {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("zhangsan");
        stringList.add("lisi");
        stringList.add("wangwu");
        Collections.sort(stringList, new StringComparator());
        System.out.println(Arrays.toString(stringList.toArray()));
    }

}
