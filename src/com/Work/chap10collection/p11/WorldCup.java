package com.Work.chap10collection.p11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
            System.out.println("*******输入2 呼叫人工服务~*********");
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
                    System.out.println("人工服务已停工，请充值工资赞助~\n");
                    break;
                case 3:
                    System.out.println("退出成功~ \n");
                    System.exit(0);
            }

        }
    }

    public static boolean haveCp(String y,Map map){
        //看是否有该对象
        return null != map.get(y);
    }
}
