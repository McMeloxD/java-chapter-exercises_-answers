package com.Work.chap7static_final_abstract.p5;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class TestMain {
    public static void main(String args[]){
        Super sup = new Sub();
        sup.m1();
        sup.m2();
        Sub sub = (Sub) sup;
        sub.m1();
        sub.m2();
    }
}
class Super{
    public static void m1(){
        System.out.println("m1 in Super");
    }
    public void m2(){
        System.out.println("m2 in Super");
    }
}
class Sub extends Super{
    public static void m1(){
        System.out.println("m1 in Sub");
    }
    public void m2(){
        System.out.println("m2 in Sub");
    }
}