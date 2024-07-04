package com.Work.chap11throwable.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestException {
    public static void main(String[] args) {
        try{
            System.out.println("“main1”");
            ma();
            System.out.println("“main2”");
        }catch(Exception e){
            System.out.println("“In Catch”");
        }
    }
    public static void ma(){
        System.out.println("“ma1”");
        throw new NullPointerException();

    }
}
