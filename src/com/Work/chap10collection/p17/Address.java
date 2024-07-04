package com.Work.chap10collection.p17;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class Address {
    private String addressName;
    private String zipCode;

    public Address(){}
    public Address(String addressName, String zipCode) {
        this.addressName = addressName;
        this.zipCode = zipCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
