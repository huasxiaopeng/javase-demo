package com.example.javasedemo.java8.stream.flatmaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/08/02
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        String[][]array=new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> stream = Arrays.stream(array);
        System.out.println(stream);
    /**
        List<String[]> a = stream.filter(x -> !x.equals("a"))
                .collect(Collectors.toList());
        System.out.println(a.size());
        a.forEach(System.out::println);
        */

        /**
         * 双遍历
         */
        /**List<String[]> result =stream.filter(x -> {
            for (String s : x) {
                if (s.equals("a")) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());
        result.forEach(x->System.out.println(Arrays.toString(x)));
        **/
        /**
         * 二维数组变成以为数组
         */
       /**
        String[] strings = Stream.of(array)
                .flatMap(Stream::of)
                .toArray(String[]::new);
        for (String string : strings) {
            System.out.print(string);
        }
        **/

        /**
         *  降维 排除 a
         */
        /**
        Stream.of(array)
                .flatMap(Stream::of)
                .filter(x->!"a".equals(x))
                .collect(Collectors.toList())
                .forEach(System.out::println);
         **/






    }
}
