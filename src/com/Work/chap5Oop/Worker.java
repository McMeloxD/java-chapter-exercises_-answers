package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class Worker {
    private String name; // 姓名
    private int age; // 年龄
    private double salary; // 工资
    private Address addr;

    // 无参构造方法
    public Worker() {
    }

    // 全参数的
    public Worker(String name, int age, double salary, Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    // 无参work方法
    public void work() {
        System.out.println(name + "正在打工！");
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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    // 有参work方法，表示工作时间
    public void work(int hours) {
        System.out.println(name + "已经工作" + hours + "小时！");
    }

    public String toString() {
        return "姓名：" + name + "，年龄：" + age
                + "，工资：" + salary + "，家庭住址："+
                addr.getAddress() + "，邮政编码为：" + addr.getZipCode()
                ;
    }
}
