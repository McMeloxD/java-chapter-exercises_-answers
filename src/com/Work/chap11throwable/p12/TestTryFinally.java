package com.Work.chap11throwable.p12;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestTryFinally {
    public static void main(String[] args) {
        try{
            ma();
        }catch (Exception e){
        }
    }
    public static void ma() throws Exception {
        int n = 10;
        int b = 0;
//读入一个整数 b
        try{
            System.out.println("“ma1”");
            int result = n / b;
            System.out.println("“ma2 ”" + result);
        }finally{
            System.out.println("“In Finally”");
        }
    }
}
