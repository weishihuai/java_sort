package com.wsh.sort.selection;

import java.util.Arrays;

/**
 * @Title: SelectionSortUtils
 * @ProjectName java_sort
 * @Description: 选择排序工具类
 * @Author WeiShiHuai
 * @Date 2018/10/16 9:35
 * <p>
 * 选择排序:
 * 原理: 每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕
 * <p>
 * 思路:
 * 1. 待排序数组: int[] array = {5, 6, 3, 7, 2, 1};
 * 2. 第1趟排序，在待排序数据array[0]~array[n-1]中选出最小的数据，将它与array[0]交换；
 * 3. 第2趟排序，在待排序数据array[1]~array[n-1]中选出最小的数据，将它与array[1]交换；
 * 4. 以此类推，第i趟在待排序数据array[i-1]~array[n-1]中选出最小的数据，将它与array[i-1]交换，直到全部排序完成。
 */
public class SelectionSortUtils {

    public static int[] sort(int[] array) {
        int length = array.length - 1;

        //外层循环控制循环的次数
        for (int i = 0; i < length; i++) {
            //假设每一趟第一个元素都是最小值，记录当前索引
            int minIndex = i;
            //从剩余未排序序列中找到最小值下标
            for (int j = i + 1; j < length + 1; j++) {
                if (array[j] < array[minIndex]) {
                    //记录当前最小值下标
                    minIndex = j;
                }
            }

            //如果本身就是最小值下标，则不需要交换
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println("第" + (i + 1) + "趟" + Arrays.toString(array));
        }
        return array;
    }

}
