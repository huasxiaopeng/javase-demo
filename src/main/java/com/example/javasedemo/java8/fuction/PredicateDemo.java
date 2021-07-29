package com.example.javasedemo.java8.fuction;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Description 函数式接口之断言
 * @Author lktbz
 * @Date 2021/07/27
 */
public class PredicateDemo {
    @Test
    public void test01() {
        /**
         * 定义函数的执行体
         */
        Predicate<Integer> predicate=(t)->{
           if(t%2==0){
               return true;
           }else{
               return false;
           }
        };
        System.out.println(predicate.test(10));
    }

    /**
     * 结合stream 进行数据过滤
     * Predicate#and
     */
    @Test
    public void test02() {
        List< Integer > list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate < Integer > predicate2 = (x) -> x > 5;
        Predicate < Integer > predicate3 = (x) -> x < 8;
        list1.stream()
                .filter(predicate2.and(predicate3))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * Predicate#or 使用
     */
    @Test
    public void test03() {
        List < String > list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        Predicate < String > predicate2 = (x) -> x.length()==3;
        Predicate < String > predicate3 = (x) -> x.startsWith("A");
        List<String> collect = list.stream()
                /**
                 * 过滤条件是，长度等于三或者以A开头的字符串
                 */
                .filter(predicate2.or(predicate3))
                .collect(Collectors.toList());
        System.out.println(collect);

    }

}
