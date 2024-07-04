package com.Work.dayHWork.week_2.weekdHW.p4;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class Bus implements Vehicle {
    @Override
    public void start(String n) {
        System.out.println("公交车" + n+ "“启动了！”");
    }

    @Override
    public void stop(String n) {
        System.out.println("公交车" + n+ "“停止了！”");
    }
}
