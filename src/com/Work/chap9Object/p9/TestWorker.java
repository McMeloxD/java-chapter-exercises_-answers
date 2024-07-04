package com.Work.chap9Object.p9;

import com.Work.chap5Oop.Address;
import com.Work.dayHWork.week_2.day10.Work;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class TestWorker {
    public static void main(String[] args) {
        Worker worker = new Worker();
        String name = "李文杰";
        String name2 = "李文杰";
        worker.setName(name);
        worker.setAge(20);
        worker.setSalary(10000);
        Address addr = new Address("鹿邑", "471432");
        Address addr2 = addr;
        worker.setAddr(addr);
        Worker worker2= new Worker(name2, 20, 10000, addr2);
        Worker worker3 = new Worker("王文杰", 20, 10000, new Address("太康", "471432"));
        Worker[] workers = {worker, worker2, worker3};
        for (Worker wk : workers){
            System.out.println(wk);
        }
        System.out.println(worker.equals(worker2));
    }
}
