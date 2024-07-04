package com.GO.chap3method;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 5. *写一个函数，接受一个整数，输出这个整数是几位数
 */
public class p5 {
    public static void main(String[] args) {
        ws(999);
    }
    public static void ws(int n){
        int i = 0;
        while(n > 0){
            n /= 10;
            i++;
        }
        System.out.println( "是" + i + "位数");
    }
}
