package com.Work.chap7static_final_abstract.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class MyClass {
    static int count = 0; //不管该类多少个对象，共享这个属性

    public MyClass(){
        //统计创建了多少个对象
        count++;
        System.out.println("这是第" + count + "个对象");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new MyClass();
        }
        System.out.println("创建了" + count + "个对象");
    }
}
