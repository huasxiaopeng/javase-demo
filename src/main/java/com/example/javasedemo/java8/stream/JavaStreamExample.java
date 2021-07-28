package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/28
 */
public class JavaStreamExample {
    private static List< Product > productsList = new ArrayList< Product >();
    public static void main(String[] args) {
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // With Java 8 Stream API'S
        withStreamAPI();
        withStreamEqualsAPI();
        withStreamESumAPI();
        withStreamEMaxMinAPI();
        withStreamSetMinAPI();
        withStreamMapAPI();
        withMapAPI();
    }

    /**
     * 过滤价格大于25000f，然后最后只要name 即可
      */
    private static void withStreamAPI() {
        productsList.stream()
                .filter((product ->product.getPrice()>25000f ))
                .map((product ->product.getName()))
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void withStreamEqualsAPI() {
        productsList.stream()
                .filter(product -> product.getPrice()==30000f)
                .forEach(product ->System.out.println(product.getPrice()));
    }
    private static void withStreamESumAPI() {
        Double collect = productsList.stream()
                .collect(Collectors.summingDouble(Product::getPrice));
        System.out.println("金额为："+collect);

    }
    private static void withStreamEMaxMinAPI() {
        Product product = productsList.stream()
                .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(product.getPrice());
    }
    private static void withStreamSetMinAPI() {
        Set< Float > productPriceList = productsList.stream().filter(product -> product.getPrice() < 30000)
                .map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceList);
    }
    private static void withStreamMapAPI() {
        Map< Integer, String > productPriceMap = productsList.stream()
                .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        System.out.println(productPriceMap);
    }
    private static void withMapAPI() {
        List < Float > productPriceList = productsList.stream()
                .filter(p -> p.getPrice() > 30000) // filtering data
                .map(Product::getPrice) // fetching price by referring getPrice method
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList);
    }
}
