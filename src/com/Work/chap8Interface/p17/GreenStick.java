package com.Work.chap8Interface.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class GreenStick implements MagicStick {
    private int month; // 月份

    public int getMonth() {
        return month;
    }

    public GreenStick() {
    }

    public GreenStick(int month) {
        this.month = month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            System.out.println("月份不合法");
        this.month = month;
    }

    @Override
    public int fire() {
        if (month <= 8 && month >= 6) {
            System.out.println("魔法等级已提升！绿魔棒在" + month + "月" + "会增加2魔法等级！");
            return 2;
        }
        System.out.println("魔法等级已提升！绿魔棒在" + month + "月" + "会增加1魔法等级！");
        return 1;
    }
}
