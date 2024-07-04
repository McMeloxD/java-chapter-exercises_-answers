package com.Work.chap10collection.p23;

import java.util.ArrayList;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestStudent23 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student23("文杰", 18, 100, "四班"));
        list.add(new Student23("文兵", 19, 90, "三班"));
        list.add(new Student23("文闯", 20, 95, "二班"));
        list.add(new Student23("文先", 21, 60, "一班"));
        list.add(new Student23("文科", 22, 88, "二班"));
        list.add(new Student23("文文", 23, 80, "四班"));
        //声明变量
        int sumAge = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        double sumScoreOne = 0;
        double sumCountOne = 0;
        double sumScoreTwo = 0;
        double sumScoreThree = 0;
        double sumScoreFour = 0;
        // 计算所有学生平均年龄
        for (Object o : list) {
            Student23 st = (Student23) o;
            sumAge += st.getAge();
        }
        System.out.println("所有学生的平均年龄为：" + (sumAge/list.size()));

        //计算各班平均分
        for (Object o : list) {
            Student23 st = (Student23) o;
            if (st.getClassNum().equals("一班")){
                sumScoreOne += st.getScore();
                count1++;
            } else if (st.getClassNum().equals("二班")) {
                sumScoreTwo += st.getScore();
                count2++;
            } else if (st.getClassNum().equals("三班")){
                sumScoreThree += st.getScore();
                count3++;
            } else if (st.getClassNum().equals("四班")){
                sumScoreFour += (int) st.getScore();
                count4++;
            }
        }
        System.out.println("一班的的平均分为：" + (sumScoreOne/count1));
        System.out.println("二班的的平均分为：" + (sumScoreTwo/count2));
        System.out.println("三班的的平均分为：" + (sumScoreThree/count3));
        System.out.println("四班的的平均分为：" + (sumScoreFour/count4));
    }
}
