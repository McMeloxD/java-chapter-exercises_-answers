package com.Work.chap6Oop2.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*职业类*/
public class Role {
    private String name; //角色名字

    //构造方法
    public Role(){}

    public Role(String name) {
        this.name = name;
    }
    //封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //返回角色的攻击对敌人的伤害。
    public int attack(){
        return 0;
    }

}
