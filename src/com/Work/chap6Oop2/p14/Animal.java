package com.Work.chap6Oop2.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/24
 * @desc
 */
public class Animal {
    private String name;
    //构造
    public Animal(){}
    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
