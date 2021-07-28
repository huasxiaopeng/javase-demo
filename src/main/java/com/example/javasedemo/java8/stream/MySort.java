package com.example.javasedemo.java8.stream;

import java.util.Comparator;

/**
 * @Description 比较
 * @Author lktbz
 * @Date 2021/07/28
 */
public class MySort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary()- o2.getSalary());
    }
}
