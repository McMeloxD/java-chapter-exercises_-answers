package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p5 {
    public static void main(String[] args) {
        int[] arr = {10,35,1,98,1354,12};
//        findMaxMin(arr);
        findMaxMin2(arr);
    }
    /*5. 给定一个数组，输出数组中的最大值和最小值*/
    public static void findMaxMin(int[] arr) {
        //先找最大值
        int temp = 0; //声明一个换数值用的小二
        //倒数第二个和最后一个比，所以这里用<长度-1
        for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    //如果前面的数大于后面的数，把大的数放在下一个数上继续和后面比
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
            }
        }
        System.out.println("最大值是：" + arr[arr.length - 1]);

        //找最小值
        int temp2 = 0; //声明一个换数值用的小二
        for (int j = 0; j < arr.length - 1; j++) {
            if(arr[j] < arr[j + 1]) {
                //如果前面的数小于后面的数，把小的数放在下一个数上继续和后面比
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("最小值是：" + arr[arr.length - 1]);
    }

    /*用Array类的sort方法最简单*/
    public static void findMaxMin2(int[] arr) {
        Arrays.sort(arr);
        System.out.println("最大值是" + arr[arr.length - 1]);
        System.out.println("最小是" + arr[0]);
    }
}
