package com.Work.chap9Object.p5;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class Dog extends Aniaml{
    public static void main(String[] args) {
        Aniaml a = new Dog();
        Aniaml b = new Aniaml();
        System.out.println(a instanceof Aniaml);
        System.out.println(a.getClass());
    }
}
