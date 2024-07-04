package com.Work.chap7static_final_abstract.p2;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
class MyClass {
    static int count = 0;
    public MyClass(){
        count++;
        System.out.println(count);
    }
}
public class Testp2{
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = new MyClass();
    }
}
