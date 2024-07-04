package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class Address {
     private String address; //地址
     private String zipCode; //邮编
    //无参构造方法
    public Address(){
    }
    //全参数构造方法
    public Address(String address,String zipCode){
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
