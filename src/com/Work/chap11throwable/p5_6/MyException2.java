package com.Work.chap11throwable.p5_6;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
//未检查异常 运行时
public class MyException2 extends RuntimeException{
    public MyException2(){}
    public MyException2(String s){
        super(s);
    }
}
