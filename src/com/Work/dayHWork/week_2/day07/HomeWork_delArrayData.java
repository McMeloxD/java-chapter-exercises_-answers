package com.Work.dayHWork.week_2.day07;

import com.OftenUseUtil.printArr;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/28
 * @desc
 */
public class HomeWork_delArrayData {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arr = dleArray(arr, 0); //给下标这个位置删除
        printArr.printArr(arr);

    }

    public static int[] dleArray(int[] arr, int pos) {
        //如果输入的数超出下标界限，返回null，提示出错
        if(pos >= arr.length || pos < 0){
            System.out.println("输入的数超出下标范围啦,请检查后再输入下标!");
            return null;
        }
        //如果要删除的是最后一个元素，直接赋值0
        if(pos == arr.length-1){
            arr[pos] = 0;
            return arr;
        }
        //从下标pos的位置开始将之后的数值往前移动，交换位置
        System.out.println("asdas");
        arr[pos] = 0;
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; //把指定下标后面一个元素值往前移动一位，当i = arr.length-2的时候就已经把最后一个元素替换了
            arr[i + 1] = 0;
        }
        return arr;
    }
}
