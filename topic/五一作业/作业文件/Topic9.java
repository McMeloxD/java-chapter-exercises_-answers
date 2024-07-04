package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求：
 * 键盘录入一个三位数，求这个三位数每一位的数字和。
 * 举例：
 * 键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：7。
 */
public class Topic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int n = sc.nextInt();
        if (n >= 100 && n <=999){
            int gw = n % 10;
            int sw = n /10 % 10;
            int bw = n /100;
            int sum = gw + sw + bw;
            System.out.println("它的每一位数字相加为" + bw + "+" + sw + "+" + gw + ", 和为：" + sum );
        }else {
            System.out.println("您输入的不是三位数哦");
        }
    }
}
