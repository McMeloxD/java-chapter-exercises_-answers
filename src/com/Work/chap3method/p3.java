package com.GO.chap3method;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 3. 写一个函数，接受一个整数n，输出1+2+3+...+n 的和
 */
public class p3 {
    public static void main(String[] args) {
        add(10);
    }
    public static void add(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("1+2+3+...+"+ n +"等于：" + sum);
    }
}
