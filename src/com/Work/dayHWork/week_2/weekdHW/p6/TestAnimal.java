package com.Work.dayHWork.week_2.weekdHW.p6;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Dog dog = new Dog();
        Pig pig = new Pig();
        Cat cat = new Cat();
        animals[0] = dog;
        animals[1] = pig;
        animals[2] = cat;
        for (Animal an : animals){
            an.play();
        }
    }
}
