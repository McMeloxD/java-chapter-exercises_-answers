package com.Work.dayHWork.week_2.day14.ms;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/31
 * @desc
 */
public class p3 {
    public static void main(String[] args) {
        String s = "AACCAA";
        //StringBuilder s3 = new StringBuilder(s);  //反转过程展开写，因为反转是StringBuilder提供的方法
        //s3.reverse();
        String s2 = new StringBuilder(s).reverse().toString();
        if (s.equals(s2))
            System.out.println(true);
        else System.out.println(false);
    }
}
