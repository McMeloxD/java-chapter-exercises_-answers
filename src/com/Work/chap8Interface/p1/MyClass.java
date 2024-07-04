package com.Work.chap8Interface.p1;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class MyClass implements IA {
    @Override
    public void m1() {
        System.out.println("MyClass-m1");
    }

    public static void main(String[] args) {
        IA ia = new MyClass();
        ia.m1();
        System.out.println(ia.a);
    }
}

