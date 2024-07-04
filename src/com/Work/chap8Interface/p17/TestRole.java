package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/29
 * @desc
 */
public class TestRole {
    public static void main(String[] args) {
        Soldier s = new Soldier(30, "李青", 18);
        // //先测试战士用长矛武器
        // Pike changmao = new Pike("李青", s); //创建长矛对象
        // s.setWeapon(changmao);
        // s.practise();
        // s.attack();
        // //测试战士用大刀
        // Soldier s2 = new Soldier(25, "男刀", 18);
        // Bolo dadao = new Bolo(s2);
        // s2.setWeapon(dadao);
        // s2.practise();
        // s2.attack();
        //测试法师用绿法杖
        Magicer m = new Magicer(5, "光辉", 18);
        GreenStick lfz = new GreenStick(8);
        m.setStick(lfz);
        m.practise();
        m.attack();
        //测试法师用黑法杖
        Magicer m2 = new Magicer(8, "小炮", 18);
        GreenStick lfz2 = new GreenStick(8);
        m2.setStick(lfz2);
        m2.practise();
        m2.attack();
    }
}
