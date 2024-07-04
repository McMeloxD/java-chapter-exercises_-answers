package com.Work.chap6Oop2.p19_22;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
//圆形类
public class Circle extends Shape{
    private double radius; //半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //求面积
    public double area(){
        return Math.PI * radius * radius;
    }

    //求周长
    public double girth(){
        return Math.PI*2*radius;
    }
}
