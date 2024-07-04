package com.GO.chapter04Array;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        findPrime(100);
    }
   /* 14. *筛选法求质数：输入一个整数n，求小于这个整数的所有质数。
    算法：定义一个长度为n 的boolean 数组，true 表示是质数，false 表示
    不是质数。初始均为true。之后从2 开始循环：
            1. 找到第一个值为true 的下标i
2. 把所有下标为i 的倍数的值置为false。
    直到扫描完数组中的所有数值。
    最后遍历数组，如果下标i 的值为true，则说明i 为质数*/

    public static void findPrime(int n) {
        if(n <0){
            System.out.println("输入下标不符合规则哦 ！");
            return; //跳出方法
        }
        //定义一个长度为n 的boolean 数组
        Boolean[] primes = new Boolean[n];
        //初始均为true，表示质数
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        //从2开始循环
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]){
                //判断是否质数
                for (int j = 2;j <= i / 2; j++){
                    if (i % j == 0){
                        primes[i] = false;
                        break; //跳出循环
                    }
                }
            }

            //接着判断如果此数是质数，就把它在n以内所有倍数改为false,筛掉
            if (primes[i]){
                //把该质数下标i的所有倍数改为false,k代表倍数自增，j*k代表倍数下标，要小于n
                for (int j = i, k = 2; j * k < primes.length; k ++ )
                    primes[j * k] = false;
            }
        }

        //打印循环输出
        int count = 0; //统计质数个数是否正确
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]){
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println(n + "以内一共有： " + count + " 个质数");

    }
   /*本方法的解释(埃氏筛选法)：给出要筛数值的范围n，找出以内的素数。先用2去筛，即把2留下，把2的倍数剔除掉；再用下一个质数，
   也就是3筛，把3留下，把3的倍数剔除掉；接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；不断重复下去……。*/
}

