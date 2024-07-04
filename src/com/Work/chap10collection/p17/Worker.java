package com.Work.chap10collection.p17;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class Worker {
    public String name;
    public int age;
    private double salary;
    public Address address;

    public Worker(String name, int age, double salary, Address address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        //对比Address里的具体字符串内容
        return age == worker.age && Double.compare(salary, worker.salary) == 0
                && name.equals(worker.getName()) && this.address.getAddressName().equals(worker.getAddress().getAddressName())
                && this.address.getZipCode().equals(worker.getAddress().getZipCode());
    }

    @Override
    public int hashCode() {
        //先只判断姓名和年龄的哈希值
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "姓名=" + name +
                ", 年龄=" + age +
                ", 工资=" + salary +
                ", 家庭地址=" + address.getAddressName() +
                ", 邮编=" + address.getZipCode() +
                '}' + '\n';
    }
}
