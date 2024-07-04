package com.Work.chap7static_final_abstract.p8;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/27
 * @desc
 */
public class TestMain {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        int value = 5;
        final int fvalue = 10;
        mc.printValue(value); //1
        mc.printValue(fvalue); //2
        mc.changeValue(value); //3
        mc.changeValue(fvalue);//4
        System.out.println(value);

    }

}
class MyClass {
    public void printValue(final int value){
        System.out.println(value);
    }
    public void changeValue(int value){
        value = value * 2;
        System.out.println(value);
    }
}