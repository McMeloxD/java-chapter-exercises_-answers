package com.Work.chap10collection.p21;

import java.util.HashMap;
import java.util.Map;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestMap {
    public static void main(String args[]){
        Map map = new HashMap();
        MyKey key1 = new MyKey(10);
        map.put(key1, new MyValue("“abc”"));
        map.put(new MyKey(10), new MyValue("“cde”"));
        System.out.println(map.get(key1));
        System.out.println(map.size());
    }
}
