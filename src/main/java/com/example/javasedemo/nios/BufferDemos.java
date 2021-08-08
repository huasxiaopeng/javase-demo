package com.example.javasedemo.nios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc  nio  缓冲区
 */
public class BufferDemos {
    /**
     *     Buffer buffer 类中属性以及方法理解
     *      private int mark = -1;   设置缓冲区标记
     *     private int position = 0; 下一个可插入元素的位置
     *     private int limit;      限制读写的位置
     *     private int capacity;   缓冲区容量
     *
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile=new RandomAccessFile("emp.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        /**
         * 开辟缓冲区
         */
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        /**
         * 缓冲区写数据
         */
      int read = channel.read(buffer);

        while(read!=-1){
            //读写模式切换
            buffer.flip();
            /**
             * 是否可以度数据
             */
            while (buffer.hasRemaining()){
                /**
                 * 读数据
                 */
                System.out.print((char) buffer.get()); // read 1 byte at a time
            }
            //方法会清空整个缓冲区
            buffer.clear();
           read= channel.read(buffer);
        }
        channel.close();
    }
}
