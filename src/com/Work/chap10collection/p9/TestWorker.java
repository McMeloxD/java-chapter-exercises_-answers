package com.Work.chap10collection.p9;

import java.util.TreeSet;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class TestWorker {
    public static void main(String[] args) {
        TreeSet<Worker> ts = new TreeSet<>();
        Worker wk1 = new Worker("James",19,3500);
        Worker wk6 = new Worker("James",19,5000);
        Worker wk5 = new Worker("James2",19,3500);
        Worker wk2 = new Worker("Tom",19,2000);
        Worker wk3 = new Worker("Ivring",30,2000);
        Worker wk4 = new Worker("Curry",21,2400);
        ts.add(wk1);
        ts.add(wk6);
        ts.add(wk5);
        ts.add(wk2);
        ts.add(wk3);
        ts.add(wk4);
        //打印
        for (Worker wk : ts){
            System.out.println(wk);
        }

    }
}
