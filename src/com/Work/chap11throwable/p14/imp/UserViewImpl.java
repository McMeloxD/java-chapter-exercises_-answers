package com.Work.chap11throwable.p14.imp;

import com.Work.chap11throwable.p14.UException.LoginException;
import com.Work.chap11throwable.p14.UException.RegisterException;
import com.Work.chap11throwable.p14.inface.UserBiz;
import com.Work.chap11throwable.p14.inface.UserView;

import java.util.Scanner;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class UserViewImpl implements UserView {
    UserBiz ub = new UserBizlmpl();
    Scanner scanner = new Scanner(System.in);

    //登录，输入用户名密码
    @Override
    public void login() {
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        try {
            //调用UserBiz接口登录方法
            ub.login(username,password);
        }catch (LoginException le){
            le.printStackTrace();
        }
    }

    @Override
    public void register() {
        System.out.println("请输入用户名：");
        String username2 = scanner.nextLine();
        System.out.println("请输入密码：");
        String password2 = scanner.nextLine();
        System.out.println("请再次输入密码：");
        String password3 = scanner.nextLine();
        System.out.println("请输入真实姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入邮箱：");
        String email = scanner.nextLine();
        try{
            ub.register(username2,password2,password3,name,email);
        }catch (RegisterException re){
            re.printStackTrace();
        }
    }
}
