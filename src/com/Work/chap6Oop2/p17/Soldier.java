package com.Work.chap6Oop2.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*战士职业类*/
public class Soldier extends Role{
    private int hurt; //物理伤害值

    public Soldier(String name, int hurt) {
        super(name);
        this.hurt = hurt;
    }

    //封装
    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    //重写
    @Override
    public int attack() {
        //该方法返回战士的攻击对敌人造成的伤害值。
        // 战士的攻击伤害值为：其攻击伤害属性值
        return hurt;
    }
}
