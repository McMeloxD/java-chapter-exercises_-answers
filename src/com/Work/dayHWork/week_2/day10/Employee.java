package com.Work.dayHWork.week_2.day10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class Employee {
    private String ename; // 员工名称
    private double salary; // 工资

    // 构造方法
    public Employee() {
    }

    ;

    public Employee(String ename, double salary) {
        this.ename = ename;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


}
