package com.Work.chap9Object.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class TestLamp {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        //局部内部类
        class JuLamp implements Light{
            @Override
            public void shine() {
                System.out.println("SHINE IN RED");
            }
        }
        lamp.on(new JuLamp());

        //匿名内部类
        lamp.on(new Light() {
            @Override
            public void shine() {
                System.out.println("SHINE IN Yello");
            }
        });
    }
}
