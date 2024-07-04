package com.Work.chap13io.p24;

import java.io.Serializable;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/12
 * @desc 序列化 (Serialization)将对象的状态信息转换为可以存储或传输的形式的过程。
 * 1.把对象转换为字节序列的过程称为对象的序列化。
 * 2.把字节序列恢复为对象的过程称为对象的反序列化。
 * 3.对象的序列化主要有两种用途：
 * 	1） 把对象的字节序列永久地保存到硬盘上，通常存放在一个文件中；
 * 	2） 在网络上传送对象的字节序列。
 */
public class Worker implements Serializable {
    //实现Serializable空方法接口，标识此类可以被序列化
    private String name;
    private int age;
    private double salary;

    //构造
    public Worker(){}
    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "姓名=" + name + '\t' +
                "年龄=" + age + '\t' +
                "  薪资=" + salary;
    }
}
