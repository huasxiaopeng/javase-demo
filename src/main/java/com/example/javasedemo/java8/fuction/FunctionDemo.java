package com.example.javasedemo.java8.fuction;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Description 函数式接口  function
 * @Author lktbz
 * @Date 2021/07/27
 */
public class FunctionDemo {
    @Test
    public void test01() {
        Function<String, Integer> funs = (t) -> t.length();
        System.out.println(funs.apply("Ramesh"));

    }

    @Test
    public void test02() {
        Function<Integer, String> function2 = (number) -> {
            if (number % 2 == 0) {
                return "Number " + number + " is even";
            } else {
                return "Number " + number + " is odd";
            }
        };
        System.out.println(function2.apply(11));
        System.out.println(function2.apply(12));
    }

    @Test
    public void test03() {
        Function<String, Integer> function3 = (t) -> t.length();
        Function<Integer, Integer> function4 = (number) -> number * 2;
        /**
         * 先执行fun3 在执行fun4
         */
        Integer ramesh = function3.andThen(function4).apply("Ramesh");
        System.out.println(ramesh);
    }
    @Test
    public void test04() {
        List<String> list = Arrays.asList("Banana", "Mango", "Apple", "Watermelon");
        Map<String, Integer> map = convertListToMap(list, x -> x.length());
        System.out.println(map);
    }

    /**
     * list 列表转换成map
     * @param list
     * @param func
     * @param <T>
     * @param <R>
     * @return
     */
    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        /**
         * list T 类型当做key .R为value 具体是个未知类型
         */
        Map<T, R> result = new HashMap<>();

        for (T t : list) {
            /**
             * 存放 key t 以及转换后的类型 apply t 类型
             */
            result.put(t,func.apply(t));
        }
        return result;
    }

}
