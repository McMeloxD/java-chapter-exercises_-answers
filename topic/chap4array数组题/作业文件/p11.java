package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p11 {
    public static void main(String[] args) {
        int[] a = {1,3,2,7,5};
        chooseSort(a);
        System.out.println(Arrays.toString(a));
    }
    /*选择排序*/
    public static void chooseSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i; //声明最小值的下标
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;    //如果后面某一个比当前最小值小，就记录下标
                }
            }
            int temp = a[index];
            a[index] = a[i];//把当前最外层也就是刚认为当前最小的数放到原本a【j】的位置
            a[i] = temp; //把本轮循环中最小值放在当前最外层循环的下标里
        }
    }
}
