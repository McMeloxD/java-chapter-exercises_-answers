package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("原本的数组：" + Arrays.toString(arr));
        reverseArr(arr);
    }
/*
    7. *给定一个数组，把这个数组中所有元素顺序进行颠倒。
*/
    public static void reverseArr(int[] arr) {
        //声明一个干杂活的小二
        int temp;
        //第一位和最后一位换，长度/2刚好满足如果是偶数长度，全部换；如果是奇数，中间的不用换
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("颠倒后的数组：" + Arrays.toString(arr));
    }
}
