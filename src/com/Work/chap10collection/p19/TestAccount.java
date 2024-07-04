package com.Work.chap10collection.p19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestAccount {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Account(10.00,"1234"));
        list.add(new Account(15.00,"5678"));
        list.add(new Account(0,"1010"));
        Map<Long,Account> map = new HashMap<>();
        //迭代，将每个account对象存入map
        for (Object o : list) {
            Account ac = (Account) o;
            map.put(ac.getId(),ac);
        }
        //打印
        for (Long n : map.keySet()){
            System.out.println("ID:" + n + "\t" + map.get(n));
        }
    }
}
