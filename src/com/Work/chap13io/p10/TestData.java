package com.Work.chap13io.p10;

import java.io.*;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/11
 * @desc
 */
public class TestData {
    public static void main(String[] args) {
        File file = new File("D:\\千峰java\\test2.dat");
        try {
            // 如果不存在，创建且写入long 类型的数值：10000L
            if (!file.exists()) {
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dps = new DataOutputStream(fos);
                Long l = 10000L;
                dps.writeLong(l);
                dps.close();
            } else {
                //如果该文件存在，则从该文件中读出数值，并把该数值加 1 之后，再存回文件中。
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
                Long l = dis.readLong();
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dps = new DataOutputStream(fos);
                dps.writeLong(l+1);
                dis.close();
                dps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
