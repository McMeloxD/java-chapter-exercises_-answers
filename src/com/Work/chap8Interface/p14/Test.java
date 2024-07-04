package com.Work.chap8Interface.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Test {
    public static void main(String args[]){
        Super sup = new Sub1();
        Sub1 sub1 = (Sub1)sup;
        IA ia = (IA)sup;

    }
}
