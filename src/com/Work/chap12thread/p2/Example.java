package com.Work.chap12thread.p2;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class Example implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();
        Example ex3 = new Example();
        ex1.run();
        new Thread(ex1).start();
        ex3.run();
        new Thread(ex2).start();
        ex2.run();
        new Thread(ex3).start();

    }
}
