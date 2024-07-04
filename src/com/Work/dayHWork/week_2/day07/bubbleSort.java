package com.Work.dayHWork.week_2.day07;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 9,8,7,6,5,4,3,2,1};
    }
    /**
     * 冒泡排序
     * 外层循环执行第一次，内层循环一遍得到： 8,7,6,5,4,3,2,1,9   内层循环了 9次 第二层次数伟 9-1-0 =8次
     * 外层循环执行第二次，内层循环二遍得到： 7,6,5,4,3,2,1,8,9   第二层 - 1 - j是因为最后一个数已经换过位置，
     所以无需再比较，9-1-1=7 只需要循环7次
     */
    public static void bubbleSort(int[] arr){
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
    }
}
