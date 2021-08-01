package com.example.javasedemo.java8.date;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Description java 8 之前的日期格式化
 * @Author lktbz
 * @Date 2021/07/31
 */
public class javaBeforeDateJava8Dmeo {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("今天是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        String format = dateFormat.format(date);
        System.out.println("格式化后的时间为："+format);
        System.out.println("没有格式化时间："+date);
        System.out.println("时间 long 类型："+date.getTime());
        long time = date.getTime();
        Date date1=new Date(time);
        System.out.println("long 类型时间转换成string: "+date1.toString());
    }
}
