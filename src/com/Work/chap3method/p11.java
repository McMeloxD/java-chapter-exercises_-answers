package com.GO.chap3method;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/14
 * @desc 11. *已知两个完全平方三位数abc 和xyz，其中a、b、c、x、y、z 未必是不同
 * 的，而ax、by、cz 是三个完全平方数。求abc 和xyz
 */
public class p11 {
    public static void main(String[] args) {
        pfs();
    }

    /**先来一个判断是否完全平方数的方法*/
    public static boolean isPerfectSquare(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n){
                return true;
            }
        }
        return false;
    }
    /**/
    public static void pfs() {
        //先声明一个计数来统计有多少个完全平方三位数
        int count = 0;
        for (int n = 100; n <= 999; n++) {
            //获取完全平方三位数
            if (isPerfectSquare(n)) {
                count += 1;
            }
        }
        //声明一个数组
        int[] sws = new int[count];
        int count2 = 0;
        for (int n = 100; n <= 999; n++) {
            //获取完全平方三位数
            if (isPerfectSquare(n)) {
                sws[count2] = n;
                count2 += 1;
            }
        }
        //输出所有三位数完全平方数
        System.out.println(Arrays.toString(sws));
        //开始循环,因为两个三位数左右位置不同，比较的结果也会不同，所以都要从0开始循环判断
        for (int i = 0; i < sws.length; i++) {
            for (int j = 0; j < sws.length; j++) {
                //将每位数先拆分
                int numC = sws[i] % 10;
                int numB = sws[i] / 10 % 10;
                int numA = sws[i] / 100;
                int numZ = sws[j] % 10;
                int numY = sws[j] / 10 % 10;
                int numX = sws[j] / 100;
                //再合并
                int ax = numA * 10 + numX;
                int by = numB * 10 + numY;
                int cz = numC * 10 + numZ;
                //开始判断并输出
                if (isPerfectSquare(ax) && isPerfectSquare(by) && isPerfectSquare(cz)) {
                    System.out.println("abc是" + numA + numB+ numC + ", xyz是" + numX+ numY+ numZ);
                }
            }
        }
    }

}
