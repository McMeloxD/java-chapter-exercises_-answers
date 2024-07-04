package com.GO.dayHomeWork.week_2.day06;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/21
 * @desc
 */
public class day06_2 {
    public static void main(String[] args) {

    }

    // 模拟银行登录系统,假设密码是[数字123]
    // 系统要求
    // 1)最多允许你输入5次
    // 2)如果5次都错,给出 "卡已锁死,联系客服"
    // 3)中间有任何一次输入正确,都登录成功
    // 4)每次输入时,都给出提示"您还有x次机会"
    // --> 你要站在用户角度考虑程序,尽可能使用需求,提示要正确

    public static void bankP() {
        int count = 5;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (count == 0) {
                System.out.println("卡已锁死,联系客服");
                break;
            }
            System.out.println("请输入密码：");
            int a = sc.nextInt();
            if (a == 123) {
                System.out.println("登陆成功！");
                break;
            } else {
                count--;
                System.out.println("您还有" + count + "次机会!");
            }
        }
    }

    /*写一个函数add，接受两个整数作为参数，返回这两个整数的和*/
    public static int addInt1(int a, int b) {
        return a + b;
    }


    /*写一个函数，传入两个数字,计算他们的乘积,将结果返回*/
    public static int multiply(int a, int b) {
        return a * b;
    }


    /*写一个函数，计算从1到某个数以内所有奇数的和。*/
    public static void jiSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1到" + n + "以内所有奇数的和为：" + sum);
    }

    /*
        写一个函数，接受一个整数n，输出1+2+3+...+n 的和
    */
    public static void addInt2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+" + n + "和为：" + sum);
    }

    /*
        写一个函数，计算从1到某个数以内所有能被3或者5整除的数的和。
    */
    public static void fSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("1到" + n + "以内所有能被3或者5整除的数和为：" + sum);
    }

    /*写一个函数，接受一个整数参数n，输出n 个HelloWorld*/
    public static void helloWord(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("HelloWorld");
        }
    }

    /*写一个方法，输入圆形的半径，输出其周长*/
    public static void round(double r) {
        double pi = 3.14;
        System.out.println("半径为" + r + "的圆的周长为：" + String.format("%.2f", pi * 2 * r));
    }

    /*写一个方法，输入圆形的半径，返回其面积*/
    public static void area(double r) {
        double pi = 3.14;
        System.out.println("半径为" + r + "的圆的面积为：" + String.format("%.2f", pi * r * r));
    }

    /*写一个方法，参数姓名、年龄、性别、住址，按照如下格式输出
            我叫xxx,今年x岁,性别x,家在xxx*/
    public static void information(String name,int age,char sex,String adress) {
        System.out.println("我叫" + name + ",今年" + age + "岁，性别" + sex + ",家在" + adress);
    }
}
