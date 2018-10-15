package com.wsh.sort.bubbling;

/**
 * @Title: BubblingSortUtils
 * @ProjectName java_sort
 * @Description: 冒泡排序工具类
 * @Author WeiShiHuai
 * @Date 2018/10/15 14:14
 * <p>
 * 排序算法: 比较两个相邻的元素，将值大的元素交换至右端。(假设从小到大排序)
 * 每进行一趟排序，就会少比较一次，因为每进行一趟排序都会找出一个较大值
 * <p>
 * <p>
 * 排序思路:(假设从小到大排序)
 * 1、比较相邻的元素。如果第一个比第二个大（小），那么交换两者的位置。
 * 2、对每一对相邻元素作同样的操作，从开始第一对到结尾的最后一对。一趟排完后，最后的元素会是最大的数。
 * 3、针对所有的元素重复以上的步骤，除了最后已经选出的元素（有序）。
 * 4、持续每次对越来越少的元素（无序元素）重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubblingSortUtils {

    /**
     * 冒泡排序工具类
     *
     * @param array 待排序数组
     * @return 排序后的数组
     */
    public static int[] sort(int[] array) {
        //外循环控制总共需要多少趟
        for (int i = 0, len = array.length - 1; i < len; i++) {
            //内层循环控制每一趟比较的次数
            for (int j = 0, length = array.length - 1 - i; j < length; j++) {
                //后一个比前一个的值大，则交换位置
                if (array[j] > array[j + 1]) {
                    //使用中间值进行交换
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
