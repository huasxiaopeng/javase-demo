package com.example.javasedemo.mykong.io.files;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

/**
 * @Description 工作目录
 * @Author lktbz
 * @Date 2021/07/31
 */
public class CurrentWorkingDirectory {
    public static void main(String[] args) {
//        printCurrentWorkingDirectory1();
//        printCurrentWorkingDirectory2();
//        printCurrentWorkingDirectory3();
        printCurrentWorkingDirectory4();

    }
    // System Property
    private static void printCurrentWorkingDirectory1() {
        String property = System.getProperty("user.dir");
        System.out.printf(property);
    }
    // Path, Java 7
    private static void printCurrentWorkingDirectory2() {
        String s = Paths.get("").toAbsolutePath().toString();
        System.out.printf(s);
    }

    // File("")
    private static void printCurrentWorkingDirectory3() {
        String absolutePath = new File("").getAbsolutePath();
        System.out.printf(absolutePath);
    }
    // FileSystems
    private static void printCurrentWorkingDirectory4() {
        String string = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        System.out.printf(string);
    }
}
