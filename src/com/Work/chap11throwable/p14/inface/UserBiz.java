package com.Work.chap11throwable.p14.inface;

import com.Work.chap11throwable.p14.UException.LoginException;
import com.Work.chap11throwable.p14.UException.RegisterException;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public interface UserBiz {

    //用户注册
    void register(String username, String password, String password2, String name, String email)throws RegisterException;

    //用户登录
    void login(String username, String password)throws LoginException;
}
