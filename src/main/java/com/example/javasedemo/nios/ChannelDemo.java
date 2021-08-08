package com.example.javasedemo.nios;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.file.Path;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/8
 * @desc  nio 之 channel

 */
public class ChannelDemo {
    /**
     *
     *
       Channel channel
       顾名思义以：需要进行数据传输 建立的通道
       1：数据源是什么方式？
       2：怎么去建立通道
       3：通道怎么建立，与什么合适的时间去关闭通道

       1：FileChannel 文件通道
             文件建立通道的方式
                 FileInputStream.getChannel(),
                 FileOutputStream.getChannel(),
                 RandomAccessFile.getChannel()
       2：网络方式channel SocketChannel ServerSocketChannel(tcp 读取数据)
            DatagramChannel  从udp 读取数据
            建立通道方式：
             ServerSocket socket=new ServerSocket(6366);
             ServerSocketChannel channel = socket.getChannel();

             网络相关，将在后续的demo 上补充
     */

    public static void main(String[] args) throws IOException {
        /**
         * 官方demo FileChannel Demo
          */
        RandomAccessFile file=new RandomAccessFile("out.txt" ,"rw");
        FileChannel channel = file.getChannel();
        if(channel.isOpen()){
            ByteBuffer buffer=ByteBuffer.allocate(1024);
            int read = channel.read(buffer);
            while (read!=-1){
                System.out.println("read = "+read);
                buffer.flip();
                while (buffer.hasRemaining()){
                    System.out.print((char)buffer.get());
                }
                buffer.clear();
                read=channel.read(buffer);
            }
        }

    }

}
