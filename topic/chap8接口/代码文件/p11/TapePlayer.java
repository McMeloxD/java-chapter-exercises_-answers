package com.Work.chap8Interface.p11;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TapePlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("TapePlayer play");
    }

    @Override
    public void stop() {
        System.out.println("TapePlayer stop");
    }

    @Override
    public void open() {
        System.out.println("TapePlayer open");
    }
}
