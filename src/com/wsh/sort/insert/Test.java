package com.wsh.sort.insert;

import java.util.Arrays;

/**
 * @Title: Test
 * @ProjectName java_sort
 * @Description:
 * @Author WeiShiHuai
 * @Date 2018/10/15 14:20
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 7, 2, 1};
        System.out.println("排序前: " + Arrays.toString(array));
        int[] arr = InsertSortUtils.sort(array);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

}
