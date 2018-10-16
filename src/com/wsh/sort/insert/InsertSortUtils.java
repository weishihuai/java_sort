package com.wsh.sort.insert;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/10/16 21:31
 */
public class InsertSortUtils {

    public static int[] sort(int[] array) {
        // 比较次数,从第二个元素开始遍历即可
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            //找到第一个比该数据小的数据的位置。
            int j = i - 1;
            for (; j >= 0; j--) {
                //判断数据与该数据大小
                if (array[j] > temp) {
                    // 数据比该数据大，数据往后顺移
                    array[j + 1] = array[j];
                } else {
                    // 跳出循环
                    break;
                }
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
