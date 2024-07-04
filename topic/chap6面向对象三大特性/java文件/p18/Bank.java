package com.Work.chap6Oop2.p18;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class Bank {
    // 开户方法
    public static Account openAccount(long id, String password, int type) {
        switch (type) {
            case 0:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "普通账户");
                return new Account(id, password);
            case 1:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "储蓄账户");
                return new SavingAccount(id, password);
            case 2:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "信用账户");
                return new CreditAccount(id, password);
            default:
                System.out.println("请输入0-2开户哦！");
                return null;
        }
    }

    // 存款
    public static double deposit(Account a, double amount) {
        int count = 5;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入银行密码:");
            String psw = sc.nextLine();
            if (a.getPassword("fuckyoujava").equals(psw)) {
                a.setBalance(a.getBalance() + amount);
                System.out.println("存款" + amount+"成功！您当前的账户余额：" + a.getBalance());
                return a.getBalance();
            } else {
                System.out.println("密码错误！请重试");
                count--;
                if (count == 0) {
                    System.out.println("密码错误次数过多，账户被锁定！请联系柜台人员！");
                    return -1;
                }
            }
        }
    }

    // 取款
    public static double withdraw(Account a, double amount) {
        int count = 5;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入银行密码:");
            String psw = sc.nextLine();
            if (a.getPassword("fuckyoujava").equals(psw)) {
                if (a.getBalance() <= amount) {
                    a.setBalance(a.getBalance() - amount);
                    System.out.println("取款"+ amount +"成功！您当前的账户余额：" + a.getBalance());
                    return a.getBalance();
                }else {
                    System.out.println("余额不足，取款失败！");
                    return -1;
                }
            } else {
                System.out.println("密码错误！请重试");
                count--;
                if (count == 0) {
                    System.out.println("密码错误次数过多，账户被锁定！请联系柜台人员！");
                    return -1;
                }
            }
        }
    }

}
