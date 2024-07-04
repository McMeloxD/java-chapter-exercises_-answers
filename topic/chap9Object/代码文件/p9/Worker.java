package com.Work.chap9Object.p9;

import com.Work.chap5Oop.Address;

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
        return "姓名：" + name + "\t年龄：" + age
                + "\t工资：" + salary + "\t家庭住址："+
                addr.getAddress() + "\t邮政编码为：" + addr.getZipCode()
                ;
    }

    //equals方法
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("地址相同所以相同！");
            return true;
        }
        if (obj instanceof Worker) {
            Worker worker = (Worker) obj;
            //内容相同
            return name.equals(worker.name) && age == worker.age
                    && salary == worker.salary && addr == (worker.addr);
        }
        System.out.println("地址不同内容也不同所以不同！");
        return false;
    }
}
