package com.example.javasedemo.java8.methodsReference;

import java.util.Comparator;
import java.util.function.BiFunction;

/**
 * @Description 引用覆盖
 * @Author lktbz
 * @Date 2021/08/01
 */
public class ReferenceToStaticMethod2 {
    public static void main(String[] args) {
       BiFunction<Integer,Integer,Integer >addr1 = Arithmetic::add;
       BiFunction<Integer,Float,Float >addr2 = Arithmetic::add;
       BiFunction<Float,Float,Float >addr3 = Arithmetic::add;
       Integer result = addr1.apply(10, 20);
       Float fresult=addr2.apply(20,20.0f);
       Float fresult3=addr3.apply(10f,20f);
       System.out.println(result);
       System.out.println(fresult);
       System.out.println(fresult3);
    }
}
class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}