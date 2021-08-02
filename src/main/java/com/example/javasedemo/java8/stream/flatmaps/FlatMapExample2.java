package com.example.javasedemo.java8.stream.flatmaps;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/08/02
 */
public class FlatMapExample2 {


    public static void main(String[] args) {

        List<Order> all = findAll();

        /**
         * 计算金额
         *   sum the line items' total amount
         */
        BigDecimal reduce = all.stream()
                .flatMap(order -> order.getLineItems().stream())
                .map(lineItem -> lineItem.getTotal())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce);


        // sum the order's total amount
        BigDecimal reduce1 = all.stream()
                .map(order -> order.getTotal())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce1);

        int[] array = {1, 2, 3, 4, 5, 6};

        //Stream<int[]>
        Stream<int[]> streamArray = Stream.of(array);

        //Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

        intStream.forEach(x -> System.out.println(x));

    }


    // create dummy records
    private static List<Order> findAll() {

        LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));

        LineItem item3 = new LineItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
        LineItem item4 = new LineItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
        Order order2 = new Order(2, "A0000002", Arrays.asList(item3, item4), new BigDecimal("1695.00"));

        LineItem item5 = new LineItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
        Order order3 = new Order(3, "A0000003", Arrays.asList(item5), new BigDecimal("1497.00"));

        return Arrays.asList(order1, order2, order3);

    }
}
