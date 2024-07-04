package com.GO.chap3method;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/14
 * @desc 13. **验证哥德巴赫猜想：任何一个大于6 的偶数，都能分解成两个质数的和。
 * 要求输入一个整数，输出这个数能被分解成哪两个质数的和。
 * eg : 14
 * 14=3+11
 * 14=7+7
 */
public class p13 {
    public static void main(String[] args) {
        zsh();
    }

    public static void zsh() {
        //获取一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于6的偶数:");
        int n = sc.nextInt();
        //判断是否大于6的偶数
        if (n > 6 && n % 2 == 0) {
            //因为是要质数，所以两个数一定不是0或本身,以及1(不是质数)
            //开始循环判断数组里的哪两个因子加起来等于n
            for (int i = 2; i < n - 1; i++) {
                //这里j也可以等于2，不过下面最后一次判断要加上&& i <= j
                for (int j = i; j < n - 1; j++) {
                    //判断两个数是否都是质数
                    if (isZhiShu(i) && isZhiShu(j)) {
                        //判断两个质数相加是否等于n，两个数可以相等但是不能重复出现
                        if (i + j == n) {
                            System.out.println(i + "+" + j + "=" + n);
                        }
                    }
                }
            }
        } else {
            System.out.println("您输入的数非偶数或非大于6的数");
        }
    }

    /**
     * 判断是否质数方法
     */
    public static boolean isZhiShu(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
