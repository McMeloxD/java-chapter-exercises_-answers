package com.Work.chap8Interface.p13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestEmployee {
    public static void main(String[] args) {
        SalariedEmployee zsg = new SalariedEmployee("张三", 2, 3250);
        // System.out.println(zsg.getSalay(3));

        HourlyEmployee hour = new HourlyEmployee("李四", 2, 165, 20);
        // System.out.println(hour.getSalay(2));

        SalesEmployee sale = new SalesEmployee("王五", 5, 20000, 0.35);
        // System.out.println(sale.getSalay(5));

        BasePlusSaleEmployee base = new BasePlusSaleEmployee("赵六", 11, 15000, 0.15, 2250);
        // System.out.println(base.getSalay(11));

        Employee[] employees = new Employee[4];
        employees[0] = zsg;
        employees[1] = hour;
        employees[2] = sale;
        employees[3] = base;
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getSalay(11));
        }
        System.out.println("一共发了加班费：" + employees[0].getCount());

    }
}
