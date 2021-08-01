package com.example.javasedemo.java8.methodsReference;

/**
 * @Description 静态方法引用
 * @Author lktbz
 * @Date 2021/08/01
 */
public class ReferenceToStaticMethod {
    public static void main(String[] args) {
        //使用lambda
       new Thread(()->System.out.println("thread use lambda")).start();

       //使用静态方法：
        new Thread(ReferenceToStaticMethod::ThreadStatus).start();
    }
    public static void ThreadStatus(){
        System.out.println("thread is running");
    }
}
