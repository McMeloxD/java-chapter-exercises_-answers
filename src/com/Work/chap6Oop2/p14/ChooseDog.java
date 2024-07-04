package com.Work.chap6Oop2.p14;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/24
 * @desc
 */
public class ChooseDog {
    public static void main(String[] args) {
        Animal[] as = new Animal[]{

                new Dog("Pluto"),

                new Cat("Tom"),

                new Dog("Snoopy"),

                new Cat("Garfield")
        };

        Dog[] dogs = getAllDog(as);

        for (int i = 0; i < dogs.length; i++) {

            System.out.println(dogs[i].getName());
        }
    }

    public static Dog[] getAllDog(Animal[] as) {

        // 声明一个计算狗狗下标
        int index = 0;
        Dog[] dogs1 = new Dog[as.length];
        for (int i = 0; i < as.length; i++) {
            // 判断该数组中的对象是否位Dog的子类  instanceof判断对象是否为某个类的子类
            if (as[i] instanceof Dog) {
                dogs1[index] = (Dog) as[i];
                index++;
            }
        }
        // 然后拷贝一个数组，把空值给去掉
        Dog[] dogs2 = new Dog[index];
        System.arraycopy(dogs1, 0, dogs2, 0, index);
        return dogs2;
    }
}


