package com.Work.dayHWork.week_2.weekdHW.scoreArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class TestArr {
    public static void main(String[] args) {
        score();
    }
    public static void score(){
        Scanner sc = new Scanner(System.in);
        //创建一个长度为10数组，存入成绩
        int[] scoreArr = new int[10];
        for(int i = 0; i <10;i++){
            System.out.println("请输入第" + (i+1) + "个人的成绩：");
            int n = sc.nextInt();
            scoreArr[i] = n;
        }
        int temp = 0;
        for (int x = 0; x < scoreArr.length - 1;x++){
            for ( int y = 0; y < scoreArr.length - x -1;y++){
                if (scoreArr[y] < scoreArr[y+1]){
                    temp =  scoreArr[y];
                    scoreArr[y]  =  scoreArr[y+1];
                    scoreArr[y+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(scoreArr));
    }
}
