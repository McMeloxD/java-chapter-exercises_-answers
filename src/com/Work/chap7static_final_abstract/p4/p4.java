package com.Work.chap7static_final_abstract.p4;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class p4 {
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        System.out.println(mc1.i);
        MyClass mc2 = new MyClass(10);
        System.out.println(mc2.i);
    }
}
class MyClass{
    static int i = 10;
    static {
        i = 20;
        System.out.println("In Static");
    }
    public MyClass(){
        System.out.println("MyClass()");
    }
    public MyClass(int i){
        System.out.println("MyClass(int)");
        this.i = i;
    }
}

