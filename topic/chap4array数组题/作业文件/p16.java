package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/18
 * @desc
 */
public class p16 {
    public static void main(String[] args) {
//        TheKingMonkey();
        kingOfMonkey();
    }

    /*16. **十五个猴子围成一圈选大王，依次1-7 循环报数，报到7 的猴子被淘汰，
    直到最后一只猴子成为大王。问，哪只猴子最后能成为大王？*/

    public static void TheKingMonkey() {
        //给猴起名
        String monkey = "慕斯,韦大爷,裤衩子,牢大,赵匡胤,赵匡义,蒙哥,堡宗,朱厚骢,朱厚照,朱瞻基,朱高炽,朱祁镇,朱祁玉,忽必烈";
        //放进字符串数组
        String[] monkeys = monkey.split(",");
        int count = 0;// 记录多少猴子被淘汰
        int i = 0, j = 1;// i表示monkey数组下标 j记录报数
        while (count != monkeys.length - 1) {
            // 一圈报完后从头开始报数
            if (i == monkeys.length) {
                i = 0;
            }
            // 已经被淘汰的猴子不能再报数
            if (monkeys[i] == "out") {
                i++;
                continue;
            }
            // 报数到7的猴子淘汰
            if (j == 7) {
                j = 1;
                monkeys[i] = "out";
                i++;
                count++;
                continue;
            }
            // 报数1-6的猴子
            i++;
            j++;
        }

        // 找出猴王下标
        i = 0;
        //判断到值不是淘汰的就结束循环
        while (monkeys[i].equals("out")) {
            i++;
        }
        System.out.println(Arrays.toString(monkeys));
        System.out.println("第\0" + i + "\0只猴是猴王" + "，我叫" + monkeys[i]);
    }

    //另一种方法
    public static void kingOfMonkey() {
        int[] monkey = new int[15];
        for (int i = 0; i < monkey.length; i++) {
            // 初始化猴子数组
            monkey[i] = 0;
        }
        int count = 0;// 记录多少猴子被淘汰
        int i = 0, j = 1;// i表示monkey数组下标 j记录报数

        while (count != monkey.length - 1) {
            // 一圈报完后从头开始报数
            if (i == monkey.length) {
                i = 0;
            }
            // 已经被淘汰的猴子不能再报数
            if (monkey[i] == -1) {
                i++;
                continue;
            }
            // 报数到7的猴子淘汰
            if (j == 7) {
                j = 1;
                monkey[i] = -1;
                i++;
                count++;
                continue;
            }
            // 报数1-6的猴子
            i++;
            j++;
        }

        // 找出猴王下标
        i = 0;
        while (monkey[i] == -1) {
            i++;
        }
        System.out.println("第\0" + i + "\0只猴是猴王");

    }
}
