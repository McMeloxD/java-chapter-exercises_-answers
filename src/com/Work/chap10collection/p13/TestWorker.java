package com.Work.chap10collection.p13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc
 */
public class TestWorker {
    public static void main(String[] args) {
        //创建存放Worker类型对象的List集合
        List<Worker> list = new ArrayList<>();
        Worker zs = new Worker("zhang3",18,3000);
        Worker ls = new Worker("li4",25,3500);
        Worker ww = new Worker("wang5",22,3200);
        Worker zl= new Worker("zhao6",24,3300);
        list.add(zs);
        list.add(ls);
        list.add(ww);
        int index = list.indexOf(ls); //在li4之前插入
        list.add(index,zl);
        list.remove(ww); //删除王五
        //for循环遍历打印工人信息
        for (Worker worker : list) {
            System.out.println(worker.toString());
        }
        //迭代调用work方法
        Iterator<Worker> it = list.iterator();
        while (it.hasNext()){
                it.next().work();
        }
    }
}
