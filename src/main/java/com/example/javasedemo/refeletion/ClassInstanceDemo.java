package com.example.javasedemo.refeletion;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/6
 * @desc  反射创建类实例
 */
public class ClassInstanceDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass =Supper.class;
        Supper sp=(Supper) aClass.getDeclaredConstructor().newInstance();
        sp.sayHello("lktbz");
    }
    /**
     *   反射调用sayhello
     */
    public static class Supper {

        public String sayHello(String name) {
            return String.format("%s say hello!", name);
        }
    }
}
