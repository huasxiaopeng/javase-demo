package com.example.javasedemo.java8.stream.grouping.by;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description 分组
 * @Author lktbz
 * @Date 2021/08/02
 */
public class GroupingByDemo01 {
    public static void main(String[] args) {
        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(collect);

    }
}
