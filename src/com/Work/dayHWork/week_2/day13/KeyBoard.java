package com.Work.dayHWork.week_2.day13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("******** 键盘正在启动.... ********");
        System.out.println("键盘启动中，请稍等.....................");
        System.out.println("******** 键盘启动成功!!! *********");
        System.out.println();
    }

    @Override
    public void close() {
        System.out.println("******** 键盘正在关闭.... ********");
        System.out.println("键盘关闭中，请稍等...................");
        System.out.println("******** 键盘关闭成功!!! ********");
        System.out.println();
    }
}
