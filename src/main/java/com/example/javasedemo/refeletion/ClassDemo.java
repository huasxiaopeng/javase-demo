package com.example.javasedemo.refeletion;

import java.util.List;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/6
 * @desc  class 获取类中方法名称
 */
public class ClassDemo {
    /**
     * getName()：用于获取类在Java虚拟机中的类名表示。
     * getCanonicalName()：用于获取全类名，包括包路径，包路径以点号分隔。
     * getSimpleName()：用于获取类名，不包括包路径。
     */
    public static void main(String[] args) {
        Supper<String , List<String>> supper=new Supper<String, List<String>>();
        Class<? extends Supper> aClass = supper.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());
        String[][]strings=new String[1][1];
        System.out.println(strings.getClass().getName());
        System.out.println(strings.getClass().getSimpleName());
        System.out.println(strings.getClass().getCanonicalName());
    }
    private static class Supper<K, V> {
        private K key;
        private V value;
        //省略setter和getter方法

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
