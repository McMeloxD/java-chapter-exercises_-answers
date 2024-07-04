package com.Work.dayHWork.week_2.day14.ms;

import java.util.Random;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/31
 * @desc
 */
public class yzm {
    public static void main(String[] args) {
        yzm1();
        yzm2();
    }

    private static void yzm1() {
        Random random = new Random();
        int a1 = random.nextInt(10);
        int a2 = random.nextInt(10);
        int a3 = random.nextInt(10);
        int a4 = random.nextInt(10);
        int a5 = random.nextInt(10);
        int a6 = random.nextInt(10);
        String yzm = "" +a1 + a2 + a3 + a4 + a5 + a6;
        System.out.println(yzm);
    }
    private static void yzm2() {
       int a1 = (int)(Math.random() * 10);
       int a2 = (int)(Math.random() * 10);
       int a3 = (int)(Math.random() * 10);
       int a4 = (int)(Math.random() * 10);
       int a5 = (int)(Math.random() * 10);
       int a6 = (int)(Math.random() * 10);

        String yzm = "" +a1 + a2 + a3 + a4 + a5 + a6;
        System.out.println(yzm);
    }
}
