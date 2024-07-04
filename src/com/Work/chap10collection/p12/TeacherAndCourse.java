package com.Work.chap10collection.p12;

import java.util.HashMap;
import java.util.Map;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class TeacherAndCourse {
    public static void main(String[] args) {
        Map tc = new HashMap();
        // 插入键值对
        tc.put("Tom", "CoreJava");
        tc.put("John", "Oracle");
        tc.put("Susan", "Oracle");
        tc.put("Jerry", "JDBC");
        tc.put("Jim", "Unix");
        tc.put("Kevin", "JSP");
        tc.put("Lucy", "JSP");
        tc.put("Allen", "JDBC");
        System.out.println(tc);
        // 将Lucy课程修改
        tc.replace("Lucy", "CoreJava");
        System.out.println(tc);

        //输出所有课程为JSP的老师 ,keySet()返回所有键值
        for (Object name : tc.keySet()){
            //用名字迭代，
            if (tc.get(name).equals("JSP"))
                System.out.println(name + "教JSP");
        }
    }
}
