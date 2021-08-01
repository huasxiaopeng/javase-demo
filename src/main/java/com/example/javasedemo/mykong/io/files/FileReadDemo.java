package com.example.javasedemo.mykong.io.files;

import com.example.javasedemo.utils.ResourceHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Description 文件读取demo
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "app.log";
//        readFileJava8(fileName);
//        readFileJava7(fileName);
        readFileJava8Buffer(fileName);
    }

    /**
     * 推荐方式
     * @param fileName
     * @throws IOException
     */
    private static void readFileJava8Buffer(String fileName) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
        String line;
        while ((line=reader.readLine())!=null){
            System.out.println(line);

        }
    }

    public static void readFileJava8(String fileName) throws IOException {
        Stream<String> lines = Files.lines(Paths.get(fileName));
        lines.forEach(System.out::println);
    }
    public static void readFileJava7(String fileName) throws IOException {

        // Java 7
        // max file size 2G
        // java.lang.OutOfMemoryError: Required array size too large
        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);

        // Java 8
        // java.lang.OutOfMemoryError: Java heap space
//        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//        lines.forEach(System.out::println);
    }
}
