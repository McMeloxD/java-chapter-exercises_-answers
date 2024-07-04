package com.qf;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/16
 * @desc
 */
public class p18 {
    /*
    18. （循环）***打渔还是晒网
    中国有句老话叫“三天打渔，两天晒网”。假设有一个人从2000 年1 月1 日
    开始“三天打渔两天晒网”，读入三个整数，分别表示年份、月份、日期，
    问这三个整数所表示的那天这个人在打渔还是在晒网？*/
    public static void main(String[] args) {

        FishOrNot_1();
    }
    public static void FishOrNot_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = scanner.nextInt();
        System.out.print("请输入月份:");
        int month = scanner.nextInt();
        System.out.print("请输入日期:");
        int day = scanner.nextInt();

        int stYear = 2000, stMonth = 1, stDay = 1;
        int count = 1;// 计算1999年12月31日到输入日期有多少天


        // 判断输入是否合法
        if (year < 2000) {
            System.out.println("年份输入非法!请输入2000及以后的年份");
            return;
        } else {
            if (month > 12 || month < 1) {
                System.out.println("月份输入非法!请选择1~12进行月份输入");
                return;
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day < 1 || day > 30) {
                        System.out.println("日期输入非法!该月份请输入1~30日期!");
                        return;
                    }
                } else if (month == 2) {
                    // 判断是否是闰年
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day < 1 || day > 29) {
                            System.out.println("日期输入非法!闰年该月份请输入1~29日期!");
                            return;
                        }
                    } else {
                        if (day < 1 || day > 28) {
                            System.out.println("日期输入非法!闰年该月份请输入1~28日期!");
                            return;
                        }
                    }
                } else {
                    if (day < 1 || day > 31) {
                        System.out.println("日期输入非法!,该月份请输入1~31日期!");
                        return;
                    }
                }
            }
        }


        while (stYear <= year && stMonth <= month && stDay <= day) {

            count++;
            stDay++;
            // 日期进位到月份
            switch (stMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (stDay > 31) {
                        stDay = 1;
                        stMonth += 1;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (stDay > 30) {
                        stDay = 1;
                        stMonth += 1;
                    }
                    break;
                case 2:
                    if (stYear % 4 == 0 && stYear % 100 != 0 || stYear % 400 == 0) {
                        if (stDay > 29) {
                            stDay = 1;
                            stMonth += 1;
                        }
                    } else {
                        if (stDay > 28) {
                            stDay = 1;
                            stMonth += 1;
                        }
                    }
                    break;
                default:
                    System.out.println("Oops,出现了意想不到的问题!");
                    break;
            }
            if (stMonth > 12) {
                stMonth = 1;
                stYear += 1;
            }
        }

        switch (count % 5) {
            case 1:
            case 2:
            case 3:
                System.out.println("打渔");
                break;
            case 0:
            case 4:
                System.out.println("晒网");
                break;
        }

    }
}
