package com.Work.chap8Interface.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class IAImpl implements IA{
    @Override
    public void ma(IB ib) {
        System.out.println("ma in IAImpl");
        ib.mb();
    }
}
