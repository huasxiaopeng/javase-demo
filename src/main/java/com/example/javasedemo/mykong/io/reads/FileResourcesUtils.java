package com.example.javasedemo.mykong.io.reads;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * @Description 资源读取demo
 * @Author lktbz
 * @Date 2021/07/31
 */
public class FileResourcesUtils {
    public static void main(String[] args) throws IOException {
        FileResourcesUtils fileResourcesUtils=new FileResourcesUtils();
        String fileName="json/file1.json";
        System.out.printf("使用getResourceAsStream 获取文件内容："+fileName);
        InputStream inputStream = fileResourcesUtils.getFileFromResourceAsStream(fileName);
        printInputStream(inputStream);
    }

    private static void printInputStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        String line;
        while((line=bufferedReader.readLine())!=null){
            System.out.println("读取的内容为："+line);
        }
    }

    private InputStream getFileFromResourceAsStream(String fileName) {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(fileName);
        if(resourceAsStream==null){
          throw  new IllegalArgumentException("file not found "+fileName);
        }else {
            return resourceAsStream;
        }

    }

    /**
     * 这个方式不能获取jar 中的元素
     * @param fileName
     * @return
     * @throws URISyntaxException
     */
    private File getFileFromResource(String fileName) throws URISyntaxException {

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {

            // failed if files have whitespaces or special characters
            //return new File(resource.getFile());

            return new File(resource.toURI());
        }

    }
    // print a file
    private static void printFile(File file) {

        List<String> lines;
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
