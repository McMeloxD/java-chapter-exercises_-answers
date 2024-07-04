package com.Work.dayHWork.week_2.day13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class Mic implements USB{

    @Override
    public void open() {
        System.out.println("******** 麦克风正在启动.... ********");
        System.out.println("麦克风启动中，请稍等...................");
        System.out.println("******** 麦克风启动成功!!! ********");
        System.out.println();
    }

    @Override
    public void close() {
        System.out.println("******** 麦克风正在关闭..... ********");
        System.out.println("麦克风关闭中，请稍等........................");
        System.out.println("******** 麦克风关闭成功!!! ********");
        System.out.println();
    }
}
