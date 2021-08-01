package com.example.javasedemo.ios.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class CreateFileExample {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(CreateFileExample.class);

    public static void main(String[] args) {
//        createFile();
//        writeFile();
//        deleteFile();
        appendToExitingFile();
    }
    public static void createFile() {
        File file = new File("sample.txt");
        try {
            if (file.createNewFile()) {
                LOGGER.info("File is created !!");
            } else {
                LOGGER.info("File is already exist");
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    // Write file using BufferedWriter
    public static void writeFile() {
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("sample.txt"))) {
            String content = "This is the content to write into file\n";
            bw.write(content);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
    public static void deleteFile() {
        File file = new File("sample.txt");
        if (file.delete()) {
            LOGGER.info(file.getName() + "created !!");
        } else {
            LOGGER.info("Delete operation failed");
        }
    }
    public static void appendToExitingFile(){
        try (Writer writer = new FileWriter("sample.txt",true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            String content = "append something to existing file\n";
            bw.write(content);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
