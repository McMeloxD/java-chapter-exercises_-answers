package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，
 * 米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
 */
public class Topic6 {
    public static void main(String[] args) {
        int sum = 24 + 8 + 3;
        int sum2 = 16 + 8 + 3;
        if (sum >= 30) {
           sum *= 0.8;
        }
        System.out.println("如果选择只享受鱼香肉丝优惠则要花：" + sum2 + "元， 如果选择满30元8折优惠要花：" + sum);
        if (sum > sum2) {
            System.out.println("如果选择只享受鱼香肉丝优惠则花的更少");
        } else if (sum == sum2) {
            System.out.println("花的钱一样多");
        }else {
            System.out.println("如果选择满30元8折则花的更少");
        }


    }
}
