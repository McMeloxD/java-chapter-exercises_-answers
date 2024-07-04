package com.GO.test51;

import java.util.Scanner;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
 * 存期		年利率（%）
 * 一年		2.25
 * 两年		2.7
 * 三年		3.25
 * 五年		3.6
 * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
 * 提示：
 * 存入金额和存入年限均由键盘录入
 * <p>
 * 本息计算方式：本金+本金×年利率×年限
 */
public class Topic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的存款金额：");
        Double cash = sc.nextDouble();
        System.out.println("请输入您的存款年限(输入1 2 3 5之中的数字）：");
        int year = sc.nextInt();
        Double money = 0.0;
        if (cash >= 1000) {
            if (year == 1) {
                money = cash + cash * 0.0225 * 1;
            } else if (year == 2) {
                money = cash + cash * 0.027 * 2;
            } else if (year == 3) {
                money = cash + cash * 0.0325 * 3;
            } else if (year == 5) {
                money = cash + cash * 0.036 * 5;
            } else {
                System.out.println("您输入的年限不对哦~");
            }
        } else {
            System.out.println("1000元起存哦！");
        }
        System.out.println("到期后得到的本息总额为：" + money);
    }
}
