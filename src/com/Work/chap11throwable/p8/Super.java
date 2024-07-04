package com.Work.chap11throwable.p8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class Super {
    public void ma() throws IOException{};
}
interface IA{
    void mb();
}
class MySub extends Super implements IA{
    public void ma() {

    }
    @Override
    public void mb() {

    }
}
