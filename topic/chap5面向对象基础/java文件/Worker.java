package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class Worker {
    String name; // 姓名
    int age; // 年龄
    double salary; // 工资
    Address addr;

    // 无参构造方法
    public Worker() {
    }

    // 全参数的
    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // 无参work方法
    public void work() {
        System.out.println(name + "正在打工！");
    }

    // 有参work方法，表示工作时间
    public void work(int hours) {
        System.out.println(name + "已经工作" + hours + "小时！");
    }

    public String toString() {
        return "姓名：" + name + "，年龄：" + age
                + "，工资：" + salary + "，家庭住址："+
                addr.address + "，邮政编码为：" + addr.zipCode
                ;
    }
}
