package com.Work.dayHWork.week_2.day14.ms;

import java.util.Arrays;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/31
 * @desc 输入:["1",“9”"X","Z”,“2”]输出:[“1",“2”,“9”“X”,“Z”]
 */
public class p4 {
    public static void main(String[] args) {
        String[] str = {"1","9","X","Z","2"};
        check(str);
    }
    //输入:["1",“9”"X","Z”,“2”]输出:[“1",“2”,“9”“X”,“Z”],数字升序放前，字母不动放后
    public static void check(String[] strArr){
        //先创建两个字符串
        StringBuilder sz = new StringBuilder();
        StringBuilder zm = new StringBuilder();
        //将字符串数组转为字符串
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0;i < strArr.length;i++){
            sb1.append(strArr[i]);
        }
        String str2 = sb1.toString();
        //字符串转为字符数组
        char[] charArray = str2.toCharArray();
        for (int i = 0;i < charArray.length;i++){
            //如果数字放在sz，字母放在zm字符串
            if (Character.isDigit(charArray[i]))
                sz.append(charArray[i]);
            else zm.append(charArray[i]);
        }
        String szBuffer = sz.toString();
        String[] sz1 = szBuffer.split("");
        //数字排序
        Arrays.sort(sz1);
        String zmBuffer = zm.toString();
        String[] zm1 = zmBuffer.split("");
        //创建一个新数组
        String[] newArr = new String[strArr.length];
        // 拷贝
        System.arraycopy(sz1,0,newArr,0,sz1.length);
        System.arraycopy(zm1,0,newArr,sz1.length,zm1.length);
        System.out.println(Arrays.toString(newArr));
    }
}
