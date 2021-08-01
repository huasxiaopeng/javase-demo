package com.example.javasedemo.mykong.io.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Description 文件拷贝
 * @Author lktbz
 * @Date 2021/07/30
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String fromFile = "from.txt";
        String toFile = "to.txt";
            copyFileNIO(fromFile,toFile);
    }

    /**
     * java 7 提供的方法进行拷贝
     *
     * @param from
     * @param to
     * @throws IOException
     */
    public static void copyFileNIO(String from, String to) throws IOException {
        Path fromFile = Paths.get(from);
        Path toFile = Paths.get(to);
        if(Files.notExists(fromFile)){
            System.out.println("不存在所在的文件");
            return;
        }
        Files.copy(fromFile,toFile);

    }
    public static void copyFileApache(String from, String to) throws IOException {
       File froms=new File(from);
       File tos=new File(to);
        FileUtils.copyFile(froms,tos);
    }
}
