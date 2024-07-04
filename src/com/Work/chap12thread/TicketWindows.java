package com.Work.chap12thread;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/29
 * @desc
 */
public class TicketWindows implements Runnable {
    private volatile int ticket = 100; // 一百张票，用volatile修饰

    @Override
    public void run() {
        // 重写run方法，模拟卖票,通过下面我们可以发现：对一个共享资源可以多个线程同时进行修改，自然就会有线程安全问题。
        while (true){
            if (ticket > 0){
                try {
                    Thread.sleep(100); //多个线程同时判断到“ticket>0”，然后休眠
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                //多个线程同时唤醒，并且同时进行ticket--操作
                System.out.println(Thread.currentThread().getName() + "卖出一张票,当前票数：" + ticket--);
            }else break;
        }
    }
}
