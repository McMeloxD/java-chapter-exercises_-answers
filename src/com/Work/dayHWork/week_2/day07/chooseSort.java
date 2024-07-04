package com.Work.dayHWork.week_2.day07;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class chooseSort {
    public static void main(String[] args) {
        int[] arr = { 151,31,84,7,8};
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 选择排序
     * 假定第一个最小，用第一个下标0与后面数字按顺序比较，记录最小下标，比较完成把最小放在第一下标
     * 接下来从第二个下标开始与后面依次比较排序
     */
    public static void chooseSort(int[] arr){
        for (int i = 0; i < arr.length; i++ ){
            int minIndex = i;       //声明最小下标为每次循环作为第一个比较的数，也急就是当前的i
            for (int j = i + 1; j < arr.length; j++) {      //选择从当前的i之后第二个下标开始依次作比较
                if (arr[j] < arr[minIndex]){    //当前循环的数与目前选择出的最小值作比较
                    minIndex = j;  //如果当前数没有目前最小值的数小，就把最小值的下标改为当前下标j的值
                }
            }
            int temp = arr[i];  //声明一个临时变量 存放交换当前外层i的值
            arr[i] =arr[minIndex]; //再把本轮循环中最小值赋值在当前外层i的值，放到i位置也就是当前最小的位置
            arr[minIndex] = temp; //把原本外层arr【i】的值 放到这个下标内，因为最小值已经挪给【i】。
        }
    }
}
