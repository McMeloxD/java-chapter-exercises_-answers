package com.Work.chap7static_final_abstract.p18;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */

    class ClassA {
        static {
            System.out.println("In ClassA Static");
        }

        public ClassA() {
            System.out.println("ClassA()");
        }
    }

    class ClassB {
        static {
            System.out.println("In ClassB Static");
        }

        public ClassB() {
            System.out.println("ClassB()");
        }
    }

    class ClassC extends ClassB {
        static {
            System.out.println("In ClassC Static");
        }

        public ClassC() {
            System.out.println("ClassC()");
        }
    }

    class MyClass {
        static ClassA ca = new ClassA();
        ClassC cc = new ClassC();

        static {
            System.out.println("In MyClass Static");
        }

        public MyClass() {
            System.out.println("MyClass()");
        }
    }

public class TestMain {
        public static void main(String args[]) {
            MyClass mc1 = new MyClass();
            MyClass mc2 = new MyClass();
            System.out.println(mc1.cc == mc2.cc);
            System.out.println(mc1.ca == mc2.ca);

    }
}