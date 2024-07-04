package com.GO.chap3method;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/13
 * @desc 9. *求一个三位数，该三位数等与其每位数字的阶乘之和。
 */
public class p9 {
    public static void main(String[] args) {
        sws();
    }

    public static void sws() {
        for (int n = 100; n <= 999; n++) {
            //声明变量获取个十百位的数字
            int gw = n % 10;
            int sw = n / 10 % 10;
            int bw = n / 100;
            //计算个位数的阶乘
            int jg = 1;
            if (gw != 0) {
                for (int i = gw; i > 0; i--) {
                    jg *= i;
                }
            } else {
                jg = 0;
            }
            //计算十位数的阶乘
            int js = 1;
            if (sw != 0) {
                for (int i1 = sw; i1 > 0; i1--) {
                    js *= i1;
                }
            } else {
                js = 0;
            }
            //计算百位数的阶乘
            int jb = 1;
            for (int i2 = bw; i2 > 0; i2--) {
                jb *= i2;
            }
            //判断
            if(n == (jg+js+jb)){
                System.out.println(n + "等于其每位数字的阶乘之和。");
            }
        }
    }

}
