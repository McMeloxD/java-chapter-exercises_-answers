package com.Work.dayHWork.week_2.weekdHW.Computer;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class TestComputer {
    public static void main(String[] args) {
        CPU cpu = new CPU(1399,"Ryzen 5",8,new AMDCPU());
        Disk disk = new Disk(599,"1T蓝盘",1024,new WestDigital());
        Computer computer = new Computer(cpu,disk);
        System.out.println(computer.description());
        computer.work();
    }
}
