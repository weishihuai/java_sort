package com.wsh.sort.quicksort;

import java.util.Arrays;

/**
 * @Title: TestQuickSortUtils
 * @ProjectName java_sort
 * @Description: 测试快速排序
 * @Author WeiShiHuai
 * @Date 2018/10/20 17:00
 */
public class TestQuickSortUtils {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 9, 7, 1, 2, 4};
        int[] newArr = QuickSortUtils.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(newArr));
    }
}
