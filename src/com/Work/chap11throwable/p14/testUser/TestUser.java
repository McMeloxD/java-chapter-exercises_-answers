package com.Work.chap11throwable.p14.testUser;

import com.Work.chap11throwable.p14.imp.UserViewImpl;
import com.Work.chap11throwable.p14.inface.UserView;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestUser {
    public static void main(String[] args) {
        UserView uw = new UserViewImpl();
        // uw.register();
        uw.login();
    }
}
