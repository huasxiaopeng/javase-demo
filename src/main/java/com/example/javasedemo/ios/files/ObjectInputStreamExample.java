package com.example.javasedemo.ios.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("emp.txt"));
        final Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
