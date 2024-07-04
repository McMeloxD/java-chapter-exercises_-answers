package com.qf;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 4. 写一个函数，接受一个整数参数n，输出n 个HelloWorld
 */
public class p4 {
    public static void main(String[] args) {
        Print(5);
    }
    public static void Print(int n){
        for(int i=1;i<=n;i++){
            System.out.println("HelloWorld");
        }
    }
}
