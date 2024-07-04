package com.Work.dayHWork.week_2.day10;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestWork {
    public static void main(String[] args) {
// 创建对象
        Work wk = new Work();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                wk.do1();
                break;
            case 2:
                wk.do2();
                break;
            case 3:
                wk.do3();
                break;
            case 4:
                wk.do4();
                break;
            case 5:
                wk.do5();
                break;
            default:
                System.out.println("指令错误哦!");
        }
    }
}
