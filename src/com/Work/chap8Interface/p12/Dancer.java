package com.Work.chap8Interface.p12;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc 舞蹈者
 */
public class Dancer implements Performer{
    @Override
    public void perform() {
        System.out.println("蔡徐坤给您跳了一段《鸡你钛镁》");
    }
}
