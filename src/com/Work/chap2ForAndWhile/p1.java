package com.Work.chap2ForAndWhile;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p1 {
    public static void main(String[] args) {
//        //1. （for 循环）计算1+2+3+...+100 的和
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("1+2+3+...+100 的和"+sum);
        //100以内奇数，每五个换行
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
//第二种方法
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + " ");
//            }
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
}



