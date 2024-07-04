package com.Work.dayHWork.week_2.day10;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/24
 * @desc
 */
public class Baoshu3 {
    public static void main(String[] args) {
        String[] humans = new String[100];
        for (int i = 0; i < humans.length; i++) {
// 先初始化数值
            humans[i] = "alive";
        }
        int count = 0;// 记录离开的人数
        int i = 0, j = 1; // i表示humans数组下标，j记录报数
        while (count != humans.length - 1) {
// 只要离开人数不等于最后一个人的坐标就一直报数
            if (i == humans.length) {
// 如果一圈报完了就从第一个人重新开始
                i = 0;
            }
// 如果已经被淘汰就不能再玩
            if (humans[i].equals("out")) {
                i++;
                continue; // 继续执行后面的代码
            }
// 报数到3的就out
            if (j == 3) {
                j = 1; // 报的数重新开始,要和报数人i区分开
                humans[i] = "out";
                System.out.println("第" + (i+1) + "号人被淘汰了");
                i++;
                count++;
                continue;
            }
// 报数在1-2的人
            i++;
            j++;
        }
// 找出还在得人下标
        i = 0;
// 判断到值不是out的人
        while (humans[i].equals("out")) {
            i++;
        }
        System.out.println("最后剩余一个人是" + (i+1) + "号");
    }
}