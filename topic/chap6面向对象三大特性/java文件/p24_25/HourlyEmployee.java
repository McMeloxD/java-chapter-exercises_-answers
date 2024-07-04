package com.Work.chap6Oop2.p24_25;

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
    private double salary3; // 工资

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
        if (month == this.getMonth()) {
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
            salary3 += 100;
        }
        if (hours > 160) {
            System.out.print("小时工---" + this.getName() + "这个月一共干了" + hours + "小时,本月工作小时超出" + (hours - 160) + "小时,辛苦了！您的本月工资为：");
            salary3 += hourlySalary * 160 + (hours - 160) * hourlySalary * 1.5;
        } else {
            System.out.print("小时工---" + this.getName() + "这个月一共干了" + hours + "小时,辛苦了！" + "您的本月工资为：");
            salary3 += hourlySalary * hours;
        }

        return salary3;
    }
}
