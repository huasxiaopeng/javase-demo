package com.example.javasedemo.mykong.io.files;

import java.io.IOException;
import java.nio.file.*;

/**
 * @Description 文件路径
 * @Author lktbz
 * @Date 2021/07/30
 */
public class GetFilePathDemo {
    public static void main(String[] args) {
        // full path
        Path path1 = Paths.get("/home/mkyong/test/file.txt");
        System.out.println("\n[Path] : " + path1);
         printPath(path1);


        //file name
        Path path = Paths.get("w.txt");
        System.out.println("\n[Path] : " + path);
        printPath(path);
        FileSystem fileSystem = path.getFileSystem();
        System.out.println(fileSystem);

    }

    static void printPath(Path path) {

        System.out.printf("%-25s : %s%n", "path", path);
        System.out.printf("%-25s : %s%n", "path.toAbsolutePath()",
                path.toAbsolutePath());
        System.out.printf("%-25s : %s%n", "path.getParent()", path.getParent());
        System.out.printf("%-25s : %s%n", "path.getRoot()", path.getRoot());

        try {

            if (Files.notExists(path)) {
                return;
            }

            // default, follow symbolic link
            System.out.printf("%-25s : %s%n", "path.toRealPath()",
                    path.toRealPath());
            // no follow symbolic link
            System.out.printf("%-25s : %s%n", "path.toRealPath(nofollow)",
                    path.toRealPath(LinkOption.NOFOLLOW_LINKS));

            // alternative to check isSymbolicLink
            /*if (Files.isSymbolicLink(path)) {
                Path link = Files.readSymbolicLink(path);
                System.out.println(link);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
