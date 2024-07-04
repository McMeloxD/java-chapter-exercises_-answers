package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p6 {
    public static void main(String[] args) {
    /*“百钱买百鸡”是我国古代的著名数学题。题目这样描述：3 文
    钱可以买1只公鸡，2 文钱可以买一只母鸡，1 文钱可以买3 只小鸡。用100 文
    钱买100 只鸡，那么各有公鸡、母鸡、小鸡多少只？
    */
        for (int gj = 0; gj <= 100/3; gj++) {
            for (int mj = 0; mj <= 100/2; mj++) {
                for (int xj = 0; xj <= (100 - gj -mj); xj++) {
                    //三个条件，1.加起来100只，2.加起来100钱，3小鸡数量是3的倍数
                    if ((gj + mj + xj) == 100 && (gj*3 + mj*2+ xj/3) == 100 && (xj % 3) == 0) {
                        System.out.println("公鸡有"+ gj + ",母鸡有：" + mj + ",小鸡有：" + xj);
                    }
                }

            }

        }
    }
}