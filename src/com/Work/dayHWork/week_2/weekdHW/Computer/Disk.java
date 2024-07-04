package com.Work.dayHWork.week_2.weekdHW.Computer;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class Disk extends Component implements Workable {
    private int volume;// 容量
    private Seagate sg;
    private WestDigital wd;

    public Disk() {
    }

    public Disk(double price, String name, int volume, Seagate sg) {
        super(price, name);
        this.volume = volume;
        this.sg = sg;
    }

    public Disk(double price, String name, int volume, WestDigital wd) {
        super(price, name);
        this.volume = volume;
        this.wd = wd;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String description() {
        return "硬盘名称：" +
                super.getName() + ",价格："
                + super.getPrice() + "RMB,容量："
                + volume + "GB";
    }


    @Override
    public void work() {
        if (null != sg) {
            sg.work();
            return;
        }
        wd.work();
    }
}
