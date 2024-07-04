package com.GO.dayHomeWork.week_1.day04;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/22
 * @desc
 */
public class day04 {
    public static void main(String[] args) {
        bq();
    }

    //题目1: 使用if.elseif
    //根据钱包余额决定今晚吃什么：
    public static void food() {
        Scanner sc = new Scanner(System.in);
        System.out.println("这位爷您有多少钱？");
        int n = sc.nextInt();
        if (n >= 1000) {
            System.out.println("土豪您可以吃满汉全席！");
        } else if (n >= 500) {
            System.out.println("您可以吃海天盛筵！");
        } else if (n >= 200) {
            System.out.println("您可以吃海底捞火锅哦！");
        } else if (n >= 50) {
            System.out.println("楼下餐馆凑合一顿呗~");
        } else {
            System.out.println("没钱还不吃泡面？");
        }
    }

    //题目2: 从键盘输入一个整数，判断是否能被3或者被5整除。
//    能的话输出："该数是3或5的倍数",
//    否则输出："该数不能被3或5中的任何一个数整除"
    public static void pd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 3 == 0) {
            System.out.println("该数是3或5的倍数");
        } else {
            System.out.println("该数不能被3或5中的任何一个数整除");
        }
    }

    //    题目3: 用户使用键盘输入两个数a和b，
//    如果a能被b整除或者a加b大于100，则输出a，否则输出b
    public static void zc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数a：");
        int a = sc.nextInt();
        System.out.println("请输入一个整数b：");
        int b = sc.nextInt();
        if (a % b == 0 || a + b > 100) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //
//    题目4: 按照年龄划分，
//            60以上是老年人,
//            40-60是中年人,
//            20-40青年人,
//            10-20青少年,
//            10岁以下儿童。
    public static void nl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (age >= 60) {
            System.out.println("这位是老年人");
        } else if (age >= 40) {
            System.out.println("这位是中年人");
        } else if (age >= 20) {
            System.out.println("这位是青年人");
        } else if (age >= 10) {
            System.out.println("这位是青少年");
        } else {
            System.out.println("这位是儿童");
        }
    }

    //    题目5: 会员购物时，根据输入积分的不同享受不同的折扣
//            计算会员购物时获得的折扣输出实付金额
//    会员积分x 折扣
//    x < 2000 9折
//2000 <= x <4000 8折
//4000 <= x < 8000 7折
//    x > 8000 6折
    public static void gw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的会员积分：");
        double jf = sc.nextDouble();
        System.out.println("请输入您的商品总金额：");
        int cash = sc.nextInt();
        if (jf >= 8000) {
            System.out.println("您的积分可享受六折购物，本次实际需要支付金额为：" + cash * 0.6 + "元");
        } else if (jf >= 4000) {
            System.out.println("您的积分可享受七折购物，本次您实际需要支付金额为：" + cash * 0.7 + "元");
        } else if (jf >= 2000) {
            System.out.println("您的积分可享受八折购物，本次您实际需要支付金额为：" + cash * 0.8 + "元");
        } else {
            System.out.println("您的积分可享受九折购物，本次您实际需要支付金额为：" + cash * 0.9 + "元");
        }
    }
//
//    题目6: 输入一个数,判断是不是水仙花数
//            (水仙花是一个三位数，这个数的个位的立方+十位的立方+百位的立方==他本身：
//                    153 = 1 + 125 + 27)

    public static void sxh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int n = sc.nextInt();
        if (n < 1000 && n > 99) {
            int a = n % 10;
            int b = n / 10 % 10;
            int c = n / 100;
            if (a * a * a + b * b * b + c * c * c == n) {
                System.out.println(n + "是水仙花数哦！");
            } else {
                System.out.println("该数不是水仙花数哦！");
            }
        } else {
            System.out.println("请输入三位数哦！");
        }
    }

    //    题目7: 输出所有水仙花数
    public static void sxh2() {
        for (int n = 100; n <= 999; n++) {
            int a = n % 10;
            int b = n / 10 % 10;
            int c = n / 100;
            if (a * a * a + b * b * b + c * c * c == n) {
                System.out.print(n + " ");
            }
        }
    }

    //    题目8: 计算1+3+5+...+99 的和
    public static void qh() {
        int sum = 0;
        for (int n = 1; n <= 50; n++) {
            sum += 2 * n - 1;
        }
        System.out.println("1+3+5+...+99 的和为：" + sum);
    }

    //    题目9: 输出100~1000的所有末尾为8的数字
    public static void qb() {
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 8) {
                System.out.println(i + " ");
            }
        }
    }

    //    题目10: 输出乘法口诀表
    public static void cf() {
        for (int a = 1; a <= 9; a++) {
            for (int b = a; b <= 9; b++) {
                System.out.print(a + " * " + b + " = " + a * b + "   ");
                if (b == 9) {
                    System.out.println();
                }
            }
        }
    }

    //    题目10:编写一个程序，最多接收10个数，求这些数的和
//    注意：中途用户可以通过输入886终止程序，并显示输入数的和
    public static void qh2() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.println("请输入第" + i + "个数字：");
            int a = sc.nextInt();
            if (a != 886) {
                sum += a;
            } else {
                System.out.println("这" + i + "个数字的和为：" + sum);
                return;
            }
        }
        System.out.println("这10个数字的和为：" + sum);
    }

//    题目11:求得一个数是几位数?
//    分析：将这个数循环除以10记录运算了几次

    public static void ws() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        int b = n;
        int a = 1;
        while (n / 10 != 0) {
            n = n / 10;
            a++;
        }
        System.out.println(b + "是" + a + "位数");
    }
//
//    题目12:思考题:
//            “百钱买百鸡”是我国古代的著名数学题。题目这样描述：
//            3 文钱可以买1只公鸡，
//            2 文钱可以买一只母鸡，
//            1 文钱可以买3 只小鸡。
//    用100文钱买100只鸡，那么各有公鸡、母鸡、小鸡多少只？
// 分析 公鸡+母鸡+小鸡的数量== 100只  &&  公鸡*3 + 母鸡*2 + 小鸡/3 == 100文钱 && 小鸡是3的倍数。
    public static void bq() {
        for (int a = 1; a < 33; a++) {
            for (int b = 1; b < 50; b++) {
                for (int c = 1; c < 100; c++) {
                    if (3 * a + 2 * b + c / 3  == 100 && a + b + c ==100 && c % 3 == 0) {
                        System.out.println("公鸡为：" + a +"只  " + "母鸡为" + b + "只  " + "小鸡为" + c + "只" );
                    }
            }
        }

        }

    }
}




