package com.GO.dayHomeWork.week_1.day03;


import java.util.Scanner;

public class day03 {

//1从键盘输入三角形的底和高，并输出三角形的面积。(底×高/2)
    public static void sjx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的底：");
        float a = scanner.nextFloat();
        System.out.println("请输入三角形的高：");
        float h = scanner.nextFloat();
        System.out.println("三角形的面积=" + a * h / 2);
    }

//2从键盘输入一个华氏温度，转换成相应的摄氏温度度输出。
//（转换规则：摄氏度＝5/9*(华氏度−32)）
    public static void wd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入华氏温度：");
        float hs = scanner.nextFloat();
        System.out.println("华氏温度=" + 5 * (hs - 32) / 9 + "°C");
    }

//3从键盘输入一个三位整数，分别输出其个位、十位和百位
    public static void sws() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i >=100 && i<=999) {
                System.out.println("个位数字是：" + i % 10);
                System.out.println("十位数字是：" + i / 10 % 10);
                System.out.println("百位数字是：" + i / 100);
            }else {
                System.out.println("请输入三位数哦!");
            }

        } else {
            System.out.println("请输入整数类型哦!");
        }
    }

//4从键盘输入一个四位整数，分别输出其个位、十位、百位和千位
    public static void siws() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i >=1000 && i<=9999) {
                System.out.println("个位数字是：" + i % 10);
                System.out.println("十位数字是：" + i / 10 % 10);
                System.out.println("百位数字是：" + i / 100 % 10);
                System.out.println("千位数字是：" + i / 1000);
            }else {
                System.out.println("请输入四位数哦!");
            }

        } else {
            System.out.println("请输入整数类型哦!");
        }
    }

//5从控制台输入基本工资,完成以下两题
//    题1、计算并输出实领工资
//    题2、输出一张完整的工资条(工资条形式不定,可百度)
    public static void gz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入基本工资：");
        double i = scanner.nextFloat();
        double wj = i * 0.04;
        double fz = i * 0.025;
        double hf = 100;
        double sb = i * 0.0125;
        double sf = i + wj + fz + hf - sb;
        System.out.println("基本工资："+ i +" 物价津贴："+ wj +" 房租津贴："+ fz +" 话费补贴： "+ hf +" 社保扣除："+sb + " 实发工资："+ sf +"元");
    }
}
