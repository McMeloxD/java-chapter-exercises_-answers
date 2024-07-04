package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
 * 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
 */
public class Topic10 {
    public static void main(String[] args) {
        int es = 7988 - 1500;
        int zmd = (int) (7988 * 0.8);
        System.out.println("卖二手最后需要花" + es );
        System.out.println("以旧换新最后需要花" + zmd );
        System.out.println(es > zmd ? "以旧换新更划算" : "卖二手更划算");
    }
}
