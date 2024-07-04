package com.Work.chap6Oop2.p19_22;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/**/
public class TestShape2 {
    public static void main(String[] args) {
        //21小题测试代码
        // Shape shape = getShaper(0);
        // System.out.println(shape.getClass().getSimpleName() +"面积："+shape.area());
        // System.out.println(shape.getClass().getSimpleName() +"周长："+shape.girth());

        //22小题测试代码
        Shape shape = getShaper(2); //用21题获取一个长度为2的正方形
        printShape(shape);
    }
    /*写一个函数getShape(int i)，该函数的参数为一个整数i，返回
    值由i 决定：
    a) i == 0 时，返回一个半径为1 的圆形
    b) i == 1 时，返回一个长为3 宽为2 的矩形
    c) i == 2 时，返回一个边长为2 的正方形*/
    public static Shape getShaper(int i) {
        switch (i){
            case 0:
                return new Circle(1);
            case 1:
                return new Rect(3,2);
            case 2:
                return new Square(2);
            default:
                System.out.println("请输入1-3之间的数哦~");
                return null;
        }
    }

    /*写一个函数，接受一个图形作为参数，打印出该图形的周长和面积*/
    public static void printShape(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() +"面积："+shape.area());
        System.out.println(shape.getClass().getSimpleName() +"周长："+shape.girth());
    }
}
