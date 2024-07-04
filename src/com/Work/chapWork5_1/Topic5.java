package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求:
 * 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，
 * 她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？
 */
public class Topic5 {
    public static void main(String[] args) {
        int hc = 21 * 2 + 3;
        int lc = 24 * 2;
        if (hc == lc){
            System.out.println("红茶and绿茶现在的钱一样多~");
        }else {
            System.out.println("俩人的钱不一样多");
        }
    }
}
