package com.Work.dayHWork.week_2.day07;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/22
 * @desc
 */
/*二分搜索*/
public class bearySearc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bearySearch(arr, 10);
    }
    private static void bearySearch(int[] arr, int e) {
        int left = 0; // 左边界
        int right = arr.length - 1; // 右边界
        int mid = (left + right) / 2;// 中间值

        while(left <= right){
            if (e > arr[mid]) { // 要找的数在右侧
                left = mid + 1; // 左边界缩小
            } else if (e < arr[mid]) { // 要找的数在左侧
                right = mid - 1;  // 有边界缩小
            } else {
                System.out.println(e + "在数组中的下标为：" +mid);
                return;
            }
            mid = (left + right) / 2;// 缩小边界后,中间值重新计算
        }
        System.out.println("数组中没有这个值哦" );
    }
}
