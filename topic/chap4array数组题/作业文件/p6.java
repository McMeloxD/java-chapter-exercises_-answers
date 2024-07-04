package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p6 {
    public static void main(String[] args) {
        //声明矩阵M
        int[][] m = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println("M = ");
        for (int num[] : m){
            System.out.println(Arrays.toString(num));
        }
        //传实参得到结果打印
        int[][] rsMt = mATMt(m);
        System.out.println("MT = ");
        for (int i = 0; i < rsMt.length; i++) {
            for (int j = 0; j < rsMt[i].length; j++) {
                System.out.print(rsMt[i][j] + "\t");
            }
            System.out.println();
        }

    }
/*    6. 已知一个二维数组A 表示一个矩阵，求AT。
    其中，AT 表示矩阵的转置。矩阵转置的含义：表示把一个矩阵行列互换。例如，
    有下面的矩阵M 以及其转置MT：*/
    public static int[][] mATMt(int[][] arr){
        //声明行列长度互换的二维数组
        //int rows = array.length;  行数
        //int cols = array[0].length;  列数，假设数组不为空且所有行的长度相同
        //元素个数= rows * cols
        int[][] mt = new int[arr[0].length][arr.length];
        //第一个for是m数组的列数
        for (int i = 0; i < mt.length; i++) {
            //第二个for是mt数组的行数
            for (int j = 0; j < mt[0].length; j++) {
                //mt的行是m数组的列,列是m数组的行，直接互换
                mt[i][j] = arr[j][i];
            }
        }
        //返回新数组
        return mt;
    }
}
