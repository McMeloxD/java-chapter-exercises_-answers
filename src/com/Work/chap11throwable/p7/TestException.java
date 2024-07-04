package com.Work.chap11throwable.p7;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestException {
    public static void main(String args[]) {
        ma();
    }

    public static int ma(){
        try {
            m();
            return 100;
        } catch (MyException e) {
            System.out.println("MyException");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        return 0;
    }

    public static void m() throws MyException{
        throw new MyException();
    }
}

class MyException extends Exception {
}
