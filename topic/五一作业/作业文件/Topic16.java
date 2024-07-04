package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
 * 	假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 	请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class Topic16 {
    public static void main(String[] args) {
        Double paper = 0.1;
        int count = 0;
        while (paper <= 8844430){
            paper *= 2;
            System.out.println(paper);
            count += 1;
        }
        System.out.println("大概折叠" + count + "次，可以折成珠穆朗玛峰的高度");
    }
}
