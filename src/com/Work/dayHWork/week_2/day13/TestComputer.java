package com.Work.dayHWork.week_2.day13;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer pc = new Computer();
        UPan upan = new UPan();
        Mic mic = new Mic();
        KeyBoard keyBoard = new KeyBoard();
        KeyBoard keyBoard2 = new KeyBoard();
        pc.addUSB(upan);
        pc.addUSB(mic);
        pc.addUSB(keyBoard);
        pc.addUSB(keyBoard2);
        pc.pcOpen();
        pc.pcClose();
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        str1 = new String("Hello");
        str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
