package com.Work.chap12thread.p15;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/14
 * @desc
 */
public class TeacherImpl implements Teacher{

    @Override
    public void answer(Student stu) {
        new Thread(()-> {
            Thread thread = Thread.currentThread();
            thread.setName("邱哥" + (int)(Math.random() * 5));
            System.out.println(thread.getName() + "对" + stu.getName() +
                    "说：多读书，多看报，少吃零食多睡觉！");
            stu.study();
            stu.doHomeWork();
        }).start();
    }
}
