package com.Work.dayHWork.week_2.day07;

import java.util.Arrays;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/4/23
 * @desc
 */
public class Demo {
    public static void main(String[] args) {
        int [] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        printArray(arr1);
////        int [] arr2 = retArr();
////        for (int num : arr2){
////            System.out.println(num);
////        }
////        bubbleSort(arr1);
//       chooseSort(arr1);
//        printArray(arr1);
//        arrayCopy2();
//    systemCopy();
        //扩容
//        int[] arr3 ={1, 2, 3, 4, 5};
        System.out.println("扩容前：");
        Arrays.sort(arr1);  //Arrays类的排序方法
        printArray(arr1);
        System.out.println(Arrays.toString(arr1));
//        printArray(arr3);
//        //扩容2倍再存储
//        arr3 = arrayKuoRong(arr3);
//        System.out.println("扩容后：");
//        printArray(arr3);
    }
    //在方法里传入数组来实现拼接数组中的数据  数组当方法
    public static void printArray(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                s +=  arr[i] + ",";
            }else {
                s +=  arr[i] + "]";
            }
        }
        System.out.println(s);
    }

    //数组当方法的返回值
    public static int[] retArr(){
        int [] arr3 = {1, 2, 3};
        return arr3;
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

    //数组拷贝 System.arraycopy()
    public static void systemCopy(){
        //将arr1的元素3，4，5拷贝到数组arr2的5，6，7的位置
        int[] arr1 = {1 , 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[arr1.length];
        System.out.println("拷贝前arr2：");
        printArray(arr2);
        /**
         * arraycopy需要传入5个参数
         * 参数1: 源数组,被拷贝的那个数组
         * 参数2: 从源数组的哪里开始拷贝
         * 参数3: 要拷贝到的目的地数组
         * 参数4: 拷贝过来的数据,在目的地存储的起始位置
         * 参数5: 拷贝的数组元素个数
         */
        System.arraycopy(arr1, 2, arr2, 4, 3);
        System.out.println("拷贝后arr2：");
        printArray(arr2);
    }

    //数组拷贝 Arrays.copyOf()
    public static void arrayCopy2(){
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = Arrays.copyOf(arr1,4);  //被拷贝数组，新数组要拷贝几个
        System.out.println("拷贝后arr2");
        printArray(arr2);
    }

    //数组“扩容” 创建一个更大的数组，把小数组拷贝进去
    public static int[] arrayKuoRong(int[] arr){

       /* 创建一个更大的数组,传入数组的长度的二倍
        int[] arr2 = new int[arr.length * 2];
        将原数组元素拷贝到新数组              系统工具类的方法
        System.arraycopy(arr, 0 , arr2, 0, arr.length);
        */

        int[] arr2 = Arrays.copyOf(arr,  arr.length * 2);
        return  arr2;  //返回新数组


    }
}
