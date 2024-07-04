package com.GO.chap3method;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 6. *写一个函数，判断一个整数是否是质数
 */
public class p6 {
    public static void main(String[] args) {
        zs(96);
    }
    public static void zs(int n){
        //1和0既非质数也非合数,只有两个正因数（1和它本身）的自然数即为质数。
        if(n>2){
            for (int i = 2; i <= n / 2; i++) {
                if(n%i==0){
                    System.out.println(n + "不是质数哦");
                    break;
                }else{
                    System.out.println(n + "是质数哦");
                    break;
                }
            }
        }else {
            System.out.println("质数从2开始的哦");
        }
    }
}
