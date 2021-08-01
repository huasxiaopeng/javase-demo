package com.example.javasedemo.ios.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        final Employee employee = new Employee();
        employee.setId(100);
        employee.setName("ramesh");
        FileOutputStream fileOutputStream = new FileOutputStream("emp.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        System.out.println("success");
        if(objectOutputStream!=null){
            objectOutputStream.close();
        }
        if(fileOutputStream!=null){
            fileOutputStream.close();
        }
    }
}
