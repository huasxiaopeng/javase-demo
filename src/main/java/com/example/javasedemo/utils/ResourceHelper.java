package com.example.javasedemo.utils;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Description 路径加载器
 * @Author lktbz
 * @Date 2021/07/30
 */
public class ResourceHelper {

    public static String getAbsoluteFilePath(String filename) {
        URL resource = ClassLoader.getSystemClassLoader().getResource(filename);
        if (resource == null) {
            throw new IllegalArgumentException("File: " + filename + " not found.");
        }

        try {
            Path path = Paths.get(resource.toURI());
            return path.toString();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
