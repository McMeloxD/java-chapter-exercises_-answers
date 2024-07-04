package com.Work.dayHWork.week_2.day14.p3;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof Student) {
            Student student = (Student) o;
            // Math.abs()绝对值
            return Math.abs(age - student.age) <= 2 && Objects.equals(name, student.name);
        }
        return false;
    }

}
