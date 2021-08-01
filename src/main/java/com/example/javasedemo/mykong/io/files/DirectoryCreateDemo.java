package com.example.javasedemo.mykong.io.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Description 目录创建
 * @Author lktbz
 * @Date 2021/07/31
 */
public class DirectoryCreateDemo {
    public static void main(String[] args) {
//    nioCreateDirectories();
    ioCreateDirectories();
    }
    public static void nioCreateDirectories(){
        String dir = "e:/home/mkyong/test2/test3/test4/";
        Path path = Paths.get(dir);
        try {
            Files.createDirectories(path);
            System.out.printf("目录创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ioCreateDirectories(){
        String dir = "e:/home/mkyong/test2/test3/test4/";
         File file=new File(dir);
         if(file.mkdir()){
             System.out.printf("目录正在创建");
         }else {
             System.out.printf("创建失败");
         }
    }
}
