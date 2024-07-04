package com.Work.chap10collection.p24;


import java.util.ArrayList;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class FBallTeam {
    public static void main(String[] args) {
        List<String> allTeam = new ArrayList();
        allTeam.add("科特迪瓦");
        allTeam.add("阿根廷");
        allTeam.add("澳大利亚");
        allTeam.add("塞尔维亚");
        allTeam.add("荷兰");
        allTeam.add("尼日利亚");
        allTeam.add("日本");
        allTeam.add("美国");
        allTeam.add("中国");
        allTeam.add("新西兰");
        allTeam.add("巴西");
        allTeam.add("比利时");
        allTeam.add("韩国");
        allTeam.add("喀麦隆");
        allTeam.add("洪都拉斯");
        allTeam.add("意大利");
        System.out.println(allTeam);

        //创建四个小组
        List<String> team1 = new ArrayList<>();
        List<String> team2 = new ArrayList<>();
        List<String> team3 = new ArrayList<>();
        List<String> team4 = new ArrayList<>();

        int count = 0;
        //team1组队
        while (count < 4){
            String name = allTeam.get((int)(Math.random()*16));
            if (!team1.contains(name)){
                team1.add(name);
                count++;
            }
        }
        //team2组队
        count = 0;
        while (count < 4){
            String name = allTeam.get((int)(Math.random()*16));
            if (!team1.contains(name) && !team2.contains(name)){
                team2.add(name);
                count++;
            }
        }
        //team3组队
        count = 0;
        while (count < 4){
            String name = allTeam.get((int)(Math.random()*16));
            if (!team1.contains(name) && !team2.contains(name) && !team3.contains(name)){
                team3.add(name);
                count++;
            }
        }
        //team4组队
        count = 0;
        while (count < 4){
            String name = allTeam.get((int)(Math.random()*16));
            if (!team1.contains(name) && !team2.contains(name) && !team3.contains(name) && !team4.contains(name)){
                team4.add(name);
                count++;
            }
        }
        System.out.println("队伍1--->" + team1);
        System.out.println("队伍2--->" + team2);
        System.out.println("队伍3--->" + team3);
        System.out.println("队伍4--->" + team4);
    }
}
