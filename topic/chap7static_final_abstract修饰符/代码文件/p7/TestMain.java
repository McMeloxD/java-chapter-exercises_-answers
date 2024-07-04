package com.Work.chap7static_final_abstract.p7;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class TestMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(20);
        System.out.println(myClass.value);
    }
}
class MyClass{
    final int value;
    String value2;
    public MyClass() {
        value = 10;
    }
    public MyClass(int value) {
        this.value = value;
    }

}