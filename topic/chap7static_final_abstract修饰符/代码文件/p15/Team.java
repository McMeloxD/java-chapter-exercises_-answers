package com.Work.chap7static_final_abstract.p15;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/25
 * @desc
 */
/*组队类*/
public class Team {
    private int teamCount = 0; // 统计队伍人数
    // 创建一个队伍数组，最多6人
    Role[] roles = new Role[6];

    // 返回队伍对敌人造成的总伤害值
    public int attackSum() {
        int sum = 0; // 用于计算总伤害
        for (int i = 0; i < roles.length; i++) {
            // 此时还要判断该成员是否是魔法师 instanceof作用是一个对象判断是否是该类的实例
            if (roles[i] instanceof Magicer) {
                sum += roles[i].attack();
                System.out.println("魔法职业" + roles[i].getName() + "对敌人造成了" + roles[i].attack() + "点伤害");
            } else if (roles[i] instanceof Soldier) {
                sum += roles[i].attack();
                System.out.println("战士职业" + roles[i].getName() + "对敌人造成了" + roles[i].attack() + "点伤害");
            }else { //如果非这两个类对象就跳过
                continue;
            }
        }
        return sum;
    }

    // 组队方法
    public void addMember(Role role) {
        // 判断该队伍人数是否已满
        if (this.teamCount < 6) {
            roles[teamCount] = role;
            this.teamCount++;
            System.out.println(role.getName() + "加入成功！队伍已经" + this.teamCount + "人啦");
        } else {
            System.out.println("勇士，当前队伍已满！");
        }
    }
}
