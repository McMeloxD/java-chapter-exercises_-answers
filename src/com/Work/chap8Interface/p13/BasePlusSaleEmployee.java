package com.Work.chap8Interface.p13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*固定底薪的销售人员*/
public class BasePlusSaleEmployee extends SalesEmployee {
    private double baseSalary;//底薪
    public BasePlusSaleEmployee(String name, int month, double sales, double rate, double baseSalary) {
        super(name, month, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getSalay(int month) {
        return baseSalary + super.getSalay(month);
    }
}
