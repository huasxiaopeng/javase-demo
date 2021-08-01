package com.example.javasedemo.strings;

import java.nio.charset.StandardCharsets;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/29
 */
public class StringsDemo {
    public static void main(String[] args) {
        /**
         * 创建string 方式
         */
        String s = "javaguides";
        String java_lambda = new String("java lambda");
        System.out.println(java_lambda.length());
        char chars[] = {'a',
                'b',
                'c',
                'd',
                'e',
                'f'};
        String s1 = chars.toString();
        System.out.println(s1.toString());
        String charss = new String(chars);
        System.out.println(charss);

        String s2 = new String(chars, 2, 3);
        System.out.println(s2);
        String abd="dello";
        /***
         * 根据下标返回对应的char
         */
        char c = abd.charAt(1);
        char co = abd.charAt(0);
        System.out.println(c);
        System.out.println(co);

        int unicode = abd.codePointAt(0);
        System.out.println(unicode);
        /**
         * 转换成string ,转换失败
         */
        System.out.println(Integer.toString(unicode));

        String s11 = "Hello World";
        String s22 = "Hello World";
        String s23 = "hello world";
        String s3 = "Java";
        String s4 = "Guides";

        System.out.println(s11.compareTo(s22));
        System.out.println(s11.compareTo(s3));

        /**
         * 字符串链接
         */
        String concat = s4.concat(" .net");
        System.out.println(concat);

        String str = "javaguides";
        String subStr = "guides";
        boolean guides = str.contains("guides");
        System.out.println("是否包含匹配元素："+guides);

        boolean b = str.endsWith(subStr);
        System.out.println("是否以结尾："+b);

        System.out.println(s11.equals(s22));
        System.out.println(s11.equals(s4));
        /**
         * 比较相等忽略大小写
         */
        System.out.println(s11.equalsIgnoreCase(s23));
        /**
         * 字符串转换成字节数组
         */
        for (byte aByte : str.getBytes(StandardCharsets.UTF_8)) {
            System.out.print(aByte+" ");
        }


        int java = str.indexOf("java");
        System.out.println(java);
        int guides1 = str.indexOf("guides");
        System.out.println(guides1);
        /**
         * 根据传入的字符串或者字符，获取所在的元素位序
         */
        int s5 = str.indexOf('s');
        System.out.println(s5);
        System.out.println(str.indexOf('g', 0));
        System.out.println(str.indexOf("guides", 3));
        // String str = "javaguides";
        /**
         * 匹配的字符串或者字符最后一次出现的位置
         */
        System.out.println(str.lastIndexOf('s'));
        System.out.println(str.lastIndexOf("guides"));
        System.out.println(str.lastIndexOf('a'));
        /**
         *  替换
         */
        System.out.println("hello".replace('l','w'));
        /**
         * 替换部分
          */
        System.out.println(str.replace("guides","tutorials"));
        /**
         * 分割
          */
        String splis = "java,guides.net";
        String[] split = splis.split(",");
        for (String s6 : split) {
            System.out.println(s6);
        }
        String[] split1 = splis.split(",", 0);
        for (String s6 : split1) {
            System.out.println(s6);
        }

        boolean ja = str.startsWith("ja");
        System.out.println("是否以此为开头:"+ja);
        System.out.println("是否以此开头："+str.startsWith("guides", 4));


        CharSequence subStrs = str.subSequence(2, str.length());
        System.out.println(subStrs);


        System.out.println(str.substring(0,str.length()));
        System.out.println(str.length());
        /**
         *从第4位开始截取，保留6位
         */
        System.out.println(str.substring(4));
        System.out.println(str.substring(1));


        String trimms="javaguides  ";
        String trimms2="  javaguides  ";
        System.out.println(trimms);
        System.out.println(trimms2);
        System.out.println(trimms.trim());
        System.out.println(trimms2.trim());
    }
}
