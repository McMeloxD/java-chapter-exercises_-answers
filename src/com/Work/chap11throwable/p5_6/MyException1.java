package com.Work.chap11throwable.p5_6;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
//已检查异常
public class MyException1 extends Exception{
    public MyException1(){}
    public MyException1(String s){
        super(s); //调用父类Exception的super（message）方法,捕获异常时说明错误原因cause
    }
}
