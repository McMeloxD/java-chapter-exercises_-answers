package com.Work.chap11throwable.p11;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println(ma());
    }
    public static int ma(){
        int b = 0;
        try {
            int n = 100;
            return n/b;
        }catch (Exception e){
            return 10;
        }finally {
            return 100;
        }

    }
}

