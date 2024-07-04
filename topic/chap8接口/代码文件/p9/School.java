package com.Work.chap8Interface.p9;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class School {
    public static JavaTeacher getTeacher(int i)
    {
        if(i == 0) return new TeacherA();
        else return new TeacherB();
    }
}
