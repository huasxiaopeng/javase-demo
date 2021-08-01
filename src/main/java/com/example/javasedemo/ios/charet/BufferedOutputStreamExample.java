package com.example.javasedemo.ios.charet;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");

        String content = "This is the text content";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        if(!file.exists()){
            file.createNewFile();
        }
        bufferedOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.flush();


    }
}
