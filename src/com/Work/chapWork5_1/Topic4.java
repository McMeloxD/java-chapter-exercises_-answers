package com.GO.test51;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求:
 * 	一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
 * 	请用程序实现获取这三个和尚的最高身高。
 */
public class Topic4 {
    public static void main(String[] args) {
    int[] arr = {150, 210, 165};
    String sg = Arrays.toString(arr);
    for(int i = 0; i<arr.length - 1; i++){
        if (arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
        System.out.println("这三个和尚身高分别为：" + sg + ", 最高身高为：" + arr[arr.length - 1] + "CM");
    }

}
