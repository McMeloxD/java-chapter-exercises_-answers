package com.Work.dayHWork.week_2.weekdHW;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class GouZao {
    public int checkMax(int a,int b){
        return  a > b ? a : b;
    }
    public double ji(double a,double b,double c){
        return a * b * c;
    }
    public boolean isSame(String s1,String s2){
        return s1.equals(s2);
    }

    public static void main(String[] args){
        GouZao test = new GouZao();
        System.out.println(test.checkMax(10,30));
        System.out.println(test.ji(5.2,8.8,9.9));
        System.out.println(test.isSame("詹姆斯","布朗尼"));
    }
}
