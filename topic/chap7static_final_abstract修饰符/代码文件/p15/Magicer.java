package com.Work.chap7static_final_abstract.p15;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*法师职业类*/
public class Magicer extends Role {
    private int level; //魔法等级（范围为1 ~ 10）

    public Magicer(String name, int level) {
        super(name);
        this.level = level;
    }

    //封装
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        //先判断目前等级是否在1 ~ 10之间，不在则返回错误信息
        if (level < 1 || level > 10) {
            System.out.println("魔法等级必须在1 ~ 10之间");
            return; //结束方法
        }
        this.level = level;
    }

    //重写
    @Override
    public int attack() {
        //该方法返回法师的攻击对敌人造成的伤害值。
        // 法师攻击伤害值为：魔法等级*魔法基本伤害值（固定为5）
        return level * 5;
    }
}
