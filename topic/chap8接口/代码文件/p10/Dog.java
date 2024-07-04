package com.Work.chap8Interface.p10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Dog extends Animal implements Pet{
    @Override
    public void eat() {
        System.out.println("“Dog eat Bones”");
    }

    @Override
    public void play() {
        System.out.println("“Play with Dog”");
    }
}
