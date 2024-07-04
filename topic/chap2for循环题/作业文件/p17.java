package com.qf;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/16
 * @desc
 */
public class p17 {

    public static void main(String[] args) {
   /* 除二取余法是一种将十进制整数转换为二进制整数的方法。具体步骤如下：1

    使用2除以十进制整数，得到一个商和余数。
    将得到的商作为下一次除法的被除数，继续除以2，再次得到一个商和余数。
    重复上述步骤，直到商为0为止。
    将所有得到的余数逆序排列，得到的二进制数。
    例如，将十进制数9转换为二进制数的步骤如下：

    第一次除法：9 ÷ 2 = 4（商），余数为1。
    第二次除法：4 ÷ 2 = 2（商），余数为0。
    第三次除法：2 ÷ 2 = 1（商），余数为0。
    第四次除法：1 ÷ 2 = 0（商），余数为1。
    由于商为0，转换过程结束。将所有的余数逆序排列，得到的二进制数为1001。
    这种方法不仅适用于十进制转二进制，也适用于十进制转其他进制的转换，如将十六进制数转换为二进制数。
    在转换十六进制数时，每个十六进制数字对应4个二进制位，不足时在最左边补零。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int count = 0;
        String ejz = "";
        //循环到直到商为0为止
        while (n != 0) {
            //取余作为二进制数
            int k = n % 2;
            ejz += k;
            if (k == 1) {
                count++;
            }
            //取商作为下一次的被除数
            n /= 2;
        }
        System.out.println("有" + count + "个1");
        //建立一个StringBuffer,为了使用该类的反转方法reverse(),打印二进制数
        StringBuffer sb = new StringBuffer(ejz);
        System.out.println("对应的二进制数为：" + sb.reverse());
    }

}
