package com.Work.chap9Object.p3;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Tom", 18);
        System.out.println(stu1);
        System.out.println( stu1 + "  "+ 100);
        System.out.println(  100 + "   "+ stu1);
        System.out.println(  " "+ 100 + stu1);
        System.out.println(  );
    }
}

class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}