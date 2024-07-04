package com.Work.chap10collection.p18;

import java.util.*;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/5
 * @desc
 */
public class WorldCup {
    public static void main(String[] args) {
        // 创建map集合
        Map<String, String> chamption = new HashMap<>();
        chamption.put("1930", "乌拉圭");
        chamption.put("1934", "意大利");
        chamption.put("1938", "意大利");
        chamption.put("1950", "乌拉圭");
        chamption.put("1954", "德国");
        chamption.put("1958", "巴西");
        chamption.put("1962", "巴西");
        chamption.put("1966", "英格兰");
        chamption.put("1970", "巴西");
        chamption.put("1974", "德国");
        chamption.put("1978", "阿根廷");
        chamption.put("1982", "意大利");
        chamption.put("1986", "阿根廷");
        chamption.put("1990", "德国");
        chamption.put("1994", "巴西");
        chamption.put("1998", "法国");
        chamption.put("2002", "巴西");
        chamption.put("2006", "意大利");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("*******欢迎来到足球百科！*********");
            System.out.println("*******输入1 查询历届世界杯冠军国家~*********");
            System.out.println("*******输入2 查询球队冠军年份~*********");
            System.out.println("*******输入3 退出百科~~*********");
            System.out.println("请输入您需要的服务编号：");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("请输入查询年份：");
                    String year = sc.next();
                    if (haveCp(year,chamption)){
                        String name = chamption.get(year);
                        System.out.println(year + "年获得世界杯冠军的国家是：" + name +"\n");;
                    }else System.out.println(year + "年没有举办世界杯呢！\n");
                    break;
                case 2:
                    System.out.print("请输入国家队名称：");
                    String name2 = sc.next();
                    chapNum(name2,chamption);
                    break;
                case 3:
                    System.out.println("退出成功~ \n");
                    System.exit(0);
            }

        }
    }

    //查看年份是否有世界杯比赛
    public static boolean haveCp(String y,Map map){

        return null != map.get(y);
    }

    //查看国家是否赢得过冠军，若有输出分别获得哪一年的冠军
    public static void chapNum(String n,Map map){
        if (! map.containsValue(n)){
            System.out.println(n + "没有赢得过世界杯冠军呢~");
        }else {
            //将key值集合转为set类型集合，再转为Object数组进行排序
            Set set = map.keySet();
            Object[] arr = set.toArray();
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++){
                if (map.get(arr[i]).equals(n))
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
