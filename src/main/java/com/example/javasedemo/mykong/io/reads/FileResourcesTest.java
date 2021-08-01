package com.example.javasedemo.mykong.io.reads;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/31
 */
public class FileResourcesTest {
    @Test
    public  void loadPropTest() throws IOException, URISyntaxException {
        String fileName = "database.properties";
        URL resource = getClass().getClassLoader().getResource(fileName);
        if(resource==null){
            throw new IllegalArgumentException("file not found! " + fileName);
        }
        File file=new File(resource.toURI());
        List<String> strings = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        strings.forEach(System.out::println);
    }
}
