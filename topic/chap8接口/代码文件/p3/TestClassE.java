package com.Work.chap8Interface.p3;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TestClassE {
    public static void main(String[] args) {
        IC ic = new ClassE(); //向上转型
        ((ClassE) ic).ma(); //向下转型
        ((ClassE) ic).mb();
         ic.mc();
        ((ClassE) ic).md();
    }
}
