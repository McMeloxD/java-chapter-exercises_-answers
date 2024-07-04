package com.Work.chap10collection.p20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class SortList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Learn");
        list.add("王");
        list.add("文");
        list.add("杰");
        System.out.println(list);
        List list3 = reverseList(list);
        System.out.println(list3);
    }

    //函数，接受List，倒序排列
    public static List reverseList(List list){
       List list2 = new ArrayList();
        for (int i = list.size() - 1; i>=0;i--) {
            list2.add(list.get(i));
        }
        return list2;
    }
}
