package com.example.javasedemo.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @Description Stream 创建方式
 * @Author lktbz
 * @Date 2021/07/28
 */
public class EmptyStream {
    public static void main(String[] args) {
        /**
         * 空stream
         */
        Stream<Object> empty = Stream.empty();
        empty.forEach(System.out::println);
        //通过集合创建stream
        List<String> strings = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream = strings.stream();
        stream.forEach(System.out::println);
        Set<String> set=new HashSet<>(strings);
        set.stream().forEach(System.out::println);
        //通过数组方式
        String[]arr=new String[]{"A","B","C"};
        Arrays.stream(arr).forEach(System.out::println);
        //streambuilder 创建
        Stream<String> build = Stream.<String>builder().add("a").add("c").add("sd").build();
        build.forEach(System.out::println);
        Stream<String> limit = Stream.generate(() -> "lk").limit(5);
        limit.forEach(System.out::println);
        Stream<Integer> limit1 = Stream.iterate(1, n -> n + 2).limit(5);
        limit1.forEach(System.out::println);
        Stream<String> a = Stream.of("a", "cc", "dd");
        a.forEach(System.out::println);

    }
}
