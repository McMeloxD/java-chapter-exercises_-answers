package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Soldier extends NamedRole{
    private int hurt; //伤害
    private Weapon weapon; //武器

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Soldier() {}

    public Soldier(int hurt,  String name, int age) {
        super(name, age);
        this.hurt = hurt;
    }

    @Override
    public int attack() {
        //总攻击输出 = 战士的徒手伤害值 + 武器的伤害值
        int sum = hurt + weapon.fire();
        System.out.println("战士的攻击输出：" + sum);
        return sum;
    }

    @Override
    public void practise() {
        //每调用一次则战士的 hurt 值+10
        System.out.println(getName() + "进行了一次训练,伤害值+10");
        hurt += 10;
    }
}
