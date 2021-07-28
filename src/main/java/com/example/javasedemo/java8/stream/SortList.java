package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description Comparator sort
 * @Author lktbz
 * @Date 2021/07/28
 */
public class SortList {
    public static void main(String[] args) {
        List< Employee > employees = new ArrayList< Employee >();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println(employees);

//        Collections.sort(employees,((o1, o2) -> (o1.getName().compareTo(o2.getName()))));
//        System.out.println(employees);

        Collections.sort(employees,Comparator.comparing(Employee::getName));
    }
}
