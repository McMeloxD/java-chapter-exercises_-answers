package com.Work.chap9Object.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class TestInnerClass {
    public static void main(String[] args) {
        MyClass.method(new IA() {
            public void ma() {
                System.out.println("ma in anonymous inner calss");
            }
        });
        class MyClass2 implements IA {
            @Override
            public void ma() {
                System.out.println("ma in local inner class");
            }
        }
        MyClass.method(new MyClass2());
        IA ia1 = new IA() {
            public void ma() {
                System.out.println("ma in anonymous inner class");
            }
        };
    }

}
