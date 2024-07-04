package com.Work.chap11throwable.p3;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestThrow {
    public static void main(String[] args) {
        throwException(10);
    }
    public static void throwException(int n){
        if (n == 0){
            throw new NullPointerException();
        }else {
            throw new ClassCastException("类型转换出错");
        }
    }
}
