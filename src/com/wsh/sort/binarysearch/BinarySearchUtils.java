package com.wsh.sort.binarysearch;

/**
 * @Description: 二分查找法
 * @Author: weishihuai
 * @Date: 2018/10/19 21:38
 */
public class BinarySearchUtils {

    /**
     * 根据指定值查找在数组中的位置
     *
     * @param arr   待查找有序数组
     * @param value 指定值
     * @return 返回值在数组中对应的下标位置
     */
    public static int binarySearch(int[] arr, int value) {
        //起始位置
        int start = 0;
        //结束位置
        int end = arr.length - 1;

        while (true) {
            //计算中间位置下标
            int mid = (start + end) / 2;
            //中间值
            int midValue = arr[mid];

            if (value == midValue) {
                return mid;
            } else {
                //待查找数值比中间值小,需要将end = mid - 1
                if (midValue > value) {
                    end = mid - 1;
                } else {
                    //待查找数值比中间值大,需要将start = mid + 1
                    start = mid + 1;
                }
            }

            if (start > end) {
                //start > end,说明未找到相应的元素,返回-1
                return -1;
            }
        }
    }

}
