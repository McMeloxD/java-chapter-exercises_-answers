package com.Work.chap8Interface.p12;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc 演奏者
 */
public class Player implements Performer{
    @Override
    public void perform() {
        System.out.println("国家队出征为您伴奏！");
    }
}
