package com.Work.chap8Interface.p12;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Program {
    private Performer[] ps; // 每个节目多个演员

    public Program() {
        ps = new Performer[3];
        ps[0] = new Player();
        ps[1] = new Singer();
        ps[2] = new Dancer();
    }

    // 节目表演
    public void show() {
        for (int i = 0; i < ps.length; i++) {
            ps[i].perform();
        }
    }

    public static void main(String[] args) {
        Program p = new Program();
        p.show();
    }
}
