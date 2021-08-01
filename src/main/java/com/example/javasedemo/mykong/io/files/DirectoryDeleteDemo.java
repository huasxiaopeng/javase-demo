package com.example.javasedemo.mykong.io.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Description 目录的删除
 * @Author lktbz
 * @Date 2021/07/31
 */
public class DirectoryDeleteDemo {
    public static void main(String[] args) throws IOException {
        createDummyFiles();
//        deleteDirectoryJava8("e:/home/mkyong/test2/test3/test4/test5/");
        deleteDirectoryApache("e:/home/mkyong/test2/test3/test4");
    }

    /**
     * 创建待删除的目录
     * @throws IOException
     */
    public static void createDummyFiles() throws IOException {
        Files.createDirectories(Paths.get("e:/home/mkyong/test2/test3/test4/test5/"));
        Files.write(Paths.get("e:/home/mkyong/test2/test2.log"), "hello".getBytes());
        Files.write(Paths.get("e:/home/mkyong/test2/test3/test3.log"), "hello".getBytes());
    }
    public static void deleteDirectoryJava7(String filePath)
            throws IOException {

        Path path = Paths.get(filePath);

        Files.walkFileTree(path,
                new SimpleFileVisitor<>() {

                    // delete directories or folders
                    @Override
                    public FileVisitResult postVisitDirectory(Path dir,
                                                              IOException exc)
                            throws IOException {
                        Files.delete(dir);
                        System.out.printf("Directory is deleted : %s%n", dir);
                        return FileVisitResult.CONTINUE;
                    }

                    // delete files
                    @Override
                    public FileVisitResult visitFile(Path file,
                                                     BasicFileAttributes attrs)
                            throws IOException {
                        Files.delete(file);
                        System.out.printf("File is deleted : %s%n", file);
                        return FileVisitResult.CONTINUE;
                    }
                }
        );

    }
    public static void deleteDirectoryJava8(String dir) throws IOException {
        Path path = Paths.get(dir);
        Stream<Path> walk = Files.walk(path);
        walk.sorted(Comparator.reverseOrder())
                .forEach(DirectoryDeleteDemo::deleteDirectoryJava8Extract);
    }
    public static void deleteDirectoryJava8Extract(Path path) {
        try {
            Files.delete(path);
        } catch (IOException e) {
            System.err.printf("Unable to delete this path : %s%n%s", path, e);
        }
    }
    public static void deleteDirectoryApache(String dir) throws IOException {
        FileUtils.deleteDirectory(new File(dir));
    }
}
