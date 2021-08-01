package com.example.javasedemo.ios.bytes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Description 字节数组demo
 * @Author lktbz
 * @Date 2021/07/30
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f=new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        try {
            /**
             * 标准的写法
             */
            f.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes1 = f.toByteArray();
        for (byte b : bytes1) {
            System.out.println((char) b);
        }


    }
}
