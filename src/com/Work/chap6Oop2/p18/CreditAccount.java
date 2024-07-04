package com.Work.chap6Oop2.p18;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*信用账户类*/
public class CreditAccount extends Account{
    private double creditLine; //信用额度

    public CreditAccount() {
        super();
    }
    public CreditAccount(long id, String password) {
        super(id, password);
    }

    //封装
    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}
