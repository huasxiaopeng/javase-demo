package com.example.javasedemo.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Description 函数接口 Consumer
 * @Author lktbz
 * @Date 2021/07/27
 */
public class ConsumerDemo {
    @Test
    public void test01() {
      Consumer<String> consumer=(t)-> System.out.println(t);
      consumer.accept("lktbz");
    }
    @Test
    public void test02() {
        Consumer < String > consumer2 = (input) -> System.out.println(input + " World !");
        Consumer < String > consumer3 = (input) -> System.out.println(input + " Java");
        consumer2.andThen(consumer3).accept("hello");
    }
    @Test
    public void test03() {
        List< Integer > integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        integers.forEach((t)-> System.out.println(t));
    }
}
