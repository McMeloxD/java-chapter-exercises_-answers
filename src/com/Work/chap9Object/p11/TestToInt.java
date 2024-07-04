package com.Work.chap9Object.p11;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class TestToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(toInt(str));
        System.out.println(toInt2(str));
    }
    //第一种
    public static int toInt(String str) {
        int n = Integer.parseInt(str);
        return n;
    }

    //第二种
    public static int toInt2(String str) {
        Integer it = Integer.valueOf(str);
        int n = it.intValue();
        return n;
    }
}
