package com.qf;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc 用递归的方法解决汉诺塔问题
 */
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接受圆盘数
        System.out.println("请输入圆盘数：");
        int n = sc.nextInt();
        hanota(n,"A","B","C");

    }

    /**
     * 定义汉诺塔方法,
     * int n 接受盘数
     * pos1,2,3分别对应出发站，中转站和目的站
     */
    public static void hanota(int n,String pos1,String pos2,String pos3) {
        //如果只有一个圆盘，那就直接移动
        if (n == 1) {
            move(pos1, pos3);
        } else {
            //1.先借助柱子3，把上面所有盘移动到柱子2
            hanota(n-1, pos1, pos3, pos2);
            //2.把柱子1最后一个盘移动到柱子3
            move(pos1,pos3);
            //3.利用柱子1，把柱子2所有盘移动到柱子3
            hanota(n-1, pos2, pos1, pos3);
        }

    }

    /*定义位置移动信息方法*/
    public static void move(String pos1, String pos3) {
        System.out.print(pos1 + "------>" + pos3 + " ");
    }
}
