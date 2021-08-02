package com.example.javasedemo.java8.stream.grouping.by;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description 分组
 * @Author lktbz
 * @Date 2021/08/02
 */
public class GroupingByDemo02 {
    public static void main(String[] args) {
        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        Map<String, Long> collect = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println(collect);
        Map<String, Integer> collect1 = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println(collect1);
        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> collect2 = items.stream()
                .collect(Collectors.groupingBy(
                        Item::getPrice,
                        Collectors.mapping(Item::getName, Collectors.toSet())
                ));
        System.out.println(collect2);


    }
}
