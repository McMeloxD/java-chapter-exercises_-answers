package com.Work.chap9Object.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class OuterClass {
    private int value1 = 100;
    private static int value2 = 200;

    public void method(int value3) {
        final int value4 = 400;
        class InnerClass {
            public void print() {
                System.out.println(value1);
                System.out.println(value2);
                System.out.println(value3);
                System.out.println(value4);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.method(300);
    }
}

