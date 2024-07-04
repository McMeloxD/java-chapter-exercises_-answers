package com.Work.chap11throwable.p10;

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
        int n;
        try {
            n = 10 / 0;
            System.out.println(123);
        }catch (Exception e){
            System.out.println("捕获到了异常:" + e.getMessage());
        }finally {
            return 0;
        }

    }
}

