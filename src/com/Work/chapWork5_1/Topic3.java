package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 某外卖商家的菜品单价如下:
 *     1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
 *     2.优惠方式:
 *         总金额大于100元,总金额打9折,其它无折扣
 *     3.需求:
 *         小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
 */
public class Topic3 {
    public static void main(String[] args) {
        int sum = 24 * 3 + 8 * 3 + 3 * 5;
        if (sum >= 100){
            sum *= 0.9;
            System.out.println("最终要付" + sum +"元");
        }else {
            System.out.println("最终要付" + sum +"元");
        }
    }
}
