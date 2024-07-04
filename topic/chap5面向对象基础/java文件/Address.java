package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class Address {
     String address; //地址
     String zipCode; //邮编
    //无参构造方法
    public Address(){
    }
    //全参数构造方法
    public Address(String address,String zipCode){
        this.address = address;
        this.zipCode = zipCode;
    }
}
