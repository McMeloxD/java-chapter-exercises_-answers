package com.Work.chap13io.p23;

import java.io.*;
import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/12
 * @desc
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入文件名:");
        String lj = sc.next();
        // 创建一个File对象
        File file = new File(lj);
        // 判断文件是否存在
        if (file.exists()) {
            // 如果存在则在源文件相同路径下创建一个叫copy_源文件名的新文件
            // 源文件路径+文件名
            StringBuilder jlj= new StringBuilder(file.getAbsolutePath());
            //直接调用StringBuilder的insert方法，在原文件名前插入copy_，然后直接创建新文件
            File file2 = new File(jlj.insert(jlj.length()-(file.getName().length()),"copy_").toString());
            System.out.println("新文件是否创建成功：" + file2.createNewFile());
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file2);
            BufferedReader br = null;
            BufferedWriter bw = null;
            try {
                br = new BufferedReader(fr);
                bw = new BufferedWriter(fw);
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println(file2.getAbsolutePath() + "创建且拷贝成功！");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                br.close();
                bw.close();
            }
        }
    }
}
