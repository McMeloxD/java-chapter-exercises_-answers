package com.Work.chap10collection.p25;

import java.util.LinkedList;
import java.util.List;


/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class MyStack {
    private LinkedList list;

    //创建栈类给list赋值
    public MyStack() {
        this.list = new LinkedList();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    //元素放入栈
    public void push(Object o){
        if (null != o)
            list.add(o);
    }

    //返回栈顶元素，并删除该元素，若栈为空则返回null
    public Object pop(){
        //先判断栈是否为空
        if (list.isEmpty()){
            return null;
        }else {
            //不为空则先取出，再删除，再返回
            Object o = list.removeLast();
            list.removeLast();
            return o;
        }
    }

    //返回栈顶元素，但不删除元素，若栈为空，则返回null值
    public Object peek(){
        //先判断栈是否为空
        if (list.isEmpty()){
            return null;
        }else {
            //不为空则先取出
            Object o = list.getLast();
            return o;
        }
    }

    //判断该栈是否为空
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //返回栈中元素数量
    public int size(){
        return list.size();
    }
}
