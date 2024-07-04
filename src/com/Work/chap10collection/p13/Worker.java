package com.Work.chap10collection.p13;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class Worker{
    private int age;
    private String name;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " work");
    }

    @Override
    public String toString() {
        return "姓名=" + name +
                ", 年龄='" + age + '\'' +
                ", 工资=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof Worker) {
            Worker worker = (Worker) o;
            return age == worker.age && Double.compare(salary, worker.salary) == 0 && Objects.equals(name, worker.name);
        }
        return false;
    }

}
