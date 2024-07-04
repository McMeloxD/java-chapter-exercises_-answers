package com.Work.chap13io.p24;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/14
 * @desc
 */
public class TestWoker24 {
    public static void main(String[] args)  {
        //创建两个对象
        Worker wk1 = new Worker("文杰", 18, 3000);
        Worker wk2 = new Worker("兵兵", 20, 5000);
        // Worker wk3 = new Worker("闯闯", 22, 8500);
        File file = new File("woker.mc");
        outputAndInputTwoObject(wk1, wk2,file); //第二题
        // File file2 = new File("test.txt");
        // saveWorkerToFile(wk1,file2); //第三题
        // saveWorkerToFile(wk2,file2);
        // saveWorkerToFile(wk3,file2);
        // List<Worker> list = readWorkerFromFile(file2);
        // System.out.println(list);
    }

    /*利用 ObjectOutputStream 存入两个 Worker 对象，
    然后使用ObjectInputStream 读出这两个对象，并打印这两个对象的信息。*/
    public static void outputAndInputTwoObject(Worker wk1, Worker wk2,File file) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            // 创建对象输出流
            oos = new ObjectOutputStream(new FileOutputStream(file));
            // 写入对象
            System.out.println("对象写入成功~");
            oos.writeObject(wk1); //使用.writeObject(Object o)方法进行写入对象数据
            oos.writeObject(wk2);
            //创建对象输入流
            ois = new ObjectInputStream(new FileInputStream(file));
            //读取对象
            Worker wk3 = (Worker) ois.readObject();
            Worker wk4 = (Worker) ois.readObject();
            //打印
            System.out.println("对象读取成功~");
            System.out.println(wk3);
            System.out.println(wk4);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

  /*  写一个方法 saveWorkerToFile(Worker w, File file)，该方法完成下面的
    功能：
    假设有一个 Worker 对象 w1，File 对象 f1 如下：
    Worker w1 = new Worker(“Tom”, 30, 5000);
    File f1 = new File(“test.txt”);
    则调用 saveWorkerToFile(w1, f1)，会在 test.txt 中增加一行：
    Tom/30/5000*/

    public static void saveWorkerToFile(Worker w,File f){
        //创建字符缓冲输出流
        BufferedWriter bw = null;
        try {
            //追加数据，不覆盖 new FileWriter(f,true)
            bw = new BufferedWriter(new FileWriter(f,true));
            //写入信息
            String text = w.getName()+ '/' + w.getAge() + '/' + ((int)w.getSalary());
            bw.write(text);
            bw.newLine();
            System.out.println("工人" + w.getName() +  "写入" + f.getName() +"成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*写一个方法 List<Worker> readWorkerFromFile(File file)，该方法读某
    个文件，从文件信息中创建一个 Worker 类型的 List。
    例如，假设文件内容如下：
    Tom/30/5000
    Jim/25/3000
    Terry/33/4500
    则返回一个包含三个 Worker 对象的 List*/

    public static List<Worker> readWorkerFromFile(File f){
        //创建字符缓冲输出流
        BufferedReader br = null;
        //创建list集合
        List<Worker> workers = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(f));
            //读取信息
            String line;
            while ((line = br.readLine()) != null){
                //创建一个字符数组，以/符号拆分字符串
                String[] worker = line.split("/");
                //直接往集合里加，因为上个方法插入的是字符串，所以要转换数据类型
                workers.add(new Worker(worker[0],Integer.parseInt(worker[1]), Double.parseDouble(worker[2])));
            }
            return workers;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
