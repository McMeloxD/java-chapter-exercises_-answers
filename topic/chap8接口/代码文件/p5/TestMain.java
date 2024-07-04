package com.Work.chap8Interface.p5;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TestMain {
    public static void main(String[] args) {
        MySuper ms = new MySub();
        System.out.println(ms instanceof IA);
        System.out.println(ms instanceof IB);
        System.out.println(ms instanceof MySuper);
        System.out.println(ms instanceof MySub);
    }
}
