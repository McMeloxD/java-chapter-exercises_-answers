package com.Work.chap6Oop2.p24_25;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*总员工类*/
public class Employee {
    private String name; // 姓名
    private int month; // 员工生日月份
    private double salary;// 工资
    static double count = 0;// 统计发了几次加班费

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getCount() {
        return count;
    }

    public Employee() {
    }

    // 构造方法
    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    // 根据月份确定实际工资
    public double getSalay(int month) {

        if (this instanceof BasePlusSaleEmployee) {
            System.out.println("因为您是固定底薪+销售人员，所以本月发加班费1000元！,");
            count += 1000;
            if (this.month == month) {
                System.out.println("同时因为您生日是" + month + "月，所以本月奖金100元！,");
                return 1100;
            }
            System.out.println("您的总薪资为：");
            return 1000;
        } else if (this instanceof SalariedEmployee) {
            System.out.println("因为您是固定薪资人员，所以本月发加班费2000元！,");
            count += 2000;
            if (this.month == month) {
                System.out.println("同时因为您生日是" + month + "月，所以本月奖金100元！,");
                return 2100;
            }
            System.out.println("您的总薪资为：");
            return 2000;
        } else if (this.month == month) {
            System.out.println("因为您生日是" + month + "月，所以本月奖金100元！,");
            System.out.println("您的总薪资为：");
            return 100;
        }
        System.out.println("您的总薪资为：");
        return 0;
    }
}
