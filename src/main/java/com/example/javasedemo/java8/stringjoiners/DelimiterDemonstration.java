package com.example.javasedemo.java8.stringjoiners;

import java.util.StringJoiner;

/**
 * @Description 简单分隔符
 * @Author lktbz
 * @Date 2021/08/01
 */
public class DelimiterDemonstration {
    public static void main(String[] args) {
//        delimiterDemonstration();
//        addingPrefixAndSuffix();
//        mergeTwoStringJoiner();
        stringJoinerMethods();
    }

    /**
     * 添加分隔符
     */
    private static void delimiterDemonstration() {
        StringJoiner joinNanmes=new StringJoiner(",");
        joinNanmes.add("Rahul");
        joinNanmes.add("Raju");
        joinNanmes.add("Peter");
        joinNanmes.add("Raheem");
        System.out.println(joinNanmes);

        joinNanmes=new StringJoiner("|");
        joinNanmes.add("Raju");
        joinNanmes.add("Peter");
        joinNanmes.add("Raheem");
        System.out.println(joinNanmes);
    }

    /**
     * 添加前后缀
     */
    private static void addingPrefixAndSuffix() {
        StringJoiner joinNanmes = new StringJoiner(",", "[", "]");
        joinNanmes.add("Rahul");
        joinNanmes.add("Raju");
        joinNanmes.add("Peter");
        joinNanmes.add("Raheem");
        System.out.println(joinNanmes);
    }

    /**
     * 合并
     */
    private static void mergeTwoStringJoiner(){
        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        joinNames.add("Rahul");
        joinNames.add("Raju");

        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");

        joinNames2.add("Peter");
        joinNames2.add("Raheem");
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);

    }

    private static void stringJoinerMethods(){
        StringJoiner joinNames = new StringJoiner(",");
        System.out.println(joinNames);
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);

        joinNames.add("Rahul");
        joinNames.add("Raju");
        System.out.println(joinNames);

        int length = joinNames.length();
        System.out.println("Length: "+length);


        String str = joinNames.toString();
        System.out.println(str);

        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);
        joinNames.add("Sorabh");
        System.out.println(joinNames);
        int newLength = joinNames.length();
        System.out.println("New Length: "+newLength);


    }
}
