package com.example.javasedemo.java8.stream.nulls.values;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description   空值处理
 * @Author lktbz
 * @Date 2021/08/02
 */
public class NullAndValueDemo {
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

//        List<String> collect = language.collect(Collectors.toList());
//        collect.forEach(System.out::println);
//         language.filter(x->x!=null)
//                 .collect(Collectors.toList())
//                 .forEach(System.out::println);
        language.filter(Objects::nonNull)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
