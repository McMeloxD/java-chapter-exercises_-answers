package com.Work.chap10collection.p17;

import java.util.HashSet;
import java.util.Set;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class TestWoker {
    public static void main(String[] args) {
        Set<Worker> workers = new HashSet<>();
        workers.add(new Worker("文杰哥哥",18,3000,new Address("二七区","123456")));
        workers.add(new Worker("文杰哥哥",18,3000,new Address("二七区","1111")));
        System.out.println(workers);
    }
}
