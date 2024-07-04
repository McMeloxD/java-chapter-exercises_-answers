package com.Work.dayHWork.week_2.weekdHW.Computer;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class CPU extends Component implements Workable{
    private int coreNum; //核心数
    private IntelCPU ic;
    private AMDCPU ac;
    //构造
    public CPU() {}
    public CPU(double price, String name, int coreNum,IntelCPU ic) {
        super(price, name);
        this.coreNum = coreNum;
        this.ic = ic;
    }
    public CPU(double price, String name, int coreNum,AMDCPU ac) {
        super(price, name);
        this.coreNum = coreNum;
        this.ac = ac;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    @Override
    public String description() {
        return "CPU名称：" +
                super.getName() + ",价格："
                + super.getPrice() + "RMB,核心数："
                + coreNum;
    }


    @Override
    public void work() {
        if (null != ic) {
            ic.work();
            return;
        }
        ac.work();
    }
}
