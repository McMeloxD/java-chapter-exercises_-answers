package com.GO.chap3method;

import java.awt.*;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 7. *写一个函数，计算两点(x1, y1)和(x2, y2)之间的距离
 */
public class p7 {
    public static void main(String[] args) {
    zb(10,10,30,30);
    }
    //两个坐标点之间的距离公式为d=√((x1-x2)2+(y1-y2)2)
    public static void zb(int x1, int y1, int x2, int y2){
        //声明一个坐标类型
        Point point = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        //用坐标类型自带方法
        double distance = point.distance(point2);
        System.out.println(distance);
        //自己写尝试,用到了Math函数的平方根函数和幂函数  Math.pow(a,n) n代表几次幂
        double distance2 = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
        System.out.println(distance2);

    }
}
