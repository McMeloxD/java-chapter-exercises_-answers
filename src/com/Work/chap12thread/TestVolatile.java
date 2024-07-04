package com.Work.chap12thread;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/29
 * @desc
 */
public class TestVolatile {
    public static void main(String[] args) {
       TicketWindows tw = new TicketWindows();
       Thread t1 = new Thread(tw);
       Thread t2 = new Thread(tw);
       Thread t3 = new Thread(tw);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
