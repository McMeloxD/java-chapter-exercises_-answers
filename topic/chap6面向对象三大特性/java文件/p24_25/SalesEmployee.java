package com.Work.chap6Oop2.p24_25;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*销售人员*/
public class SalesEmployee extends Employee {
    private double sales;// 月销售额
    private double rate;// 提成率
    private double salary4; // 工资

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int month, double sales, double rate) {
        super(name, month);
        this.sales = sales;
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalay(int month) {
        if (month == this.getMonth()) {
            salary4 = 100 + sales * rate;
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
        }else {
            salary4 = sales * rate;
        }
        System.out.print("纯提成销售员---" + getName() + "本月提成：" + sales * rate + ",辛苦了！" + month + "你的本月份工资为：");
        return salary4;
    }
}
