package com.GO.chap3method;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/14
 * @desc 10. *验证角谷猜想：任给一个自然数，若为偶数除以2，若为奇数则乘3 加1，
 * 得到一个新的自然数后按照上面的法则继续计算，若干次后得到的结果必然为1。
 * 要求：读入一个自然数，输出计算的步骤。
 */
public class p10 {
    public static void main(String[] args) {
        js();
    }

    public static void js() {
        //先输入一个自然数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个自然数：");
        int n = sc.nextInt();
        //先判断是否自然数，非负整数， n % 1 可以判断是否为浮点数
        if (n > 0 && n % 1 == 0) {
            //因为要持续激素按，所以用while
            while (n > 1) {
                if (n % 2 == 0) {
                    System.out.print(n + "现在是偶数, ");
                    n /= 2;
                    System.out.println("除以2后得到" + n);
                } else {
                    System.out.print(n + "现在是奇数, ");
                    n = n * 3 + 1;
                    System.out.println("乘3加1后得到5" + n);
                }
                }
            System.out.println("最后得到" + n);
            }else{
                System.out.println("不能输入负数或不是整数哦！");
            }
        }
    }
