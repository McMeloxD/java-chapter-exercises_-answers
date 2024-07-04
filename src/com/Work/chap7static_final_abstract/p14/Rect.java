package com.Work.chap7static_final_abstract.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*矩形类*/
public class Rect extends Shape {
    private double width; //宽
    private double length; //长
    public Rect() {}
    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //面积
    @Override
    public double area() {
        return length * width;
    }
    // 周长
    @Override
    public double girth() {
        double a = length + width;
        return a*2;
    }
}
