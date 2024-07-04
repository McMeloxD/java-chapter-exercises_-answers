package com.Work.dayHWork.week_2.weekdHW.p5;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
abstract class People implements Fish{
    private String name;
    private int age;
    public People(){}
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "姓名:" + name + "，年龄：" + age;
    }
    public void action(){
        System.out.println("“吃饭睡觉打豆豆”");
    }
}
