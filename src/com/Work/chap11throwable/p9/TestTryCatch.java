package com.Work.chap11throwable.p9;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class TestTryCatch {
    public static void main(String[] args) {
        try {
            ma(10);
            System.out.println("“No Exception”");
        } catch (EOFException ex1) {
            System.out.println("“ex1”");
        } catch (IOException ex2) {
            System.out.println("“ex2”");
        } catch (SQLException ex3) {
            System.out.println("“ex3”");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ma(int n) throws Exception {
        if (n == 1) {
            throw new IOException();
        } else if (n == 2) {
            throw new EOFException();
        } else if (n == 3) {
            throw new SQLException();
        }
    }
}
