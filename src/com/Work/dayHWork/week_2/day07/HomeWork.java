package com.Work.dayHWork.week_2.day07;

import com.OftenUseUtil.printArr;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/23
 * @desc HomeWork
 */
public class HomeWork {
    public static void main(String[] args) {
        // 测试合并第一题
//        hb1();
        // 测试合并第二题
//        hb2();
//        // 测试合并第三题
        hb3();
//         测试查找下标第四题 第一种方法
//        String result = findIndex();
//        System.out.println(result);
        // s 第一种方法
//     String result =  findIndex2();
//     System.out.println(result);
    }

    // 1 写一个方法 用于合并两个int类型的数组  合并法则如下
    //   {1,2,5,8,9}{1,3,0}---->{1,2,5,8,9,1,3,0} (合并)
    public static void hb1() {
        // 1)先创建两个数组
        int[] arr1 = {1, 2, 5, 8, 9};
        int[] arr2 = {1, 3, 0};
        // 先遍历两个数组
        printArr.printArr(arr1);
        printArr.printArr(arr2);
        // 2)创建一个大数组，长度等于两个数组的长度和
        int[] arr3 = new int[arr1.length + arr2.length];
        // 3)将两个数组元素分别拷贝到新数组中
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        // 拷贝arr2的时候，第三个参数也就是在新数组中起始位置要从arr1最后一个位置之后开始
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        // 4)遍历合并后数组
        printArr.printArr(arr3);
    }

    // 2 写一个方法 用于合并两个int类型的数组  合并法则如下
    //   {1,2,5,,3,8,9}{1,3,0}---->{0,1,1,2,3,3,5,8,9} (合并并排序不需要去重)
    public static void hb2() {
        // 1)先创建两个数组
        int[] arr1 = {1, 2, 3, 5, 8, 9};
        int[] arr2 = {1, 3, 0};
        // 先遍历两个数组
        printArr.printArr(arr1);
        printArr.printArr(arr2);
        // 2)创建一个大数组，长度等于两个数组的长度和
        int[] arr3 = new int[arr1.length + arr2.length];
        // 3)将两个数组元素分别拷贝到新数组中
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        // 拷贝arr2的时候，第三个参数也就是在新数组中起始位置要从arr1最后一个位置之后开始
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        // 4)遍历合并后数组
        printArr.printArr(arr3);
        // 5)新数组进行排序
        Arrays.sort(arr3);
        printArr.printArr(arr3);
    }

    //    写一个方法 用于合并两个int类型的数组  合并法则如下
//    {1,2,5,3,8,9}{1,3,0}---->{0,1,2,3,5,8,9} (合并,去重,并排序)
    public static void hb3() {
        // 1)先创建两个数组
        int[] arr1 = {1, 2, 3, 5, 8, 9};
        int[] arr2 = {1, 3, 0};
        // 先遍历两个数组
        printArr.printArr(arr1);
        printArr.printArr(arr2);
        // 2)创建一个大数组，长度等于两个数组的长度和
        int[] arr3 = new int[arr1.length + arr2.length];
        // 3)将两个数组元素分别拷贝到新数组中
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        // 拷贝arr2的时候，第三个参数也就是在新数组中起始位置要从arr1最后一个位置之后开始
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        // 4)遍历合并后数组
        printArr.printArr(arr3);
        // 5)去重 参考选择排序
        int a = 0; // 去重数组长度
        for (int i = 0; i < arr3.length; i++) {
            int minIndex = i; // 相同值的下标
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[j] == arr3[minIndex]) {
                    a += 1;
                    minIndex = j;
                }
            }
            arr3[minIndex] = 0;

        }
        printArr.printArr(arr3);
//        给数组赋值

//        PrintArr.printArray(arr4);

    }

    //
//    设计方法,在一个数组中，返回所有的 指定数据的下标
//    例如, 这个数组[1,2,8,4,5,7,8,7,8,9],找到其中元素8的下标[2,6,8]
    // 第一种方法
    public static String findIndex() {
        int[] arr1 = {1, 2, 8, 4, 5, 7, 8, 7, 8, 9};
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 8) {
                a++;  // 先查出有几个值
            }
        }
        int[] arr2 = new int[a];  // 建立新数组
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 8) {
                arr2[index] = i;  // 给新数组赋值
                index++;
            }
        }
        return "含有元素8的下标有：" + Arrays.toString(arr2);
    }

    // 第二种方法
    public static String findIndex2() {
        int[] arr1 = {1, 2, 8, 4, 5, 7, 8, 7, 8, 9};
        String str = "含有元素8的下标有： ";
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 8) {
                str = str + i + " ";  // 先查出有几个值
            }
        }
        return str;
    }


    public static void addArrDate(int[] arr) {
        // 先声明一个有数据的数组
        int[] arr1 = {1, 2, 8, 4};
        // 遍历一下传入的数组
        printArr.printArr(arr);
        // 判断传入数组是否有数据
        int iMax = arr.length;
        if (iMax > arr1.length)
            if (iMax != 0) {

            }

    }


}
