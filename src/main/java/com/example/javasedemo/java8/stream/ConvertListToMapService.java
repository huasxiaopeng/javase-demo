package com.example.javasedemo.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/29
 */
public class ConvertListToMapService {
    public static void main(String[] args) {
        ConvertListToMapService convertListToMapService = new ConvertListToMapService();
        List < Employee > list = new ArrayList< >();
        list.add(new Employee(100 , "Ramesh"));
        list.add(new Employee(101 , "Tom"));
        list.add(new Employee(102 , "Tony"));


        Map < Integer, Employee > map1 = convertListToMapService.convertListJava8(list);
        System.out.println(map1);
    }
    public Map<Integer,Employee> convertListJava8(List<Employee> list){
        Map<Integer, Employee> collect = list.stream()
                .collect(
                        Collectors.toMap(
                                Employee::getId,
                                es -> es));
        return collect;
    }


}
