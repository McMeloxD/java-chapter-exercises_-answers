package com.OftenUseUtil;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/21
 * @desc
 */
public class printArr {
    //数组打印方法
    public static void printArr(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                s = s + arr[i] + ",";
            } else {
                s = s + arr[i] + "]";
            }
        }
        System.out.println(s );
    }
}
