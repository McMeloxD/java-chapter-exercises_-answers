package com.GO.dayHomeWork.week_2.day07;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/24
 * @desc
 */
public class HomeWork_qchbpx {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,3,8,9};
        int[] arr2 = {1,3,0,8,9,0};
        int[] concat = concat(arr1, arr2);
        System.out.println("去重后: " + Arrays.toString(concat) );
    }

    /**
     * @param arr1 数组1
     * @param arr2 数组2
     * @return 返回的是两个数组合并,排序,去重后的新数组
     */
    public static int[] concat(int[] arr1,int[] arr2) {
        // 1先合并(创建大数组)
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println("合并后: " + Arrays.toString(arr3) );
        // 2再排序
        Arrays.sort(arr3);
        System.out.println("排序后: " + Arrays.toString(arr3) );
        // 3去重
        // 初始[0, 1, 1, 2, 3, 3, 5, 8, 9]
        // 创建数组存储去重后的元素,但是这个数组长度多少?
        // 因为无法确定有多少个重复元素,暂时无法确定这个数组多长,但是最长就是arr3.length
        // 目标[0, 1, 2, 3, 5, 8, 9]
        int[] arr4 = new int[arr3.length];
        arr4[0] = arr3[0];// 第一个先放进去
        int index = 1; // 定义arr4数组中出存储的下标位置
        for (int i = 1; i < arr3.length; i++) {
            int v = arr3[i];
            boolean isDuplicate = false;// 假设不重复
            for (int j = 0; j < arr4.length; j++) {
                if (v == arr4[j]){
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) { //如果不重复
                arr4[index] = v;  // //如果布尔表达式为true将执行的语句
                index++;
            }
        }

        // 再创建一个稍微短一点数组,将不重复那几个拷贝过来
        int[] arr5 = new int[index];
        System.arraycopy(arr4,0,arr5,0,index);
        return arr5;
    }

}
