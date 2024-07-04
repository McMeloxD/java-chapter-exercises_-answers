package com.Work.chap8Interface.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TestMain {
    public static void main(String[] args) {
        IA ia = new IAImpl();
        IBImpl ib = new IBImpl();
        ib.setIa(ia);
        ib.method();
    }
}
