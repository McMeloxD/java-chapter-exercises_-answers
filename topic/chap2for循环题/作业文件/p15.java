package com.qf;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/16
 * @desc
 */
public class p15 {
    /*15. **计算圆周率
        中 国 古 代 数 学 家 研 究 出 了 计 算 圆 周 率 最 简 单 的 办
        法:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......这个算式的结果会无
        限接近于圆周率的值,我国古代数学家祖冲之计算出,圆周率在3.1415926 和
    3.1415927 之间,请编程计算,要想得到这样的结果,他要经过多少次加减法运
        算?*/
    public static void main(String[] args) {
        //声明PI变量
        double pi = 0;
        //声明计数变量
        int count = 0;
        for (int i = 1; i > 0; i++) {
            //先将j转为double
            double j = 2 * i - 1;
            if (pi >= 3.1415926 && pi <= 3.1415927) {
                System.out.println("要计算" + count + "次");
                System.out.println("此时pi为：" + pi);
                break;
            }else {
                //在取余运算中，如果被除数小于除数，则商为0，余数就是它自己。 比如1 % 2 = 1, 2 % 5 = 1
                if (i % 2 != 0) {
                    pi += 4 /  j;
                    count += 1;
                } else {
                    pi -= 4 / j;
                    count += 1;
                }
            }

        }
    }

    /**以下是答案中的方法*/
    public static void CalcPi() {
        double pi = 0;
        int count = 0;
        int i = 1;


        while (!(3.1415927 > pi && pi > 3.1415926)) {
            if (i % 4 == 1) {
                pi += 4.0 / i;
            } else {
                pi -= 4.0 / i;
            }
            count++;

            i += 2;
        }

        System.out.println("需要经过\0" + count + "次加减法运算");
        System.out.println("pi=\0" + pi);
    }
}
