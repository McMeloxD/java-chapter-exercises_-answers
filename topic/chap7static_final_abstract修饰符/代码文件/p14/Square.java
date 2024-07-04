package com.Work.chap7static_final_abstract.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*正方形*/
public class Square extends Rect {
    private double slength;//边长

    public Square(double slength) {
        super();
        this.slength = slength;
    }

    public double getSlength() {
        return slength;
    }

    public void setSlength(double slength) {
        this.slength = slength;
    }

    @Override
    public double area() {
        return slength*slength;
    }

    @Override
    public double girth() {
        return slength*4;
    }
}
