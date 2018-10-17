package com.wsh.sort.insert;

import java.util.Arrays;

/**
 * @Description: 插入排序工具类
 * @Author: weishihuai
 * @Date: 2018/10/16 21:31
 * <p>
 * 原理:
 * 1、从第二个元素开始循环遍历，作为参考值，认定参考值左边的元素都有序。
 * 2、取出参考值的下一个元素，在已经排序的元素序列中从后向前扫描。
 * 3、如果该元素（已排序）大于新元素，则将该元素移到下一位置。
 * 4、重复步骤3，直到找到已排序的元素小于新元素的位置。
 * 5、将新元素插入到该位置。
 * 6、重复步骤2。
 */
public class InsertSortUtils {

    public static int[] sort(int[] array) {
        //从第二个元素开始遍历即可
        for (int i = 1; i < array.length; i++) {
            //参考值
            int temp = array[i];
            //从参考值前面一个元素开始从后往前查找
            int j = i - 1;
            for (; j >= 0; j--) {
                //假如找到比参考值大，数据往后移
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    // 跳出循环
                    break;
                }
            }
            array[j + 1] = temp;
            System.out.println("第" + i + "趟排序后:" + Arrays.toString(array));
        }
        return array;
    }
}
