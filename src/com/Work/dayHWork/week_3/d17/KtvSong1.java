package com.Work.dayHWork.week_3.d17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/4
 * @desc ArraryList集合方式
 */
public class KtvSong1 {
    public static void main(String[] args) {
        // 创建ArrarList集合
        ArrayList<String> songs = new ArrayList<>();
        songs.add(0, "奇迹再现");
        songs.add(1, "夜空中最亮的星");
        songs.add(2, "姐就是女王");
        songs.add(3, "甜蜜蜜");
        songs.add(4, "Whatya want from me");

        // 系统菜单
        System.out.println("-----------欢迎来到杰哥点歌系统-------------");
        System.out.println("0.添加歌曲至列表");
        System.out.println("1.将歌曲置顶");
        System.out.println("2.将歌曲前移一位");
        System.out.println("3.退出");
        System.out.println("初始歌曲列表：" + songs);

        // 菜单一直循环操作，除非退出
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要执行的操作序号：");
            int xh = sc.nextInt();

            switch (xh) {
                case 0:
                    System.out.print("请输入要添加的歌曲名称：");
                    String name = sc.next(); // next()此方法获得第一个扫描到的不含空格、换行符的单个字符串。
                    addSong(name, songs);
                    break;
                case 1:
                    System.out.print("请输入要置顶的歌曲名称：");
                    String name1 = sc.next();
                    topSong(name1,songs);
                    break;
                case 2:
                    System.out.print("请输入要前移的歌曲名称：");
                    String name2 = sc.next();
                    lastSong(name2,songs);
                    break;
                case 3:
                    System.out.print("系统已退出，期待您下次光临！");
                    // System.exit(n),为0是正常退出Jvm虚拟机
                    System.exit(0);
            }
        }
    }

    // 添加歌曲方法
    public static void addSong(String name, ArrayList<String> songs) {
        // 传入一个歌曲名和ArrayList对象，也就是名单
        if (songs.contains(name)) {
            System.out.println("歌曲已存在！请重试~");
            return;
        }
        songs.add(name);
        System.out.println("该首已添加！新的歌单为：" + songs);
    }

    // 置顶
    public static void topSong(String name, ArrayList<String> songs) {
        // 先判断要置顶的歌曲有没有
        if (!songs.contains(name)) {
            System.out.println("该歌曲不存在，请先添加再置顶！");
        }else {
            songs.remove(name); //先删除
            songs.add(0,name);//再添加
            System.out.println("该首已置顶，新的歌单为：" + songs);
        }
    }

    //将歌曲前移一位
    public static void lastSong(String name, ArrayList<String> songs){
        // 先判断要前移的歌曲有没有
        if (!songs.contains(name)) {
            System.out.println("该歌曲不存在，请先添加再移动！");
        }else {
            //indexOf（）	返回 arraylist 中元素的索引值
            int index = songs.indexOf(name); //记录一下歌曲的下标
            songs.remove(name); //先删除
            songs.add(index - 1,name);//再添加前一位
            System.out.println("该首已前移，新的歌单为：" + songs);
        }
    }

}
