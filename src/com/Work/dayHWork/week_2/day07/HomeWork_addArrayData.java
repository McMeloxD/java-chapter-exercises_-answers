package com.Work.dayHWork.week_2.day07;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/26
 * @desc
 */
public class HomeWork_addArrayData {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1};
        arr = add(arr, 1, 30);
        System.out.println(Arrays.toString(arr) );

    }
    // [0,0,0,0,0]
    // [1,2,0,0,0]
    // [1,2,3,0,0]
    // [1,2,4,3,0]
    // [1,2,5,4,3]
    // [1,2,6,5,4,3,0,0,0,0]
    // 写一个方法,向数组插入数据,如果数组这个位置原来有数据,插入处之后的数据后移.
    // 如果容量不够就扩容为原来的2倍
    // 特殊的,因为整型默认值是0,无法判断0是数据还是默认值,所以暂时不考虑0数据
    // public static void add(int[] arr,index pos,index e)

    public static int[] add(int[] arr, int pos, int e) {

        if (arr == null) {
            System.out.println("数组不存在,请检查后再插入数据!");
            return null;
        }
        if (arr.length == 0) {
            System.out.println("数组长度为0,无法插入!");
            return null;
        }

        // 插入之前,考虑此数组有无空位置,
        // 如果有空位置,该位置是不是最后一个,如果是最后一个直接插入
        //             该位置不是最后一个,插入后,后续往后移动
        // 如果数组没有空位置,就要扩容后,再插入

        boolean hasNull = false;// 假设数组中没有空位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { // 此处为0,即认为有空位置
                hasNull = true;
            }
        }

        if (hasNull) { // 有空位置,插入
            if (arr[pos] == 0) { // 如果插入位置本身是0,即空的,直接插入
                arr[pos] = e;
            } else {
                boolean afterPosHasNull = false;
                int index0 = -1;
                for (int i = pos + 1; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        afterPosHasNull = true;
                        index0 = i;
                        break;
                    }
                }
                // 1,0,4,3,5
                if (afterPosHasNull) { // 意味着插入位置的后续,有空位置,后续元素可以移动
                    for (int i = index0; i > pos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[pos] = e;
                } else {
                    index0 = arr.length;
                    arr = changeSize(arr);
                    for (int i = index0; i > pos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[pos] = e;
                }
            }
        } else {  // 没有空位置,准备扩容
            int index0 = arr.length;
            arr = changeSize(arr);
            // {1,4,1,3,1,0,0,0,0,0};
            for (int i = index0; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = e;
        }
        return arr;
    }


    public static int[] changeSize(int[] arr) {
        int[] arr2 = new int[arr.length * 2];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        return arr2;
    }
}
