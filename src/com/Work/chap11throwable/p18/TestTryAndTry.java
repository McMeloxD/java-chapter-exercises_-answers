package com.Work.chap11throwable.p18;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestTryAndTry {
    public static void main(String[] args) {
        System.out.println(ma());
    }
    public static int ma(){
        try{
            return 100;
        }finally{
            try{
                return 200;
            }finally{
                return 500;
            }
        }
    }
}
