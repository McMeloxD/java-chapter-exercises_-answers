package com.GO.chaperForWhile;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p11 {
/*11. （循环）**求水仙花数。所谓水仙花数，是指一个三位数abc，如果满足
    a3+b3+c3=abc，则abc 是水仙花数。
*/
public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) {
        int a = i % 10;
        int b = i / 10 % 10;
        int c = i / 100;
        if (a * a * a + b * b * b + c * c * c == i) {
            System.out.println(i);
        }
    }
}
}
