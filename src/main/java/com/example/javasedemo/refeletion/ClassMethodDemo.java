package com.example.javasedemo.refeletion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/6
 * @desc
 */
public class ClassMethodDemo {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Supper> supperClass = Supper.class;
        Supper supper = supperClass.newInstance();
        Method sayHello = supperClass.getDeclaredMethod("sayHello", String.class);
         sayHello.setAccessible(true);
         sayHello.invoke(supper,"hello");
    }

    public static class Supper{

        private void sayHello(String name){
            System.out.println(String.format("%s say hello!", name));
        }
    }
}
