package com.Work.chap8Interface.p12;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc 歌手
 */

public class Singer implements Performer{
    @Override
    public void perform() {
        System.out.println("Adam Lambert为您表演了一首《Whatya want for me》");
    }
}
