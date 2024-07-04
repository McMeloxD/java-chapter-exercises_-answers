package com.Work.chap6Oop2.p24_25;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
// 正式工（固定工资）
public class SalariedEmployee extends Employee {
    private double salary1; // 月薪

    public double getSalary1() {
        return salary1;
    }

    public double getSalay(int month) {
        System.out.println(super.getName() + "您好！");
        return salary1 + super.getSalay(month);
    }

    public void setSalary(double salary) {
        this.salary1 = salary;
    }

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary1 = salary;
    }
}
