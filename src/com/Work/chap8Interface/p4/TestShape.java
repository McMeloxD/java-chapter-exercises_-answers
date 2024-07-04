package com.Work.chap8Interface.p4;


/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestShape {
    public static void main(String[] args) {
        //创建一个长度为3 的数组
        Shape[] shapes = new Shape[3];
        //创建三个不同类型对象
        Circle circle = new Circle(2.5);
        Rect rect = new Rect(3.0,5.0);
        Square square = new Square(3.0);
        shapes[0] = circle;
        shapes[1] = rect;
        shapes[2] = square;
        for (int i = 0; i < shapes.length; i++) {
            //.getClass().getSimpleName()获得对象的类名
            System.out.println(shapes[i].getClass().getSimpleName() +"的面积为：" + shapes[i].area());
            System.out.println(shapes[i].getClass().getSimpleName() +"的周长为：" + shapes[i].girth());
        }
    }
}
