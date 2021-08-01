package com.example.javasedemo.ios.charet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("out.txt");
        BufferedReader reader=new BufferedReader(fileReader);
        String line;
        while ((line=reader.readLine())!=null){
            System.out.print("读取到的内容为："+line);
        }
    }
}
