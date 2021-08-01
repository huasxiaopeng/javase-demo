package com.example.javasedemo.mykong.io.reads;

import org.springframework.util.StringUtils;

/**
 * @Description 文件扩展名demo
 * @Author lktbz
 * @Date 2021/07/31
 */
public class GetFileExtensionDemo {
    public static void main(String[] args) {
        String[] files = {
                "/path/foo.txt",
                ".",
                "..",
                "/path/run.exe",
                "/path/makefile",
                "/path/.htaccess",
                "/path/.tar.gz",
                "/path/../makefile",
                "/path/dir.test/makefile"
        };
        for (String file : files) {
            if(StringUtils.isEmpty(file)){
                throw new IllegalArgumentException("参数异常");
            }
            String extension="";
            int i = file.lastIndexOf(".");
            if(i>0){
                extension=file.substring(i+1);
            }
            System.out.println("后缀为："+extension);
        }
    }
}
