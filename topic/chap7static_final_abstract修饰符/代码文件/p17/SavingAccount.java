package com.Work.chap7static_final_abstract.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*储蓄账户类*/
public class SavingAccount extends Account {
    private double interestRate; //存款利率

    public SavingAccount(long id, String password) {
        super(id, password);
    }

    //封装
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0 && interestRate < 0.1) {
            this.interestRate = interestRate;
        }else {
            System.out.println("利率要在10%以内！请重试~");
        }
    }
}
