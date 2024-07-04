package com.Work.chap10collection.p15;

import java.util.ArrayList;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
class MyClass{
    int value;
    public MyClass(){}
    public MyClass(int value){ this.value = value; }
    public String toString(){
        return " "+value;
    }
}
public class TestList {
    public static void main(String args[]){
        MyClass mc1 = new MyClass(10);
        MyClass mc2 = new MyClass(20);
        MyClass mc3 = new MyClass(30);
        List list = new ArrayList();
        list.add(mc1);
        list.add(mc2);
        list.add(mc3);
        MyClass mc4 = (MyClass) list.get(1);
        mc4.value = 50;
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
