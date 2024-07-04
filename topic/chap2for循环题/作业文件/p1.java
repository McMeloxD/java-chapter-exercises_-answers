package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p1 {
    public static void main(String[] args) {
        //1. （for 循环）计算1+2+3+...+100 的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+100 的和"+sum);
    }
}
