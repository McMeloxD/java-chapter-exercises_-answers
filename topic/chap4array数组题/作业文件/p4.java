package com.GO.chapter04Array;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n >= 0){
            isExist(n);
        }
    }
   /* 4. 自定义一个整数数组a，读入一个整数n，如果n 在数组中存在，则输出n 的
    下标；如果不存在，则输出-1。*/
    public static void isExist(int n){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //声明一个布尔变量
        boolean flag = false;
        //声明一个存放下标的变量
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) {
                flag = true;
                index = i;
            }
        }
        //如果存在输出
        if (flag) {
            System.out.println(n + "在数组中的下标为：" + index);
        }else {
            //否则输出-1
            System.out.println(-1);
        }
    }


}
