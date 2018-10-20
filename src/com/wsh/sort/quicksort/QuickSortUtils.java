package com.wsh.sort.quicksort;

/**
 * @Title: QuickSortUtils
 * @ProjectName java_sort
 * @Description: 快速排序工具类
 * @Author WeiShiHuai
 * @Date 2018/10/20 17:00
 */
public class QuickSortUtils {

    /**
     *
     * @param array
     * @param low
     * @param hign
     * @return
     */
    private static int getMiddleIndex(int[] array, int low, int hign) {
        //将第一个元素作为参照值
        int referenceValue = array[low];

        while (low < hign) {
            while (low < hign && array[hign] >= referenceValue) {
                hign--;
            }
            array[low] = array[hign];

            while (low < hign && array[low] <= referenceValue) {
                low++;
            }
            array[hign] = array[low];
        }

        array[low] = referenceValue;
        return low;
    }

    public static int[] quickSort(int[] arr, int low, int hign) {
        if (low < hign) {
            int middleIndex = getMiddleIndex(arr, low, hign);
            quickSort(arr, low, middleIndex - 1);
            quickSort(arr, middleIndex + 1, hign);
            return arr;
        }
        return null;
    }

}
