package com.GO.chap3method;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/9
 * @desc 2. 写一个函数，接受一个整数，输出这个整数的所有因子。
 */
public class p2 {
    public static void main(String[] args) {
        yz(15);
        yz2(15);
    }
    public static void yz(int a){
        String yzs = "";
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                if(i * j == a){
                    yzs = yzs + i + " " + j + " ";
                }
            }
        }
        //将字符串放进字符串数组
        String[] yz = yzs.split(" ");
        //再将其转为整数数组并且排序
        int[] intArr = new int[yz.length];
        for (int i = 0; i < yz.length; i++) {
            intArr[i] = Integer.parseInt(yz[i]);
        }
        Arrays.sort(intArr);
        System.out.println(a + "的因子有：" +Arrays.toString(intArr));
    }

    //第二种方法
    public static void yz2(int a){
        System.out.println(a + "的因子有：");
        for (int i = 1; i <= a; i++) {
          if(a%i == 0){
              System.out.print(i + " ");
          }
      }
    }
}
