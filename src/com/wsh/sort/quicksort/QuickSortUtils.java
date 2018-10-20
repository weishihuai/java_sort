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
     * 获取基准值的位置
     *
     * @param array 待排序数组
     * @param low   起始位置
     * @param hign  终止位置
     * @return
     */
    private static int getReferIndex(int[] array, int low, int hign) {
        //将第一个元素作为参照值
        int referenceValue = array[low];

        while (low < hign) {
            //从后往前找,如果没有找到比基准值小的元素,那么执行hign--
            while (low < hign && array[hign] >= referenceValue) {
                hign--;
            }
            //将比基准值小的值移动到左边
            array[low] = array[hign];

            //从前往后找,如果没有找到比基准值大的元素,那么执行low++
            while (low < hign && array[low] <= referenceValue) {
                low++;
            }
            //将比基准值大的数移动到右边
            array[hign] = array[low];
        }
        array[low] = referenceValue;
        return low;
    }

    /**
     * 快速排序递归实现
     *
     * @param arr  待排序数组
     * @param low  起始位置
     * @param hign 终止位置
     * @return
     */
    public static int[] quickSort(int[] arr, int low, int hign) {
        if (low >= hign) {
            return null;
        }
        int middleIndex = getReferIndex(arr, low, hign);
        //递归对左边的数组(所有比基准值小的元素)进行排序
        quickSort(arr, low, middleIndex - 1);
        //递归对右边的数组(所有比基准值大的元素)进行排序
        quickSort(arr, middleIndex + 1, hign);
        return arr;
    }

}
