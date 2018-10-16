package com.wsh.sort.selection;

import java.util.Arrays;

/**
 * @Title: Test
 * @ProjectName java_sort
 * @Description: 测试
 * @Author WeiShiHuai
 * @Date 2018/10/16 9:59
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 7, 2, 1};
        System.out.println("排序前: " + Arrays.toString(arr));
        int[] sortedArr = SelectionSortUtils.sort(arr);
        System.out.println("排序后: " + Arrays.toString(sortedArr));
    }

}
