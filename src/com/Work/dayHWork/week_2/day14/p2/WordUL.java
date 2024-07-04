package com.Work.dayHWork.week_2.day14.p2;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/30
 * @desc
 */
public class WordUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字：");
        String str = sc.nextLine();
        //转字符数组
        char[] arr = str.toCharArray();
        //准备一个StringBuilder空字符串
        StringBuilder sb = new StringBuilder();
        //遍历，大写转小写，小写转大写，数字不要，其他不动,拼接
        for (int i = 0; i < arr.length; i++){
            if (Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
                sb.append(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
                sb.append(arr[i]);
            } else if (!Character.isDigit(arr[i])) {
                sb.append(arr[i]);
            }
        }
        //输出
        System.out.println(sb);
    }
}
