package com.example.javasedemo.ios.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description 数据从远处流向程序
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        File file=new File
                ("E:"+File.pathSeparator+"io_work"+File.pathSeparator+"text.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
         int content;
         while( (content=fileInputStream.read())!=-1){
             System.out.println((char)content);
         }
         if(fileInputStream!=null){
             fileInputStream.close();
         }
    }
}
