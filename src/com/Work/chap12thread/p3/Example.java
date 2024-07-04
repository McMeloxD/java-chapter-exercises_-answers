package com.Work.chap12thread.p3;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class Example implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new Example());
        t.start();
    }

    @Override
    public void run() {

    }
}
