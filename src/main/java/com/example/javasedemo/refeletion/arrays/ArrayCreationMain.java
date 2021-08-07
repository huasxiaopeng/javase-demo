package com.example.javasedemo.refeletion.arrays;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc
 */
public class ArrayCreationMain {

    /**
     * 这个是我们创建的最终目标数组
     */
    private static String R = "java.math.BigInteger[] bi = {123,234,345}";
    private static final String[] S = new String[]{"123", "234", "345"};
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<BigInteger> componentType  = BigInteger.class;
        Object arrayObject= Array.newInstance(componentType, 3);
        for (int i = 0; i <S.length ; i++) {
            String each=S[i];
            Constructor<BigInteger> constructor = componentType.getConstructor(String.class);
            BigInteger value = constructor.newInstance(each);
            Array.set(arrayObject,i,value);
        }
        Object[]result=(Object[]) arrayObject;
        Arrays.stream(result).forEach(System.out::println);
        Class<?> aClass = arrayObject.getClass();
        System.out.println(aClass.isArray());
        System.out.println(aClass.getComponentType());
    }
}
