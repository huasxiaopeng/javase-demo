package com.example.javasedemo.mykong.io.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Description 文件是否存在
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileExistDemo {
    public static void main(String[] args) {
//    nioDemo();
    ioDemo();
    }
    public static void nioDemo(){
        Path path = Paths.get("javase-demo");
//        Path path = Paths.get("out.txt");
        if(Files.exists(path)){
             if(Files.isRegularFile(path)){
                 System.out.println("文件存在");
             }if (Files.isDirectory(path)){
                System.out.println("它是个目录");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    public static void ioDemo(){
        File file = new File("out.txt");
        if(file.exists()&&!file.isDirectory()){
            System.out.println("文件存在");
        }else {
            System.out.println("文件不存在");
        }
    }
}
