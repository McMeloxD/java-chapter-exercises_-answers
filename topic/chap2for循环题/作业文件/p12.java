package com.qf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p12 {
    public static void main(String[] args) {
        /*12. （循环）**输入一个整数，计算它各位上数字的和。（注意：是任意位的整
        数）*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        //将数字转为字符串
        String Snum = String.valueOf(n);
        //拆分为字符串数组
        String[] numArr = Snum.split("");
        //转为数字求和
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += Integer.parseInt(numArr[i]);
        }
        System.out.println(sum);
    }
}
