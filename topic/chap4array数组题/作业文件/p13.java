package com.GO.chapter04Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int n = sc.nextInt();
        mathHeiDong(n);
//        heiDong6174();
    }

    /**
     * 13. *数学黑洞6174
     * 已知：一个任意的四位正整数。将数字重新组合成一个最大的数和最小的数
     * 相减，重复这个过程，最多七步，必得6174。即：7641-1467=6174。将永远出不
     * 来。
     * 求证：所有四位数数字（全相同的除外），均能得到6174。输出掉进黑洞的
     * 步数。
     */
    public static void mathHeiDong(int n) {
        int count = 0;
        int num = n; //在这里判断几位数先用另一个变量存起来，避免后面要用到n值改变了
        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        int a = n / 1000;
        //先判断输入的几位数
        while (num > 0) {
            num = num / 10;
            count++;
        }
        if (count != 4) {
            System.out.println("输入的不是四位数哦");
            //判断每位是否相同
        } else if (a == b && a == c && a == d) {
            System.out.println("该四位数每位都相同不可以哦");
        } else {
        int count2 = 0;
        if (n == 6174) {
            System.out.println("掉进黑洞1步");
        } else {
            int cha = n; //接受两数的差,如果将n作为判断条件，那输入6174就不行了
            while (cha != 6174) {
                //声明一个数组，进行排序拿到最小值
                int d1 = cha % 10;
                int c1 = cha / 10 % 10;
                int b1 = cha / 100 % 10;
                int a1 = cha / 1000;
                int[] minArr = {a1, b1, c1, d1};
                Arrays.sort(minArr);
                String str1 = "";
                //将数组每个数拼接到字符串里
                for (int i = 0; i < minArr.length; i++) {
                    str1 += minArr[i];
                }
                String str2 = str1; //这里将拼接后的字符串1保存一下后面降序用
                //将字符串转为数字
                int minNum = Integer.parseInt(str1);
                System.out.println("最小值：" + minNum);
                //调用StringBuffer类的反转方法降序
                StringBuffer sb = new StringBuffer(str2);
                sb.reverse();
                //获取最大值
                int maxNum = Integer.parseInt(sb.toString());
                System.out.println("最大值：" + maxNum);
                cha = maxNum - minNum;
                System.out.println("差：" + cha);
                //步数+1
                count2++;
                System.out.println("这是走的第" + count2 +"步");

            }
            System.out.println("一共走了" + count2 +"步");
        }
    }
}
    public static void heiDong6174() {
        // 申请数组,并将数字放进取
        int[][] n = new int[9000 - 9][2];
        for (int i = 1000, j = 0; i < 10000; i++) {
            if (i % 1111 == 0) {

                continue;
            }
            n[j][0] = i;
            j++;
        }
        // 四位整数的个十百千位置上的值存入数组
        int[] num = new int[4];

        // 四位数重新组成的最大最小数字
        int tempMax = 0;
        int tempMin = 0;
        int tempResult = 0;

        for (int i = 0; i < n.length; i++) {
            num[0] = n[i][0] % 10;
            num[1] = n[i][0] / 10 % 10;
            num[2] = n[i][0] / 100 % 10;
            num[3] = n[i][0] / 1000;

            // 找出四位数字n[i][0]进入黑洞的步骤数.
            for (int count = 1; count <= 7; count++) {
                // 对num进行排序,从而找出这四个数字能够组成的最大数字和最小数字
                // 用冒泡排序进行从小到大排序
                for (int j = 0; j < num.length - 1; j++) {
                    for (int k = 0, temp = 0; k < num.length - j - 1; k++) {
                        if (num[k] > num[k + 1]) {
                            temp = num[k];
                            num[k] = num[k + 1];
                            num[k + 1] = temp;
                        }
                    }
                }

                tempMax = num[3] * 1000 + num[2] * 100 + num[1] * 10 + num[0];
                tempMin = num[0] * 1000 + num[1] * 100 + num[2] * 10 + num[3];
                tempResult = tempMax - tempMin;
                if (tempResult == 6174) {
                    n[i][1] = count;
                    break;
                }
                num[0] = tempResult % 10;
                num[1] = tempResult / 10 % 10;
                num[2] = tempResult / 100 % 10;
                num[3] = tempResult / 1000;
            }

        }

        for (int i = 0, changeLine = 0; i < n.length; i++) {
            System.out.print(n[i][0] + "\0经过\0" + n[i][1] + "步骤掉进黑洞\t");
            changeLine++;
            if (changeLine == 5) {
                System.out.println();
                changeLine = 0;
            }
        }

    }
}
