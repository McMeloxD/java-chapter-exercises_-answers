package com.Work.chap10collection.p6;

import java.util.*;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class TestWorker {
    public static void main(String[] args) {
        Set workers = new HashSet();
        Worker worker = new Worker("zhang3",28,3500);
        Worker worker2 = new Worker("zhang3",28,3500);
        System.out.println(worker.hashCode());
        System.out.println(worker2.hashCode());
        workers.add(worker);
        workers.add(worker2);
        System.out.println(workers.size());
    }
}
