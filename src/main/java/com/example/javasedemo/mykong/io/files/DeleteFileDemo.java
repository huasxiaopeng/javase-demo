package com.example.javasedemo.mykong.io.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
//        deleteFiles();
        deleteFilesJava6();
    }

    /**
     * 删除文件之前，首选判断是否存在文件，然后进行删除
     */
    public static void deleteFiles(){
        String fileName="app.log";
        try {
           boolean res= Files.deleteIfExists(Paths.get(fileName));
            if(res){
                System.out.println("文件被删除");
            }else {
                System.out.println("文件不存在");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteFilesJava6(){
        String fileName="app.log";
        File file = new File(fileName);
        if(file.delete()){
            System.out.println("文件删除成功");
        }else {
            System.out.println("文件删除失败");
        }
    }
}
