package com.GO.dayHomeWork.week_2.day06;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/22
 * @desc
 */
public class day06 {
    public static void main(String[] args) {
//        System.out.println(cs(2));
        cz();
    }

    //    写一个函数，计算一个整数数组的平均值
    public static void avg() {
        int[] numArr = {33, 45, 62};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("数组的平均值为：" + sum / numArr.length);
    }

    //    给定一个数组，输出数组中的最大值和最小值
    public static void dx() {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            numArr[i] = sc.nextInt();
        }
        for (int sz : numArr) {
            System.out.print(sz + ",");
        }
        System.out.println(" ");
        int a = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > a) {
                a = numArr[i];
            }
        }
        max = a;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < a) {
                a = numArr[i];
                min = a;
            }
        }
        System.out.println("最大值是" + max + "," + "最小值是" + min);
    }

    //    自定义一个整数数组arr，读入(scanner)一个整数n，作为元素
//    如果n 在数组中存在，则输出n最后出现 的下标；如果不存在，则输出-1。
//            (根据元素找下标)
    public static void cz() {
        int[] numArr = {1, 2, 3, 4, 5, 6, 1, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        int b = -1;
        for (int i = numArr.length - 1; i >= 0; i--) {
            if (a == numArr[i]) {
                System.out.println(a + "的下标为：" + i);
                return; // return之后下面的语句不再执行，因为该方法没有返回值，允许无返回值。
            }
        }
        System.out.println(b);

    }

    //
//    给定一个数组，传入一个数字当下标,返回数组中的数据
//            (根据下标找元素)
    public static void ys() {
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        if (a >= numArr.length) {
            System.out.println("抱歉呢亲，您输入的数字超出了该数组的大小哦~");
        } else {
            System.out.println("下标为：" + a + "在数组中的数据为：" + numArr[a]);
        }
    }

    //    邱哥去参加今年歌唱比奖,有8个评委打分,(去掉1个最低分,1个最高分)求平均分?
//            - 定义数组,存储8个数
//- 遍历数组的同时(找最大值,找最小值,求和)
//- avg = (和-最大值-最小值)/数组长度-2
    public static void cg() {
        // 满分10分，最低0分
        int[] numArr = {10, 7, 5, 7, 9, 6, 7, 8};
        System.out.print("本次评委打分展示：");
        for (int sz : numArr) {
            System.out.print(sz + ",");
        }
        int a = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > a) {
                a = numArr[i];
            }
        }
        max = a;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < a) {
                a = numArr[i];
                min = a;
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i];
        }
        int avg = (sum - max - min) / (numArr.length - 2);
        System.out.println("最大值是" + max + "," + "最小值是" +
                min + "," + "总分和是" + sum + "," + "平均分是" + avg);
    }

    // 把下标当参数从数组中查找值
    public static int findElementByIndex(int in) {
        int[] numArr = {10, 7, 5, 7, 9, 6, 7, 8};
        if (in < 0 || in > numArr.length - 1) {
            System.out.println("输入的下标越界了哦");
            return -1;
        }
        return numArr[in];
    }

    // 数组求和
    public static void fsum() {
        int[] numArr = {33, 45, 62};
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("数组的和为：" + sum);
    }

    // 数组平均值
    public static void favg() {
        int[] numArr = {33, 45, 62};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("数组的平均值为：" + sum / numArr.length);
    }

    // 键盘输入5个人名到数组，然后遍历。
    public static void frm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个人名：");
        String[] nameArr = sc.nextLine().split(" ");
        for (String name : nameArr) {
            System.out.println(name);
        }
    }

    // 第二种方法
    public static void frm2() {
        Scanner sc = new Scanner(System.in);
        String[] nameArr = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个名字:");
            nameArr[i] = sc.nextLine();
        }
//        拼接字符串结果，开头结尾【】，中间，分隔。
        String r = "[";
        for (int i = 0; i < nameArr.length; i++) {
            if (i != nameArr.length - 1) {
                r = r + nameArr[i] + ",";
            } else {
                r = r + nameArr[i] + "]";
            }
        }
        System.out.println(r);
    }

    // 输出整数数组中最大值
    public static void zd() {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            numArr[i] = sc.nextInt();
        }
        for (int sz : numArr) {
            System.out.print(sz + " ");
        }
        int max = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        System.out.println("最大值是" + max);
    }
}

