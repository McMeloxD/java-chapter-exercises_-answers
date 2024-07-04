package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p10 {
    public static void main(String[] args) {
        int[] a = {1,3,2,7,5};
        puppleSort(a);
        System.out.println(Arrays.toString(a));
    }
    /*10. *完成数组的冒泡排序算法：给定一个数组：int[] a = {1,3,2,7,5}，利用
    冒泡排序对其按照从小到大的顺序排序，然后输出结果。*/
    public static void puppleSort(int[] arr) {
        int temp = 0; //声明一个打杂变量
        //代表循环整个次数
        for (int i = 0; i < arr.length - 1; i++) {
            //从0开始到倒数第二个依次与后面进行比较,第二层循环次数也越来越少，后面的都排过序了
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
