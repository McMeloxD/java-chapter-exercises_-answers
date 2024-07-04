package com.Work.chap6Oop2.p18;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*账户类*/
public class Account {
    private long id; // 账户id
    private double balance; // 账户余额
    private String password; // 账户密码

    public Account() {
    }
    public Account(long id, String password) {
        this.id = id;
        this.password = password;
    }
    // 构造方法
    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码必须是6位数！请重试~");
        }

    }

    // 封装
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword(String glymm) {
        //设一个管理员密码，ATM机器上默认有密码
        if (glymm.equals("fuckyoujava")){
            return password;
        }else {
            System.out.println("密码错误！已报警！");
            return null;
        }
    }

    //设置密码
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码必须是6位数！请重试~");
        }
    }

}
