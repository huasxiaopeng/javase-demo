package com.example.javasedemo.refeletion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/6
 * @desc
 */
public class ClassFieldDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
        Class<Supper> supperClass = Supper.class;
        Supper supper = supperClass.newInstance();
        Method sayHello = supperClass.getDeclaredMethod("sayHello");
        sayHello.setAccessible(Boolean.TRUE);
        Field name = supperClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(supper,"lktbz");
        System.out.println("Field get-->" + name.get(supper));
        sayHello.invoke(supper);
        name.set(supper,"th-row");
        System.out.println("Field get-->" + name.get(supper));
        sayHello.invoke(supper);

    }

    public static class Supper {

        private String name;

        private void sayHello() {
            System.out.println(String.format("%s say hello!", name));
        }
    }
}
