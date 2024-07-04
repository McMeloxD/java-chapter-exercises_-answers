package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class p11_13 {
    public static void main(String[] args) {
        Worker wk = new Worker("zhangsan",25,2500);
        wk.addr = new Address("北京市海淀区清华园1号","100084");
        System.out.println(wk.toString());
    }
}
