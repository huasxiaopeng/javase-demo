package com.example.javasedemo.ios.charet;

import java.io.*;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class CopyLines {
    public static void main(String[] args) {
        BufferedReader reader=null;
        PrintWriter writer=null;
        try {
            reader=new BufferedReader(new FileReader("w.txt"));
            writer=new PrintWriter(new FileWriter("out.txt"));
            String l;
            while((l=reader.readLine())!=null){
                writer.write(l);
            }
            writer.flush();
        }
         catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
