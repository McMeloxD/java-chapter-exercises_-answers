package com.GO.chap3method;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/14
 * @desc 12. *如果整数A 的全部因子（包括1，不包括A 本身）之和等于B，且整数B 的
 * 全部因子包括1，不包括B 本身）之和等于A，则称整数A\B 是一对亲密数。求3000
 * 以内的全部亲密数。  220-- 284    1184--1210    2620--2924
 */
public class p12 {
    public static void main(String[] args) {
        qms();
    }

    public static void qms() {
        //循环3000
        for (int i = 1; i < 3000; i++) {
            //将A的因子和存到b
            int b = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    b += j;
                }
            }
            //将b的因子和存到num
            int num = 0;
            for (int i1 = 1;i1 <= b / 2;i1++) {
                if (b % i1 == 0) {
                    num += i1;
                }
            }
            //排除两数相等和反过来重复出现情况
            if (num == i && i < b) {
                System.out.println(i + "==" + b);
            }
        }
    }
}
