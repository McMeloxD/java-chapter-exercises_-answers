package com.Work.chap11throwable.p5_6;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestMyException {
    public static void main(String[] args)  {
        int n;
        try {
            m(2);
        } catch (MyException1 e) {
            //已检查异常必须try catch处理，不然报错，My2则不会报错
            e.printStackTrace();
        } catch (MyException2 e2){
            System.out.println(e2.getMessage());
            //void printStackTrace()打印异常堆栈跟踪信息，String getMessage（）获得异常详细信息
            throw e2;
        }
    }
    //因为my2是运行时异常（未检）所以这里可以不强制处理，已检查异常m1必须try catch处理 或方法声明中throws抛出可能出现的异常
    public static void m(int n) throws MyException1 {
        if (n == 1) {
            throw new MyException1("n == 1");
        } else {
            throw new MyException2("n == 2");
        }
    }
}
