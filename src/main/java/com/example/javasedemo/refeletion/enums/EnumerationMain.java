package com.example.javasedemo.refeletion.enums;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc 枚举类反射
 */
public class EnumerationMain {
    enum  Color{
        RED,BLACK,BLUE
    }
    public static class ColorHolder{
        private Color color=Color.BLACK;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /**
         * 通过反射修改对象的默认值
         */
        Class<Color> colorClass = Color.class;
        System.out.println(colorClass.isEnum());
        System.out.println(Arrays.toString(colorClass.getEnumConstants()));

        ColorHolder colorHolder = new ColorHolder();
        Class<ColorHolder> colorHolderClass = ColorHolder.class;
        Field color = colorHolderClass.getDeclaredField("color");
        color.setAccessible(true);
        System.out.println("old Color:"+color.get(colorHolder));

        color.set(colorHolder,Color.RED);
        System.out.println("new Color:"+color.get(colorHolder));
    }
}
