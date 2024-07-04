package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p14 {
 /*   14. （循环）**如果一个数等于其所有因子之和,我们就称这个数为"完数",例如
6 的因子为1,2,3 6=1+2+3 6 就是一个完数.请编程打印出1000 以内所有的完数
1000以内有6 28 496
*/
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
