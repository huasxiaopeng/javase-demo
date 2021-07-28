package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 过滤遍历
 * @Author lktbz
 * @Date 2021/07/28
 */
public class FilterAndForEachDemo {
    public static void main(String[] args) {
        List<Product>list=new ArrayList<>();
        /**
         * 需求：
         * 查询出价格大于25000商品，并且遍历，
         * 正常写法
         */
        for (Product product : getProducts()) {
            if (product.getPrice()>25000f){
                list.add(product);
            }
        }
        for (Product product : list) {
            System.out.println(product);
        }


        System.out.println("========stream 方式=============");
        getProducts().stream()
                .filter((pro)->pro.getPrice()>30000f)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("从上面可知，4行代码搞定，很是优雅。。。");
    }
    private static List< Product > getProducts() {
        List < Product > productsList = new ArrayList< Product >();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        return productsList;
    }
}
