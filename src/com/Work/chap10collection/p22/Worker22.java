package com.Work.chap10collection.p22;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class Worker22 {
    private final Long id;
    private String name;
    private double salary;
    private int age;
    static Long index = 0L; //声明一个静态Long

    public Worker22(String name, double salary, int age) {
        this.id = index;
        this.name = name;
        this.salary = salary;
        this.age = age;
        index++;
    }

    public Long getId() {
        return id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker22 worker22 = (Worker22) o;
        // 因为Long是封装类，所以用equals对比值
        System.out.println("equals");
        return Objects.equals(id, worker22.id);
    }

    @Override
    public int hashCode() {
        return (int) (name.hashCode() + age + salary);
    }

    @Override
    public String toString() {
        return "Worker22{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
