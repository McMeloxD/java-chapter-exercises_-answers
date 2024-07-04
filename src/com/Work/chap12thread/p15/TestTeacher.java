package com.Work.chap12thread.p15;

/**
 * --- Be Humble and Hungry ---
 *
 * @author McMeloxD
 * @date 2024/6/14
 * @desc
 */
public class TestTeacher {
    public static void main(String[] args) {
        Student st1 = new Student("文杰",18);
        Student st2 = new Student("兵兵",19);
        Teacher teacher = new TeacherImpl();
        //student调用ask，传入Teacher实现类，执行teacher的answer方法，传入调用者对象，也就是学生
        st1.ask(teacher);
        st1.ask(teacher);
        st2.ask(teacher);
        st2.ask(teacher);
    }
}
