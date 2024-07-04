package com.GO.test51;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
public class Topic11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n = scanner.nextInt();
        System.out.println("请输入第二个数");
        int n2 = scanner.nextInt();
        System.out.println("请输入第三个数");
        int n3 = scanner.nextInt();
        int[] arr = {n,n2,n3};
        Arrays.sort(arr);
        System.out.println("最小值是: " + arr[0]);
    }
}
