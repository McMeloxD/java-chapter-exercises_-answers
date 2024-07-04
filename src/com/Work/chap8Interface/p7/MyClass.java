package com.Work.chap8Interface.p7;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class MyClass {
    private IA ia;
    public MyClass(IA ia){
        this.ia = ia;
    }
    public void setIa(IA ia){
        this.ia = ia;
    }
    public void myMethod(){
        ia.m1();
    }

    public static void main(String[] args) {
        IA ia1 = new IAImpl1();
        MyClass mc = new MyClass(ia1);
        mc.myMethod();
        IA ia2 = new IAImpl2();
        mc.setIa(ia2);
        mc.myMethod();
    }

}
