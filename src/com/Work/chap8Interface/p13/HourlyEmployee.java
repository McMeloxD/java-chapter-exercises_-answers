package com.Work.chap8Interface.p13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*小时工类*/
public class HourlyEmployee extends Employee {
    private double hourlySalary;// 每小时的工资
    private int hours;// 工作的小时数

    public HourlyEmployee(String name, int month, int hours, double hourlySalary) {
        super(name, month);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalay(int month) {
        if (hours > 160) {
            System.out.println(super.getName() + "您好！");
            System.out.println("您本月加班超出" + (hours - 160) + "小时,超出部分按1.5倍计算共：" + (hours - 160) * hourlySalary * 1.5);
            return super.getSalay(month) + hourlySalary * 160 + (hours - 160) * hourlySalary * 1.5;
        }
        return super.getSalay(month) + hourlySalary * hours;
    }
}
