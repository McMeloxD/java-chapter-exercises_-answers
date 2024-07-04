package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p7 {
    public static void main(String[] args) {
        /*7. （for 循环）*搬砖问题：36 块砖，36 人搬，男搬4，女搬3，两个小孩抬1 砖，
        要求一次全搬完，问男、女和小孩各若干？*/
            for (int man = 0; man <= 36 / 4; man++) {
                for (int woman = 0; woman <= 36 / 3; woman++) {
                    for (int chir = 0; chir <= 36; chir++) {
                        if (man + woman + chir == 36 && man * 4 + woman * 3 + chir / 2 == 36 && chir % 2 == 0) {
                            System.out.println("Man: " + man + " Woman: " + woman + " Chir: " + chir);
                        }
                    }
                }
            }
    }
}
