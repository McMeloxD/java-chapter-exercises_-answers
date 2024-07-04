package com.GO.chaperForWhile;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc 9. （循环）*读入一个整数n，输出如下图形
 * n = 3
 * *
 * ***
 * *****
 * n = 4
 * *
 * ***
 * *****
 * *******
 * 思路：读入的整数n，就是外层循环的循环次数。
 * 对于每一行，要做的事情：1. 输出若干个空格；2. 输出若干个星；3. 换行。
 * 提示：输出不换行，用System.out.print()
 */
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        System.out.println("n = " + n);
        if (n > 0) {
            //循环n次，也就是打印n行
            for (int i = 0; i < n; i++) {
                //循环输出空格
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                //循环输出星号
                for (int k = 1; k <= 2 * i + 1; k++) {
                    //判断是否最后一行，如果是换行
                    if (k == 2 * i + 1) {
                        System.out.println('*');
                    } else {
                        System.out.print('*');
                    }
                }
            }
        }
    }

}
