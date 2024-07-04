package com.Work.chap8Interface.p11;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class DVDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("DVDPlayer play");
    }

    @Override
    public void stop() {
        System.out.println("DVDPlayer stop");
    }

    @Override
    public void open() {
        System.out.println("DVDPlayer open");
    }
}
