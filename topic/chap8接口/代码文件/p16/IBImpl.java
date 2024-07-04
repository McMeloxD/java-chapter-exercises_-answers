package com.Work.chap8Interface.p16;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class IBImpl implements IB{
    private IA ia;
    public void setIa(IA ia){
        this.ia = ia;
    }
    @Override
    public void mb() {
        System.out.println("mb in IBImpl");
    }
    public void method(){
        ia.ma(this);
    }
}
