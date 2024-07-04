package com.Work.chap7static_final_abstract.p9;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
class MyValue{
    int value;
}
public class TestFinal {
    public static void main(String args[]){
        final MyValue mv = new MyValue();
        mv.value = 100;
        mv.value = 200;
//1
        System.out.println(mv.value);
    }
}
