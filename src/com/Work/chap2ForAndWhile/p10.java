package com.GO.chaperForWhile;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/15
 * @desc
 */
public class p10 {
    public static void main(String[] args) {
/*
        10. （循环）*输出99 乘法表
*/
        //循环9次
        for (int i = 1; i < 10; i++){
            //每次从1-i去×i
            for (int j = 1; j <= i; j++){
                //如果是最后一位数就换行
                if (i == j){
                    System.out.println(j + "x" + i + "=" + i*j);
                }else{
                    System.out.print(j + "x" + i + "=" + i*j + "\t");
                }
            }
        }
    }
}
