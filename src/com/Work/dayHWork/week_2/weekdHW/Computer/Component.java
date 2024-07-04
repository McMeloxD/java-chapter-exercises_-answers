package com.Work.dayHWork.week_2.weekdHW.Computer;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
//计算机构成类
abstract class Component{
    private double price; //价格
    private String name; //名称


    //构造
    public Component(){}
    public Component(double price, String name){
        this.price = price;
        this.name = name;
    }
    //封装
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //描述方法
    abstract public String description();
}
