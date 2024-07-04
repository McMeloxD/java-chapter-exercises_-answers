package com.Work.chap10collection.p9;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class Worker implements Comparable<Worker> {
    String name;
    int age;
    double salary;

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

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int hashCode() {
        return name.hashCode() + age;
    }


    @Override
    public int compareTo(Worker o) {
        //先判断是否相同,如果相同对象就返回0，不存
        if (name.equals(o.getName()) && age == o.getAge())
            return 0;
        //this年龄大于传入对象年龄直接返回1
        if (age > o.getAge()) {
            return 1;
            //年龄相同，比较工资
        } else if (age == o.getAge()) {
            if (salary > o.getSalary()){
                return 1;
                //工资一样按照字典比较姓名字符串,str.compareTo(str2),如果大于返回正整数，小于负整数
            } else if (salary == o.getSalary()) {
                if (name.compareTo(o.getName())>0){
                    return 1;
                }else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
