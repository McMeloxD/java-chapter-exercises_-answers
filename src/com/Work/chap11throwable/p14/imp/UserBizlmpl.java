package com.Work.chap11throwable.p14.imp;

import com.Work.chap11throwable.p14.UException.LoginException;
import com.Work.chap11throwable.p14.UException.RegisterException;
import com.Work.chap11throwable.p14.inface.UserBiz;
import com.Work.chap11throwable.p14.pojo.User;

import java.util.HashMap;
import java.util.Map;


/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class UserBizlmpl implements UserBiz {
    // 保存用户信息，键为登录名，值为对应的User对象。
    Map<String, User> userMap = new HashMap<>();

    // 初始存储的用户信息
    {
        userMap.put("admin", new User("admin", "admin", "Administrator", "admin@123.com"));
        userMap.put("Tom", new User("Tom", "cat", "tomcat", "tomcat@cat.com"));
    }

    @Override
    public void register(String username, String password, String password2, String name, String email) throws RegisterException {
        // 可以使用 contains() 方法来判断元素是否存在于集合当中:
        if (userMap.containsKey(username))
            // 如果用户名在Map中已存在
            throw new RegisterException("抱歉亲亲！用户名：" + username + "已经创建过账户了哦~");
        // 如果两次输入密码不一致
        if (!password.equals(password2))
            throw new RegisterException("您两次输入的密码不同，请重试~");
        // 注册成功，存入Map
        userMap.put(username, new User(username, password, name, email));
        System.out.println(username + "恭喜你，注册成功！");
    }


    @Override
    public void login(String username, String password) throws LoginException {
        // 可以使用 contains() 方法来判断元素是否存在于集合当中:
        if (!userMap.containsKey(username))
            // 如果用户名在Map中不存在
            throw new LoginException("抱歉亲亲！未找到用户名：" + username + "，请注册！");
        // 如果账号密码不匹配 Map.get()获取指定 key 对应对 value,要注意这个get后获得的是User对象，想要密码还得调用getpassword
        if (!password.equals(userMap.get(username).getPassword()))
            throw new LoginException("密码错误，请重试!");
        // 登录成功
        System.out.println("登录成功!"+ username + "欢迎回家~");
    }
}

