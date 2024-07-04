package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
/*武器大刀*/
public class Bolo implements Weapon {
    private Soldier s1;
    @Override
    public void setSoldier(Soldier s) {
        this.s1 = s;
    }

    public Bolo() {
    }

    public Bolo(Soldier s1) {
        this.s1 = s1;
    }

    @Override
    public int fire() {
        if (s1.getAge() >= 18) {
            System.out.println(s1.getName() + "今年" + s1.getAge() + "岁，可以用千斤武器，"  + "，增加100伤害值！");
            return 100;
        }
        System.out.println(s1.getName() + "今年" + s1.getAge() + "岁，只能用小型武器，"  + "增加50伤害值！");
        return 50;
    }

}
