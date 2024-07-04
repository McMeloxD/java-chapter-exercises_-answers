package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 键盘录入一个正整数
 * 定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
 * 在main方法中打印该数字是几位数
 */
public class Topic20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        int count = 0;
        if ( n > 0){
            while (n > 0) {
                n /= 10;
                count++;
                System.out.println(n);
            }
        }

        System.out.println("输入的数是" + count + "位数");
    }
}
