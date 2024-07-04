package com.Work.chap12thread.p15;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/14
 * @desc
 */
public class Student {
    String name;
    int age;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //学生问老师问题
    public void ask(Teacher t){
        t.answer(this);
    }
    public void study(){
        System.out.println(name + "学习");
    }
    public void doHomeWork(){
        System.out.println(name + "做作业咯");
    }
}
