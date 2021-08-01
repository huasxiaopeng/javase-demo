package com.example.javasedemo.java8.methodsReference;

/**
 * @Description 构造函数
 * @Author lktbz
 * @Date 2021/08/01
 */
public class ReferenceToConstructor {
    public static void main(String[] args) {
       Messageble messageble= Message::new;
        messageble.getMessage("hello");
    }

}
interface  Messageble{
    Message getMessage(String name);
}
class Message{
    Message(String msg){
        System.out.println(msg);
    }
}