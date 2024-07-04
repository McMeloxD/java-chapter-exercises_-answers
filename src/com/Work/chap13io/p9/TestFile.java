package com.Work.chap13io.p9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/11
 * @desc
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("D:\\千峰java\\test9.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            if (!file.exists()){
                fos = new FileOutputStream(file);
                byte[] bytes = ("Hello World").getBytes();
                //输出写入Hello World
                fos.write(bytes);
            }else {
                //如果已存在则在原有内容后追加
                // 创建字节输出流
                // 1)目的地文件不存在,会自动创建
                // 2)运行一次写出数据,默认是将之前文件的内容覆盖
                // 3)想要每次写出数据时追加在文件后面,构造方法中设置true
                fos = new FileOutputStream(file,true);
                byte[] bytes2 = (" append").getBytes();
                fos.write(bytes2);
            }
            fis = new FileInputStream(file);
            //读入文件，打印
            //创建一个字节数组存取字节
            byte[] bytes3 = new byte[(int)file.length()];
            fis.read(bytes3);
            //将字节数组转字符串
            String str = new String(bytes3);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
