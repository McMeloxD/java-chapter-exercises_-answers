package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Magicer extends NamedRole{
    private int level; //魔法等级
    private MagicStick stick; //法师用的法杖

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MagicStick getStick() {
        return stick;
    }

    public void setStick(MagicStick stick) {
        this.stick = stick;
    }
    public Magicer(){}

    public Magicer(int level, String name, int age) {
        super(name, age);
        this.level = level;
    }

    @Override
    public int attack() {
        //当前对象的魔法等级(level) *每一级的固定伤害(5)
        System.out.println("法师的输出：" + level * 5);
        return level * 5;
    }

    @Override
    public void practise() {
        if (null == stick)
            level++;
        level += 1 + stick.fire();
    }
}
