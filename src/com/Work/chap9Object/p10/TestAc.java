package com.Work.chap9Object.p10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestAc {
    public static void main(String[] args) {
       // SavingAccount as = new SavingAccount();
       // as.setInterestRate(0.12);
       //  Account a = new Account(1001111,1000,"666888");
        // Bank.deposit(a,500); //存钱
        // Bank.withdraw(a,1000); //取钱
        // Bank.openAccount(1001111,"666888",1);
        Account arr[] = new Account[10];
        for (int i = 0; i < 10; i++){
            arr[i] = new Account();
        }
        for (Account num : arr){
            System.out.println(num.getId());
        }
    }
}
