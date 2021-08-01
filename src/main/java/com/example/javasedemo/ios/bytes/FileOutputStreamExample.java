package com.example.javasedemo.ios.bytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Description  数据流向文件  --通过字节数组
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        //创建适配的路径
        File file=new File
                ("E:"+File.pathSeparator+"io_work"+File.pathSeparator+"text.txt");
        String content="this is the content";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //写之前判断文件是否存在
        if(!file.exists()){
            file.createNewFile();
        }
        byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
        System.out.println("写入完毕");
        if(fileOutputStream!=null){
            fileOutputStream.close();
        }
    }
}
