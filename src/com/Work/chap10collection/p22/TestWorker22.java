package com.Work.chap10collection.p22;

import java.util.HashSet;
import java.util.Set;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestWorker22 {
    public static void main(String[] args) {
        Set<Worker22> set = new HashSet();
        set.add(new Worker22("文杰",3000,18));
        set.add(new Worker22("文杰",3000,18));
        set.add(new Worker22("文兵",4500,20));
        for (Worker22 worker22 : set) {
            System.out.println(worker22);
        }
    }
}
