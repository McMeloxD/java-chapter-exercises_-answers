package com.GO.test51;

/**
 * --- 天道酬勤 ---
 *
 * @author Liyuexian
 * @date 2024/5/4
 * @desc 需求:
 * 	身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
 * 	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
 * 	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
 * 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
 */
public class Topic1 {
    public static void main(String[] args) {
        CountHeight(177,165);
        System.out.println(2.0*(5/2));
    }

    public static void CountHeight(int fq,int mq){
        int boy = (int) ((fq + mq) * 1.08 / 2);
        int girl = (int) ((fq * 0.923 + mq)/ 2);
        System.out.println("父亲身高" + fq +"CM, " + "母亲身高" + mq + "CM, " + "儿子身高预计为：" + boy + "CM左右， " +
                "女儿身高预计为：" + girl + "CM左右");
    }
}
