package com.Work.chap13io.p22;

import java.io.*;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class Account {
    private Long id;
    private double balance;
    private String password;

    public Account() {
        File file = new File("account.txt");
        if (!file.exists()) {
            //如果文件不存在就创建并且创建第一个值
            DataOutputStream dos = null;
            try {
                dos = new DataOutputStream(new FileOutputStream(file));
                dos.writeLong(100001L);
                this.id = 100001L;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    dos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }else {
            //如果存在就读取并且先+1再赋值
            DataInputStream dis = null;
            DataOutputStream dos = null;
            try {
                dis = new DataInputStream(new FileInputStream(file));
                Long l = dis.readLong()+1;
                this.id = l;
                dos = new DataOutputStream(new FileOutputStream(file));
                dos.writeLong(l);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    dis.close();
                    dos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return "余额:" + balance;
    }
}
