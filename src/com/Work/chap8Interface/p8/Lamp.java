package com.Work.chap8Interface.p8;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/28
 * @desc
 */
public class Lamp {
    private Light light;
    public void setLight(Light light){
        this.light = light;
    }
    public void on(){
        light.shine();
    }

    public static void main(String[] args) {
        Light[] ls = new Light[3];
        ls[0] = new RedLight();
        ls[1] = new YellowLight();
        ls[2] = new GreenLight();
        Lamp lamp = new Lamp();
        for (int i = 0; i<ls.length; i++){
            lamp.setLight(ls[i]);
            lamp.on();
        }
    }
}
