package com.qf;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/16
 * @desc
 */
public class p16 {
    public static void main(String[] args) {
       /* 16. （循环）**已知：faibonacci（费波那契）数列的前几个数分别为0，1，1，
        2，3，5，……。从第3 项开始，每一项都等于前两项的和。
        读入一个整数n，编程求出此数列的前n 项。
        注意：这里的数列是从0 开始的。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        boolean flag = true;
        if (n == 1) {
            //如果n为1，直接输出一项0
            System.out.print(a);
        } else if (n > 1) {
            //如果n>1，先输出前两项
            System.out.print(a + ", " + b);
            while (n > 2){
                //继续判断，如果n>2，第三项就等于前两项的和，然后为下一次的c的前两项换值
                c = a + b;
                a = b;
                b = c;
                //这个布尔只循环了一次，如果n>1输出后面加逗号，那么n=2就会多一个逗号
                //如果不加，正常循环，第三项就会和第二项无间隔，所以用这个布尔来输出一个逗号
                if (flag) {
                    System.out.print(",\0");
                    flag = false;
                }
                if(n == 3){
                    //如果此时n为3，就直接输出第三项跳出循环
                    System.out.print(c);
                    break;
                }
                //打印第三项
                System.out.print(c + ", ");
                n--;
            }
        }
    }
}
