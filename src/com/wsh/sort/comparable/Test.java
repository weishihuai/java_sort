package com.wsh.sort.comparable;

import java.util.Date;

/**
 * @Description:c 内置引用数据类型比较原理分析
 * @Author: weishihuai
 * @Date: 2018/10/18 22:17
 */
public class Test {

    public static void main(String[] args) {
        //根据基本数据类型数值大小
        Integer a = 120;
//        public static int compare(int x, int y) {
//            return (x < y) ? -1 : ((x == y) ? 0 : 1);
//        }

        Integer b = 100;
        System.out.println(a.compareTo(b) == -1 ? "a < b" : (a.compareTo(b) == 0) ? "a = b" : "a > b");

        //根据Unicode编码大小
        Character c1 = 'a';
        Character c2 = 'c';
//        public static int compare(char x, char y) {
//            return x - y;
//        }

        System.out.println(c1.compareTo(c2) < 0 ? "c1 < c2" : (c1.compareTo(c2) == 0) ? "c1 = c2" : "c1 > c2");


        String s1 = "ad";
        String s2 = "adbf";
//        public int compareTo(String anotherString) {
//            int len1 = value.length;
//            int len2 = anotherString.value.length;
//            int lim = Math.min(len1, len2);
//            char v1[] = value;
//            char v2[] = anotherString.value;
//
//            int k = 0;
//            while (k < lim) {
        //根据字符Unicode进行比较
//                char c1 = v1[k];
//                char c2 = v2[k];
//                if (c1 != c2) {
        //返回第一个不相等的Unicode码大小之差
//                    return c1 - c2;
//                }
//                k++;
//            }
        //返回两个字符串的长度之差
//            return len1 - len2;
//        }

        System.out.println(s1.compareTo(s2) < 0 ? "s1 < s2" : (s1.compareTo(s2) == 0 ? "s1 = s2" : "s1 > s2"));

        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 60 * 1000 * 1000);
//        public int compareTo(Date anotherDate) {
        //获取相应的毫秒数，再进行大小比较
//            long thisTime = getMillisOf(this);
//            long anotherTime = getMillisOf(anotherDate);
//            return (thisTime<anotherTime ? -1 : (thisTime==anotherTime ? 0 : 1));
//        }

        System.out.println(d1.compareTo(d2) == -1 ? "d1 < d2" : (d1.compareTo(d2) == 0 ? "d1 = d2" : "d1 > d2"));
    }

}
