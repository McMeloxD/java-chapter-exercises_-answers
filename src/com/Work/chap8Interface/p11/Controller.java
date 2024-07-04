package com.Work.chap8Interface.p11;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Controller {
    private MediaPlayer[] players;

    public Controller() {
        players = new MediaPlayer[3];
        players[0] = new DVDPlayer();
        players[1] = new CDPlayer();
        players[2] = new TapePlayer();
    }

    // 将对应的设备调用play方法
    public void play(int i) {
        players[i].play();
    }

    // 将对应的设备调用stop方法
    public void stop(int i) {
        players[i].stop();
    }

    // 将对应的设备调用open方法
    public void open(int i) {
        players[i].open();
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        c.players[0].play();
        c.players[0].stop();
        c.players[0].open();
    }
}
