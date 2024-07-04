package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 假定数字6是一个真正伟大的数字，键盘录入两个整数。
 *
 * 如果其中一个为6，最终结果输出true。
 *
 * 如果它们的和为6的倍数。最终结果输出true。
 *
 * 其他情况都是false。
 */
public class Topic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int n2 = sc.nextInt();
        int n3 = (n1 + n2) % 6;
        System.out.println(n3);
        if (n1 == 6 || n2 == 6) {
            System.out.println(true);
        } else if ((n1 + n2) % 6 == 0  ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
