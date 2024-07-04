package com.GO.chap3method;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 1. 写一个函数add，接受两个整数作为参数，返回这两个整数的和。
 */
public class p1 {
    public static void main(String[] args) {
        int sum = add(99,1);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
