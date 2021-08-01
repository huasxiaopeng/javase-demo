package com.example.javasedemo.java8.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/08/01
 */
public class FilterAndFindFilter {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
        Person jack = getStudentByName(persons, "jack");
        System.out.println(jack);
        System.out.println("=========美丽的分割线===============");
        /**
         * 查找一个存在的
         */
       Person ps= persons.stream()
                .filter(x->"jack".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println(ps.toString());
        /**
         * 查找一个不存在的
         */
//        Person ps2= persons.stream()
//                .filter(x->"ahmook".equals(x.getName()))
//                .findAny()
//                .orElse(null);
//        System.out.println(ps2.toString());

        /**
         * 多条件
         */
        Person ps3=persons.stream()
                .filter((person -> "jack".equals(person.getName())&&20==person.getAge()))
                .findAny()
                .orElse(null);
        System.out.println(ps3);

        /**
         * map
         */
        String name =   persons.stream()
                .filter(x->"jack".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse(null);
        System.out.println("name为"+name);
    }

    private static Person getStudentByName(List<Person> persons, String name) {
        /**
         * 参数校验省略
         */
        Person result=null;
        for (Person person : persons) {
            if(name.equals(person.getName())){
                result=person;
            }
        }
        return  result;
    }
}
