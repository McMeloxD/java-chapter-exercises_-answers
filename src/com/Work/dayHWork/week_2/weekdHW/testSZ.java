package com.Work.dayHWork.week_2.weekdHW;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/31
 * @desc
 */
public class testSZ {
    public static void main (String[] args){
        testSZ a=new testSZ();
        a.method(8);
        a.method(1.2f);
    }
    void method(float i) {
        System.out.println("float: "+i);
    }
    void method(long i) {
        System.out.println("long: "+i);
    }
}
