package com.Work.chap9Object.p13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class p13 implements IA{

    @Override
    public void ma() {

    }
    public String toString(){
        return "外日特得";
    }

    public static void main(String[] args) {
        IA ia = new p13();
        System.out.println(ia);
    }
}
