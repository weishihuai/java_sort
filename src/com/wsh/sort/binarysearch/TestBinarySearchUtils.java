package com.wsh.sort.binarysearch;

/**
 * @Description: 测试二分法
 * @Author: weishihuai
 * @Date: 2018/10/19 21:46
 */
public class TestBinarySearchUtils {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int index1 = BinarySearchUtils.binarySearch(arr, 2);
        System.out.println(index1);
        int index2 = BinarySearchUtils.binarySearch(arr, 7);
        System.out.println(index2);
        int index3 = BinarySearchUtils.binarySearch(arr, 0);
        System.out.println(index3);
    }

}
