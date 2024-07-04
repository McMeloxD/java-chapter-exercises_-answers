package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
 */
public class Topic14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        int sum = 0;
        //将小的数值放左边
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i<= num2; i++) {
            sum += i;
        }
        System.out.println("这两个数之内的数字和为：" + sum);
    }
}
