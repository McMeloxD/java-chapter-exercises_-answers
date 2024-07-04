package com.Work.chap8Interface.p9;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TestSchool {
    public static void main(String[] args) {
        JavaTeacher teacher = School.getTeacher(0);
        teacher.teach();
        teacher = School.getTeacher(1);
        teacher.teach();
    }
}
