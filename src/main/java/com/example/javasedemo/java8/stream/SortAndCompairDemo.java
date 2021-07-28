package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description Stream compare
 * @Author lktbz
 * @Date 2021/07/28
 */
public class SortAndCompairDemo {
    public static void main(String[] args) {
        // create list
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        /**
         * 默认方式排序
         */
        fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        fruits.stream().sorted(((o1, o2) -> o1.compareTo(o2)))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        fruits.stream().sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        fruits.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //反转
        employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
