package com.example.javasedemo.java8.optional;

import java.util.Optional;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/29
 */
public class OptionalBasicExample {
    public static void main(String[] args) {
        Optional<String> male = Optional.of("MALE");
        String answer1="YES";
        String answer2=null;
        System.out.println("非空对象"+male);
        System.out.println("获取非空对象的值"+male.get());
        System.out.println("empty:"+Optional.empty());
        System.out.println("非空值"+Optional.ofNullable(answer1));
        System.out.println("非空值"+Optional.ofNullable(answer2));
        /**
         * of 没有进行非空判断
         */
//        System.out.println(Optional.of(answer2));
        //判断对象是否为空值
        System.out.println(male.isPresent());
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name="Ramesh";
        Optional<String> name1 = Optional.of(name);
        /**
         * 存在就调用，不然什么也不执行
         */
        name1.ifPresent((s->System.out.println(s.length())));

        String nullName = null;

        String names = Optional.ofNullable(nullName).orElse("我不想执行的");
        System.out.println(names);
        String name3 = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name3);
        /**
         * 为空抛异常
          */
//        String name4=Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
//        System.out.println("--"+name4);
         String s = male.get();
         System.out.println(s);


    }
}
