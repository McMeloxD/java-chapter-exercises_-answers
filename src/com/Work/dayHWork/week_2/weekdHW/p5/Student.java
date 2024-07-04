package com.Work.dayHWork.week_2.weekdHW.p5;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class Student extends People {
    private String school;
    public Student(){}
    public Student(String name,int age,String school){
        super(name,age);
        this.school = school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public String toString(){
        return "姓名:" + super.getName() + "，年龄：" + super.getAge() + ",学校：" + school;
    }
    public void action(){
        System.out.println("“学习ing”");
    }
    public void fishing(){
        System.out.println("“学生钓鱼ing”");
    }
}
