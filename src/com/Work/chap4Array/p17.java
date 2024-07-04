package com.GO.chapter04Array;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p17 {
    public static void main(String[] args) {
        luoXuanTianShu();
    }
    /**
     * 17.螺旋填数
     * 读入两个整数m,n,输出一个m行n列的矩阵,这个矩阵是1~m*n
     * 这些自然数按照右,下,左,上螺旋填入的结果.
     * 例如:读入4,5
     * 则输出
     * 1 2 3 4 5
     * 14 15 16 17 6
     * 13 20 19 18 7
     * 12 11 10 9 8
     */
    public static void luoXuanTianShu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入两个整数");
        System.out.print("请输入第一个整数:");
        int m = scanner.nextInt();
        System.out.print("请输入第二个整数:");
        int n = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("输入错误");
            return;
        }

        // 创建m*n二位数组
        int[][] result = new int[m][n];
        // 初始化数组
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                result[x][y] = -1;
            }
        }

        // 输入数据
        int val = 1;
        // 数组下标,i表示行,j表示列
        int i = 0, j = 0;
        result[i][j] = val;
        val++;
        // 螺旋填入数值,最后输入完判断的值会大于m * n + 1，最后一个数小于等于m*n
        while (val != m * n + 1) {
            // 往右边给当前i行依次赋值，到最后一个或已经赋值过的列下标前停止循环
            while (j + 1 < n && result[i][j + 1] == -1) {
                j += 1;
                result[i][j] = val;
                val++;
            }
            // 往下边给当前j列依次赋值，到最后一个或已经赋值过的行下标前停止循环
            while (i + 1 < m && result[i + 1][j] == -1) {
                i += 1;
                result[i][j] = val;
                val++;
            }
            // 往左边给当前i行依次赋值，到最后一个或已经赋值过的列下标前停止循环
            while (j - 1 >= 0 && result[i][j - 1] == -1) {
                j -= 1;
                result[i][j] = val;
                val++;
            }
            // 往上边给当前i行依次赋值，到最后一个或已经赋值过的列下标前停止循环
            while (i - 1 >= 0 && result[i - 1][j] == -1) {
                i -= 1;
                result[i][j] = val;
                val++;
            }

        }

        // 输出数组
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(result[a][b] + "\t");
            }
            System.out.println();
        }

    }
}
