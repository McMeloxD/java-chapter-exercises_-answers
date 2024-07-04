package com.Work.chap10collection.p19;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class Account {
    private Long id;
    private double balance;
    private String password;
    static Long l = 100001L; //用来自增

    public Account() {}

    public Account(double balance, String password) {
        this.balance = balance;
        this.password = password;
        this.id = l;
        l++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return "余额:" + balance;
    }
}
