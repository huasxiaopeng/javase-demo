package com.example.javasedemo.ios.charet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class FileWritterExample {
    public static void main(String[] args) throws IOException {
        File file=new File("w.txt");
        String content = "This is the text content";
      try(FileWriter fop=new FileWriter(file)) {
          if (!file.exists()) {
              file.createNewFile();
          }
          fop.write(content);
      }
    }
}
