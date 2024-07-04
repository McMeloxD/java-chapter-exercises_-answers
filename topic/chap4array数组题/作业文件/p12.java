package com.GO.chapter04Array;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n > 0) {
            yhSanJ(n);
        }else {
            System.out.println("请输入一个正整数!");
        }
    }
/*
    要求：读入一个整数n，输出杨辉三角的前n 行
*/
    public static void yhSanJ(int n) {

        if (n == 1) {
            System.out.println("1");
            return;
        }
        int[][] temp = new int[n][n];
        temp[0][0] = 1;
        //一共n行
        for (int i = 1; i < n; i++) {
            temp[i][0] = 1;   //每行第一个是1
            //每行i个,因为（0，0）已经赋值了1，所以从第1层循环开始,第一个数值不再计算直接赋值
            for (int j = 1; j <= i; j++) {
                //每行从第二个数开始算都等于上一行同位置+前位置的和
                temp[i][j] = temp[i - 1][j] + temp[i - 1][j - 1];
            }
        }
        //打印
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
