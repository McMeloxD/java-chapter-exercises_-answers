package com.Work.chap10collection.p7;

import java.util.Objects;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class Worker {
    String name;
    int age;
    double salary;
    public Worker(){}
    public Worker(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int hashCode() {
        return name.hashCode() + age + (int) salary;
    }

    public boolean equals(Object o) {
        Worker wk = (Worker) o;
        if (Objects.equals(wk.name, name) && salary == wk.salary && wk.age == age) {
            return true;
        } else return false;
    }
}
