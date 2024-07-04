package com.Work.chap8Interface.p13;

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
        System.out.println(super.getName() + "您好！");
        return sales * rate + super.getSalay(month);
    }
}
