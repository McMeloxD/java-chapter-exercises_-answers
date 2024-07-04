package com.Work.chap10collection.p25;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestMySatck {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("Hello");
        ms.push("WenJie");
        ms.push("Love");
        ms.push("You");
        //测试pop，返回并删除栈顶元素
        System.out.println(ms.pop());
        System.out.println(ms);
        //测试peek，只返回
        System.out.println(ms.peek());
        //测试size返回数量
        System.out.println(ms.size());
        MyStack ms2 = new MyStack();
        //测试是否为空
        System.out.println(ms2.isEmpty());
        System.out.println(ms2.peek());
        System.out.println(ms2.pop());
    }
}
