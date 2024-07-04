package com.Work.chap10collection.p7;

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
        Set set = new HashSet();
        Worker wk1 = new Worker("Tom",18,2000);
        Worker wk2 = new Worker("Tom",18,2000);
        System.out.println(wk1.hashCode());
        System.out.println(wk2.hashCode());
        set.add(wk1);
        set.add(wk2);
        System.out.println(set.size());
    }
}
