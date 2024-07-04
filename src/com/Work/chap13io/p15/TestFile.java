package com.Work.chap13io.p15;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/11
 * @desc
 */
public class TestFile {
    public static void main(String[] args) throws Exception {
        //先用字节流+桥转换读入文件
        FileInputStream fis = new FileInputStream("D:\\千峰java\\test.txt");
        //以UTF-8方式读取
        InputStreamReader inputStreamReader = new InputStreamReader(fis,"GB18030");
        //要以行为单位读取
        BufferedReader bf = new BufferedReader(inputStreamReader);
        //写入流
        FileOutputStream fos = new FileOutputStream("D:\\千峰java\\test2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line;
        while ((line = bf.readLine()) != null){
            System.out.println(line);
            outputStreamWriter.write(line + "\n");
        }
        bf.close();
        outputStreamWriter.close();
    }
}
