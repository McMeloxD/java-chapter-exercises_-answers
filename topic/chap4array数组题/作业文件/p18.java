package com.GO.chapter04Array;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p18 {
    public static void main(String[] args) {
//        eightQueen();
    }

    /** ------- 回溯 -------
     * 18.八皇后问题
     * 在8×8的国际象棋盘上,放置八个皇后,使任何一个皇后都不能吃掉另一个.
     * 国际象棋规则中,皇后可以吃掉任何一个与她在同一行,同一列或者同一斜线
     * 上的敌方棋子,
     * 所以八皇后问题的所有解满足:
     * 8个皇后都不在同一行,同一列,或者同一斜线上.
     * 输出所有的解
     * 提示:使用递归
     */

    public static void eightQueen(int[][] result, int row, int colum) {
        if (colum >= 8) {
            colum -= 8;
        }

        // 遍历行
        for (int i = row; i < 8; i++) {
            // 遍历列
            for (int j = colum; j < 8; j++) {
                // 这个位置如果是0则表示上一层有皇后
                // 这一行皇后位置不能放在这里
                if (result[i][j] == 0) {
                    continue;
                }
                if (result[i][j] == -1) {
                    if (judgeQueen(result)) {
                        result[i][j] = 8;
                    } else {
                        continue;
                    }
                }

                // 左下方有位置标记为0表示不能放皇后
                if (i + 1 < 8 && j - 1 >= 0) {
                    result[i + 1][j - 1] = 0;
                }

                // 正下方有位置标记为0表示不能放皇后
                if (i + 1 < 8) {
                    result[i + 1][j] = 0;
                }

                // 右下方有位置标记为0表示不能放皇后
                if (i + 1 < 8 && j + 1 < 8) {
                    result[i + 1][j + 1] = 0;
                }

                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++) {
                        System.out.print(result[a][b] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("---------------");

                eightQueen(result, i + 1, j + 2);

            }
        }

        // return result;
    }

    // 判断是否符合任何一行一列斜线只有一个皇后的规则
    public static boolean judgeQueen(int[][] result) {
        // 判断行是否符合同一行同一列只有一个皇后的规则
        for (int i = 0, sumR = 0, sumC = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                sumR += result[i][j];// 行
                sumC += result[j][i];// 列
                if (sumR > 8 || sumC > 8) {
                    // 该矩阵不是八皇后
                    return false;
                }
            }
        }


        // 判断行是否符合同一斜线(\,/)只有一个皇后的规则
        for (int k = 0; k < 8; k++) {
            // sumLR (\) sumRL(/)
            for (int i = k, j = 0, sumLR = 0, sumRL = 0; i < 8 && j < 8; i++, j++) {
                sumLR += result[i][j];
                sumRL += result[j][i];
                if (sumLR > 8 || sumRL > 8) {
                    return false;
                }
            }
        }

        return true;
    }
}
