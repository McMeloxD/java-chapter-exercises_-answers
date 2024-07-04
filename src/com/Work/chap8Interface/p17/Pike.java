package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Pike implements Weapon {
    private String name; // 长矛名字
    private Soldier s2;

    public Pike() {}
    public Pike(String name, Soldier s) {
        this.name = name;
        this.s2 = s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setSoldier(Soldier s) {
        this.s2 = s;
    }

    @Override
    public int fire() {
        if (this.name.equals(s2.getName())) {
            System.out.println(s2.getName() + "使用了专属武器：" + name + "，增加1000伤害值！");
            return 1000;
        }
        System.out.println(s2.getName() + "使用普通武器：" + name + "，增加25伤害值！");
        return 25;
    }
}
