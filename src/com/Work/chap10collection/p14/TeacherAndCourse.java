package com.Work.chap10collection.p14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class TeacherAndCourse {
    public static void main(String[] args) {
        Map<String, String> tc = new HashMap<>();
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

        //使用Map.Entry遍历  键值映射集
        Set<Map.Entry<String, String>> entrySet = tc.entrySet();
        for (Map.Entry<String, String> entry : entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("教师名：" + key + "\t课程名:" + value);
        }
    }
}
