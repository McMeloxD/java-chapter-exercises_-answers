package com.qf;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 8. *写一个函数，接受三个整数a, b, c，计算ax2+bx+c=0 的根。
 */
public class p8 {
    public static void main(String[] args) {
        gen(1, 2, 1);
        System.out.println(Math.sqrt(4));
    }

    public static void gen(int a, int b, int c) {
        //一元二次方程a不为0
        if (a != 0) {
            //先判断▲
            int d = b * b - (4 * a * c);
            System.out.println(d);
            //▲>0 有两个不同实根
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("实根分别为" + x1 + "," + x2);
                //▲>0 有两个不同实根
            } else if (d == 0) {
                double x = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("实根为" + x);
                //▲<0 无实根
            }else {
                System.out.println("无实根哦");
            }
        } else {
            System.out.println("a不能为0哦");
        }
    }
}
