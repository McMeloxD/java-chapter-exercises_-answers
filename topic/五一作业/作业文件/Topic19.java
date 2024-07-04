package com.GO.test51;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
 * 请输入第一个整数：10
 * 请输入第二个整数：30
 * 请输入第三个整数：20
 * 从大到小的顺序是： 30 20 10
 */
public class Topic19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int num3 = sc.nextInt();
        int[] arr1 = {num1, num2, num3};
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int y = 0; y < arr1.length - 1 ; y++) {
                if (arr1[y] < arr1[y + 1]) {
                    int temp = arr1[y];
                    arr1[y] = arr1[y + 1];
                    arr1[y + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
