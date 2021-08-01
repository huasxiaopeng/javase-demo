package com.example.javasedemo.ios.charet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("w.txt");
        BufferedWriter buffer=new BufferedWriter(fileWriter);
        buffer.write("java is very useful");
        buffer.flush();
        System.out.println("success");
    }
}
