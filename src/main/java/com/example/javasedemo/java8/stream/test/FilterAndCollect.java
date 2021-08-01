package com.example.javasedemo.java8.stream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 过滤
 * @Author lktbz
 * @Date 2021/08/01
 */
public class FilterAndCollect {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "lktbz");
        List<String> lktbz = getFilterOutputBeforeJava8(lines, "lktbz");
        lktbz.forEach(System.out::println);
        System.out.println("美丽的分割线");
        //java 8 写法
        getFilterOutputJava8(lines);


    }

    private static List<String> getFilterOutputBeforeJava8(List<String> lines, String filter){
           List<String> result= new ArrayList<>();
        for (String line : lines) {
            if(!"lktbz".equals(line)){
                result.add(line);
            }
        }
        return  result;
    }
    /**
     *   java 8写法
     */
    private static void getFilterOutputJava8(List<String> lines){
        lines.stream()
                .filter((s)->!"lktbz".equals(s))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
