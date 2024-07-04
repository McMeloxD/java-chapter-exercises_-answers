package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p8 {
    public static void main(String[] args) {
       /* 8. （for 循环）*编程找出四位整数abcd 中满足下述关系的数。
        (ab+cd)(ab+cd)=abcd
        */

        for (int x = 1000; x < 10000; x++) {
            //容易理解为a*b+c*d
            int ab = x / 100;
            int cd = x % 100;
            if ((ab+cd) * (ab+cd) == x){
                System.out.println(x);
            }
        }
    }
}
