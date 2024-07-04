package com.Work.dayHWork.week_2.weekdHW.p4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/1
 * @desc
 */
public class TestInterFace {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Bus bs = new Bus();
        Vehicle[] vArr = new Vehicle[2];
        vArr[0] = bk;
        vArr[1] = bs;
        for(Vehicle v : vArr){
            v.start("“詹姆斯”");
            v.stop("“布朗尼”");
        }

    }

}
