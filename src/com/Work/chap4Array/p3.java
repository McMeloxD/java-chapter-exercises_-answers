package com.GO.chapter04Array;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        avgArray(a);
    }
    /*3. 写一个函数，计算一个整数数组的平均值*/
        public static void avgArray(int[] a) {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println(sum / a.length);
        }
}
