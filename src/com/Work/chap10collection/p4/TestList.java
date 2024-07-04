package com.Work.chap10collection.p4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("“Hello”");
        list.add("“World”");
        list.add("“Hello”");
        list.add("“Learn”");
        Set set = new HashSet();
        set.addAll(list);
        set.add("“Hello”");
        System.out.println(set.size());
    }
}
