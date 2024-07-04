package com.GO.chapter04Array;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/17
 * @desc
 */
public class p9 {
    static int[] a = {1, 3, 2, 5,7}; //多个函数可以直接操作该数组
    static int index = 5; //定义一个index 变量，用来保存数组的有效元素的个数。

    public static void main(String[] args) {
        delete(2);
        insert(1, 4);
        insert(2, 9);
    }
    /*9. *数组的插入和删除*/
    /*写两个函数，一个函数为delete 函数，声明如下：
    public static void delete(int pos)
    该函数表示删除数组pos 位置上的元素。
    第二个函数为insert 函数，声明如下：
    public static void insert(int pos, int value)
    该函数表示在数组pos 位置上插入value 值。*/

    //插入函数
    public static void insert(int pos, int value) {
        //判断输入下标是否正确
        if (pos < -1 || pos > index - 1) {
            System.out.println("输入下标有误，请检查重新输入！");
            return; //在最上面用return可以不执行后面的内容直接停止执行方法
        }
        //如果有效元素个数与数组长度一致，扩容
        if (index == a.length) {
            int temp = 0;
            int[] newArray = new int[a.length * 2];
            System.arraycopy(a, 0, newArray, 0, a.length);
            //扩容后再把插入位置的值开始依次往后挪
            for (int i = a.length - 1; i > pos; i--) {
                temp = newArray[i];
                newArray[i] = newArray[i - 1];
                newArray[i + 1] = temp;
            }
            newArray[pos] = value;
            System.out.println(Arrays.toString(newArray));
            index += 1;
        } else if (index < a.length){
            //如果此时有效元素个数小于数组长度,,直接往后挪，再插入值
            int temp = 0;
            //这里的i要从有效元素个数对应的下标开始往前，因为有效个数之后的一位一定是0
            for (int i = index - 1; i > pos; i--) {
                temp = a[i];
                a[i] = a[i - 1];
                a[i + 1] = temp;
            }
            a[pos] = value;
            System.out.println(Arrays.toString(a));
            index += 1;
        }
    }

    //删除函数
    public static void delete(int pos) {
        //判断输入下标是否正确
        if (pos > -1 && pos < index) {
            a[pos] = 0;
            //从要删除的位置开始，把后面的数放前面放
            for (int i = pos; i < index - 1; i++) {
                a[i] = a[i + 1];
            }
            a[index - 1] = 0; //最后位置改为0
            index -= 1; //有效元素个数-1
            System.out.println(Arrays.toString(a));
        } else {
            System.out.println("输入的下标有误！");
        }
    }
}
