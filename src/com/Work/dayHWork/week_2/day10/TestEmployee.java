package com.Work.dayHWork.week_2.day10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestEmployee {

    static void main(String[] args) {
// 创建6个员工对象
        Employee e1 = new Employee("e1", 1000.0);
        Employee e2 = new Employee("e2", 2100.0);
        Employee e3 = new Employee("e3", 800.0);
        Employee e4 = new Employee("e4", 1300.0);
        Employee e5 = new Employee("e5", 2105.0);
        Employee e6 = new Employee("e6", 3700.0);
        Employee[] emps = {e1, e2, e3, e4, e5, e6};
        // 声明两个变量，循环计算平均工资
        double sumSalary = 0.0;
        double avgSalary = 0.0;
        for (int i = 1; i < emps.length; i++) {
            sumSalary += emps[i].getSalary();
        }
        avgSalary = sumSalary / emps.length;
        System.out.println("平均工资：" + avgSalary);
    }
}
