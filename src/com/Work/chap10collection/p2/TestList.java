package com.Work.chap10collection.p2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class TestList {
    public static void main(String[] args) {
        List list = new Vector();
        list.add("Hello");
        list.add("Hello1");
        list.add(1,"Hello2");
        list.add(1,"Hello3");
        prinlist(list);
    }
    public static void prinlist(List list){
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
