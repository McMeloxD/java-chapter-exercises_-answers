package com.Work.dayHWork.week_2.day13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class Computer {
    private USB[] usb = new USB[3];
    private int count = 0;

    // 插入外设
    public void addUSB(USB usb) {
        if (count < 3) {
            this.usb[count] = usb;
            count++;
            System.out.println("插入外设成功！还有" + (3 - count) + "个USB接口可以插入！");
            return;
        }
        System.out.println("没有USB接口了哦！！");
    }

    // 电脑开机
    public void pcOpen() {
        System.out.println("/**** 外设开启中... ****/");
        System.out.println();
        for (int i = 0; i < usb.length; i++) {
            usb[i].open();
        }
        System.out.println("/**** 外设开启成功！****/");
        System.out.println("/**** 电脑正在开启！****/");
        System.out.println("/**** 开机中，请稍等.... ****/");
        System.out.println("/**** 开机成功！****/");
        System.out.println();
    }

    // 电脑关机
    public void pcClose() {
        System.out.println("/**** 外设关闭中... ****/");
        for (int i = 0; i < usb.length; i++) {
            usb[i].close();
        }
        System.out.println("/**** 外设关闭成功！****/");
        System.out.println("/**** 电脑正在关机中，请稍等.... ****/");
        System.out.println("/**** 关机成功！****/");
    }
}
