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
    private String name; //姓名
    private int month; //员工生日月份
    private double salary;//工资

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

    public Employee() {}
    //构造方法
    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }
    //根据月份确定实际工资
    public double getSalay(int month){
        if(month == this.month) {
            System.out.println(this.name + "因为您生日在本月，工资加100! ");
            return salary + 100;
        }
        return salary;
    }
}
