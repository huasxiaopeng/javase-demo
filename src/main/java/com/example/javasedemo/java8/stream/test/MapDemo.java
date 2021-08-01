package com.example.javasedemo.java8.stream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 将一种类型，转换成你所希望的类型
 * @Author lktbz
 * @Date 2021/08/01
 */
public class MapDemo {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        //需求：小写变大写
        //平时写法
        List<String>java7=new ArrayList<>();
        for (String s : alpha) {
            java7.add(s.toUpperCase());
        }
        System.out.println(java7);
        alpha.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        num.stream()
                .map(n->n*2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
