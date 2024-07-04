package com.Work.chap11throwable.p13;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/3
 * @desc
 */
public class MySuper {
    public void m() throws IOException{}
}
class MySub extends MySuper{
    public void m() throws EOFException{}
}
class MySub2 extends MySub{

}
