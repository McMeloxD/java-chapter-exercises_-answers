package com.Work.dayHWork.week_2.day14.p1;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class IdCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String idCard = sc.nextLine();
        checkIdCard(idCard);

    }

    private static void checkIdCard(String idCard) {
        if (idCard.length() == 18) {
                boolean isShu = true;
                char[] charArr = idCard.toCharArray();
                for (int i = 0; i < charArr.length;i++){
                    if (Character.isLetter(charArr[i])){
                        isShu = false;
                    }
                }
                    if (false == isShu){
                        System.out.println("身份证号码不能有字母！");
                    }else {
                        bornDate(idCard);
                        sex(idCard);
                        isCN(idCard);
                    }

        } else {
            System.out.println("身份证号码长度错误");
        }
    }


    // 1)获取出生年月日
    public static void bornDate(String idCard) {
        System.out.println("出生年月日为：" + idCard.substring(6, 10) + "年 " + idCard.substring(10, 12) + "月 " + idCard.substring(12, 14) + "日");
    }

    // 2)判断男女,最后一位是奇数则为男，偶数为女
    public static void sex(String idCard) {
        // 返回指定索引处的 char 值。索引范围为从 0 到 length() - 1
        if (idCard.charAt(idCard.length() - 1) % 2 == 0) {
            System.out.println(idCard.charAt(idCard.length() - 1));
            System.out.println("性别为女");
        } else {
            System.out.println("性别为男");
        }
    }

    // 判断性别第二种，用substring截取最后一个字符
    public static void sex2(String idCard) {
        // 返回指定索引处的 char 值。索引范围为从 0 到 length() - 1
        int n = Integer.parseInt(idCard.substring(17));
        System.out.println(n);
        if (n % 2 == 0) {
            System.out.println("性别为女");
        } else {
            System.out.println("性别为男");
        }
    }

    // 3）判断是否成年
    public static void isCN(String idCard) {
        int year = Integer.parseInt(idCard.substring(6, 10));
        int month = Integer.parseInt(idCard.substring(10, 12));
        int day = Integer.parseInt(idCard.substring(12, 14));
        if (year < 2006) {
            // 如果06年之前出生已经成年
            System.out.println("您是成年人");
        } else if (year == 2006) {
            // 如果06年5月之前出生已经成年
            if (month < 5) {
                System.out.println("您是成年人");
            } else if (month == 5) {
                // 如果是06年5月30日之前出生已经成年
                if (day < 30) {
                    System.out.println("您是成年人");
                } else {
                    System.out.println("您未成年");
                }
            } else {
                System.out.println("您是未成年人");
            }
        } else {
            System.out.println("您是未成年人");
        }
    }
}
