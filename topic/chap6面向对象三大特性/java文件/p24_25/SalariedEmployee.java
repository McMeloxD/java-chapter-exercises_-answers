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

    public double getSalary() {
        return salary1;
    }

    public double getSalay(int month) {
        if (month == this.getMonth()) {
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
            System.out.print("正式工（固定薪资）---" + this.getName() + "辛苦了！您的本月份工资为：");
            return salary1 + 100;
        }
        System.out.print("正式工（固定薪资）---" + this.getName() + "辛苦了！您的本月份工资为：");
        return salary1;
    }

    public void setSalary(double salary) {
        this.salary1 = salary;
    }

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary1 = salary;
    }
}
