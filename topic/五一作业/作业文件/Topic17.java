package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 已知2023年是兔年，请在控制台输出从1949年到2023年中所有是兔年的年份(考虑1-12月份整年,不考虑1月份是虎年的情况)
 */
public class Topic17 {
    public static void main(String[] args) {
        // 循环开始是1949 结束是2023
        for (int i = 1949; i <= 2023; i++) {
            //如果年份和2023年的差值是12的倍数 则说明是兔年
            if ((2023 - i) % 12 == 0) {
                System.out.println(i);
            }
        }


    }
}