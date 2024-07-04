package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
//        expand(a);
//        expand2(a);
        expand3(a);
    }

    /*  8. *数组的扩容。
      给定一个数组，要求写一个expand 函数，把原有数组的长度扩容一倍，并
      保留原有数组原有的内容。
      例如，给定一个数组int[] a = {1,2,3}，则扩容之后，a 数组为：{1,2,3，
          0,0,0}*/
    public static void expand(int[] arr) {
        //先创建一个长度为arr*2的数组
        int[] arr2 = new int[arr.length * 2];
        //将arr数组的内容放到arr2
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("扩容后的数组为：" + Arrays.toString(arr2));
    }

    /*第二种方法*/
    public static void expand2(int[] arr) {
        //先创建一个长度为arr*2的数组
        int[] arr2 = new int[arr.length * 2];
        //直接用System类的数组复制方法 System.arraycopy()
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.out.println("扩容后的数组为：" + Arrays.toString(arr2));
    }

    /*第三种方法*/
    public static void expand3(int[] arr) {
        //先创建一个长度为arr*2的数组
        //数组拷贝 Arrays.copyOf()
        int[] arr2 = Arrays.copyOf(arr, arr.length * 2);  //被拷贝数组名，新数组的长度，没有值就为默认0
        System.out.println("扩容后的数组为：" + Arrays.toString(arr2));
    }
}
