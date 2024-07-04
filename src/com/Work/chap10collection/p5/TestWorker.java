package com.Work.chap10collection.p5;

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
        List workers = new ArrayList();
        workers.add(new Worker("zhang3",18,3000));
        workers.add(new Worker("li4",25,3500));
        workers.add(new Worker("wang5",22,3200));
        //插入赵六
        int index = 0;
        for (Object worker : workers) {
            Worker worker1 = (Worker) worker;
            if (worker1.getName().equals("li4"))
                index = workers.indexOf(worker);
        }
        workers.add(index,new Worker("zhao6",24,3300));
        //for循环遍历打印工人信息
        for (Object worker : workers) {
            if (worker instanceof Worker) {
                System.out.println(worker);
            }
        }
        //在java中，集合遍历过程中不能删除或增加元素，因为集合是动态的，如果删除增加下标会变化，除非先获取下标在循环外删除，或用迭代器
        //迭代器只有特有的删除方法
        Iterator it = workers.iterator();
        while (it.hasNext()){
            Worker worker2 = (Worker) it.next();
            if (worker2.getName().equals("wang5"))
                //删除王五
                it.remove();
        }
        //for循环遍历打印工人信息
        for (Object worker : workers) {
                if (worker instanceof Worker) {
                    System.out.println(worker);
                }
        }
        //迭代调用work方法
        Iterator<Worker> it2 = workers.iterator();
        while (it2.hasNext()){
                it2.next().work();
        }
    }
}
