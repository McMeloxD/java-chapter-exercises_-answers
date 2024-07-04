package com.Work.chap13io.p20;

import java.io.*;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/11
 * @desc
 */
public class TestFile20 {
    public static void main(String[] args) throws Exception {
        // 创建字符缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("worldcup.txt"));
        bw.write("2006/意大利");
        bw.newLine();
        bw.write("2002/巴西");
        bw.newLine();
        bw.write("1998/法国");
        bw.newLine();
        bw.write("1994/巴西");
        bw.newLine();
        bw.write("1990/德国");
        bw.newLine();
        bw.write("1986/阿根廷");
        bw.flush();
        //输入一个年份，输出该年份冠军，若没有输出没有举办
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        String year = sc.next();
        //创捷字符读入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("worldcup.txt"));
        //循环每一行判断
        String line;
        boolean hasChamption = false;
        while ((line = br.readLine()) != null) {
            // 如果该行内容不为空则判断有没有包含该年份内容
            if (line.contains(year)) {
                // 如果包含则输出球队名称
                System.out.println(year + "年的冠军队伍是：" + line.substring(5, 7));
                hasChamption = true;
            }
        }
        if (!hasChamption){
            System.out.println(year + "年没有举办世界杯哦~");
        }
        bw.close(); //这里写完要先关闭或flush存一下数据，不然不会保存写入的球队数据
        br.close();
    }
}
