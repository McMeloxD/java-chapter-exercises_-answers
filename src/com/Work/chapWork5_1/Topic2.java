package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求:
 * 	定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?
 *
 * 运行效果:
 * 	1234的个位是4,十位是3,百位是2,千位是1
 */
public class Topic2 {
    public static void main(String[] args) {
        int n = 1234;
        int gw = n % 10;
        int sw = n / 10 % 10;
        int bw = n / 100 % 10;
        int qw = n / 1000;
        System.out.println(n + "的个位是:" + gw + ", 十位是：" + sw + ", 百位是：" + bw + ", 千位是："  + qw);
    }


}
