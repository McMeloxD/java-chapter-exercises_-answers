package com.Work.dayHWork.week_2.weekdHW.Computer;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class Computer extends Component implements Workable {
    private CPU cpu;
    private Disk disk;

    public Computer(){}
    public Computer(CPU cpu, Disk disk) {
        this.cpu = cpu;
        this.disk = disk;
    }

    @Override
    public String description() {
        return "此台电脑配置为：\n" + cpu.description() + "\n" + disk.description() +
                "\n该配置总价为：" + (cpu.getPrice() + disk.getPrice()) + "RMB\n";
    }

    @Override
    public void work() {
        System.out.println("******电脑启动！******\n");
        System.out.println("******正在尝试加载硬件！******");
        cpu.work();
        disk.work();
        System.out.println("******开机成功！******");
    }
}
