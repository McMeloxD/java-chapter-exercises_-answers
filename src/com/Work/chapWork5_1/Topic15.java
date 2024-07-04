package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求：键盘录入两个数字，表示一个范围。
 *            统计这个范围中。
 * 	    既能被3整除，又能被5整除数字有多少个？
 */
public class Topic15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        //将小的数值放左边
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int count = 0;
        for ( int i = num1; i<= num2; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count += 1;
            }
        }
        System.out.println("这两个数字之内能同时被3和5整除的数有:" + count +"个");
    }
}
