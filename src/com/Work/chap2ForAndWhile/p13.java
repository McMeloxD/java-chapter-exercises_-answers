package com.GO.chaperForWhile;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p13 {
    public static void main(String[] args) {
        /*13. （循环）**输入一整数A，判断它是否质数。
        提示1：若从2 到A 的平方根的范围内，没有一个数能整除A，则A 是质数。
        提示2：在java 中计算n 的平方根可以使用Math.sqrt(n)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            }
        if (flag){
            System.out.println(n + "是质数");
        }else {
            System.out.println(n + "不是质数");
        }
        }
    }

