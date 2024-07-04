package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 中国有闰年的说法。闰年的规则是：
 * 四年一闰，百年不闰，四百年再闰。（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。请打印出1988年到2019年的所有闰年年份。
 */
public class Topic18 {
    public static void main(String[] args) {
        // 循环开始是1988 结束是2019
        for (int i = 1988; i <= 2019; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
}
