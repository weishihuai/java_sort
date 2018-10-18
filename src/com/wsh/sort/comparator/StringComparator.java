package com.wsh.sort.comparator;

import java.util.Comparator;

/**
 * @Description: 内置类String比较器
 * @Author: weishihuai
 * @Date: 2018/10/18 22:46
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String string1, String string2) {
        //根据长度比较
        return string1.length() - string2.length();
    }
}
