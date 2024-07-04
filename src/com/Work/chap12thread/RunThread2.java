package com.Work.chap12thread;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/29
 * @desc
 */
public class RunThread2 extends Thread{
    private volatile boolean isRunning = true;

    private void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void run() {
        System.out.println("进入run方法..");
        int i = 0;
        while (isRunning == true) {

        }
        System.out.println("线程停止");
    }

    public static void main(String[] args) throws InterruptedException {
        RunThread2 rt = new RunThread2();
        rt.start();
        Thread.sleep(1000);
        rt.setRunning(false); //主线程main调用rt类的set方法将该变量值更改,因为该值被volatile修饰，主内存刷新值
        System.out.println("isRunning的值已经被设置了false");
    }
}
