package com.Work.chap10collection.p16;

import java.util.HashSet;
import java.util.Set;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode() + age;
    }
}
public class TestHashSet {
    public static void main(String args[]){
        Set set = new HashSet();
        Student stu1 = new Student();
        Student stu2 = new Student("Tom", 18);
        Student stu3 = new Student("Tom", 18);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set.size());
    }
}
