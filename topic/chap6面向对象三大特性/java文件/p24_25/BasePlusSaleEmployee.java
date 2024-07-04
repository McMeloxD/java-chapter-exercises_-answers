package com.Work.chap6Oop2.p24_25;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*固定底薪的销售人员*/
public class BasePlusSaleEmployee extends SalesEmployee{
    private double baseSalary;//底薪
    private double salary5;//工资

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
        if (month == this.getMonth()) {
            salary5 = 100 + baseSalary + this.getSales() * this.getRate();
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
        }else {
            salary5 = baseSalary + this.getSales() * this.getRate();
        }
        System.out.print("固定工资+提成销售员---" + this.getName() + "本月提成：" + this.getSales() * this.getRate() + ",辛苦了！"  + "你的本月份工资为：" );
        return salary5;
    }
}
