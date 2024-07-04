package com.OftenUseUtil;

import java.io.File;
import java.io.IOException;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/6/6
 * @desc
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        File file2 = new File("b.txt");
        file2.delete();
    }
}
