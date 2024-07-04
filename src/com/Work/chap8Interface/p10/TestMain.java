package com.Work.chap8Interface.p10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class TestMain {
    public static void main(String[] args) {
        Animal as[] = new Animal[3];
        as[0] = new Dog();
        as[1] = new Cat();
        as[2] = new Wolf();
// 调用 as 数组中所有动物的 eat 方法
        for (int i = 0; i < as.length; i++){
            as[i].eat();
        }
// 调用 as 数组中所有宠物的 play 方法
        for (int i = 0; i < as.length; i++){
            if (as[i] instanceof Pet){
                ((Pet)as[i]).play();
            }
        }
    }
}
