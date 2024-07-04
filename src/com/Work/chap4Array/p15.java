package com.GO.chapter04Array;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p15 {
    public static void main(String[] args) {
        oddArray(5);
    }

    /**
     * 定义一个奇数阶二维数组,把每个元素顺序填入不同的自然数,要求行列
     * 和对角线元素相加的结果相等
     * 要求：读入一个奇数n，按照上述规则，输出n*n 的方阵。
     */

    public static void oddArray(int n) {
        if (n % 2 == 0 || n <= 0) {
            System.out.println("请按照格式输入哦！");
            return;
        }
        // 创建m*n二位数组
        int[][] result = new int[n][n];
        // 初始化数组
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                result[x][y] = -1;
            }
        }

        //数组下标，i表示行，j表示列
        int i = 0, j = n / 2;
        result[i][j] = 1; //规则1
        //开始插值,下面这些判断只是为了确定下次要插入的坐标位置，真正赋值要判断结束才可以
        for (int val = 2; val <= n * n; val++) {
            //值最大位n*n，也就是输入值的平方
            //1.规则2 如果当前位置的行不是第一行且列不是最后一列同时右上方没被占用则插值
            if (i - 1 >= 0 && j + 1 < n && result[i - 1][j + 1] == -1) {
                i -= 1;
                j += 1;
                //2.规则3 超出上方,数字填入同一列最下端 , Lsi - 1 == -1说明当前已经是最上面一行，后面半句说明右边去还有位置
            } else if (i - 1 == -1 && j + 1 < n) {
                i = n - 1; //取最下面一行
                j += 1;
                //从下往上找空位置
                for (int x = 0; x < n; x++) {
                    if (result[i][j] == -1) {
                        //如果有位置跳出循环去按照当前坐标赋值
                        break;
                    }
                    i -= 1; //否则往上移动一格
                }
                // 规则4,超出右边,数字填入同一行最左端.  Lsi - 1 >= 0说明当前不是最后一行，后面半句说明当前已经是最右边一列
            } else if (i - 1 >= 0 && j + 1 == n) {
                i -= 1; //往上来一行
                j = 0;  //列数来到第一个
                for (int x = 0; x < n; x++) {
                    if (result[i][j] == -1) {
                        break;
                    }
                    //往右移动一格
                    j += 1;
                }
                //如果当前的位置在右上角，上方右方没地方了，或者上次位置已经填过 且不是最上面一行，右边也有位置
            } else if (i - 1 == -1 && j + 1 == n || i - 1 >= 0 && j + 1 < n && result[i - 1][j + 1] != -1) {
                i += 1; //只需要在上次基础上往下一行即可

            }
            result[i][j] = val;
        }
        // 输出数组
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(result[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
