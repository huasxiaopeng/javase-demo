package com.example.javasedemo.mykong.io.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Description  文件写入方式
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileWriteDemo {
    private static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        Path path= Paths.get("out.txt");

//        writeFile(path,"Hello world 3"+NEW_LINE);
//        java8Writer(path,"Hello world 4"+NEW_LINE);
        java8WriterAppend(path,"中文测试 4"+NEW_LINE);
        /**
         * 继续调用发现会覆盖数据
         */
//        writeFile(path,"Hello world 2"+NEW_LINE);
    }

    private static void writeFile(Path path, String content)
            throws IOException {
        /**
         * java 7 写入
         */
//        Files.write(path,content.getBytes(StandardCharsets.UTF_8));
        /**
         * 文件不存创建，并且是追加数据
          */
        Files.write(path,content.getBytes(StandardCharsets.UTF_8),
                   StandardOpenOption.CREATE,StandardOpenOption.APPEND);

    }
    private static void java8Writer(Path path,String content){
        BufferedWriter writer;
        try {
            writer= Files.newBufferedWriter(path);
            writer.write(content);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 追加操作  默认支持中文
     * @param path
     * @param content
     */
    private static void java8WriterAppend(Path path,String content){
        BufferedWriter writer;
        try {
            writer= Files.newBufferedWriter(path,StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
            writer.write(content);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * java7 之前的写法
     */
    private static void oldWriteExample(){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = "Hello";

            fw = new FileWriter("app.log", true);
            bw = new BufferedWriter(fw);
            bw.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }    }

}
