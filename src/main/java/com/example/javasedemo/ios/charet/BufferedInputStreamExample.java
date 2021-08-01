package com.example.javasedemo.ios.charet;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("sample.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int i;
        while ((i=bufferedInputStream.read())!=-1){
            System.out.print((char) i);
        }
    }
}
