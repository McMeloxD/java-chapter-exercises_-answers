package com.Work.chap6Oop2.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
public class TestGame {
    public static void main(String[] args) {
        Magicer m1 = new Magicer("光辉女郎",5);
        Soldier s1 = new Soldier("盖伦",30);
        Magicer m2 = new Magicer("大发明家",8);
        Soldier s2 = new Soldier("皇子",35);
        Magicer m3 = new Magicer("飞机",10);
        Soldier s3 = new Soldier("盲僧",20);
        Soldier s4 = new Soldier("武器大师",21);
        Team team1 = new Team();
        team1.addMember(m1);
        team1.addMember(s1);
        team1.addMember(s2);
        team1.addMember(s3);
        team1.addMember(s4);
        team1.addMember(m3);
        team1.addMember(m2);
        System.out.println("这个队伍的总伤害为：" + team1.attackSum());
    }
}
