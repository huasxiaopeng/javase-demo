package com.example.javasedemo.refeletion;


import java.lang.annotation.*;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/6
 * @desc 注解元信息元素
 */
public class AnnotatedElementDemo {
    public static void main(String[] args) {
        Class<Sub> subClass = Sub.class;
        System.out.println("-----getAnnotations-----");
        for (Annotation annotation : subClass.getAnnotations()) {
            System.out.println(annotation.toString());
        }
        /**
         * 继承的父注解拿不到
         */
        System.out.println("-----getDeclaredAnnotation-->SupperAnnotation-----");
        SupperAnnotation declaredAnnotation = subClass.getDeclaredAnnotation(SupperAnnotation.class);
        System.out.println(declaredAnnotation);
        /**
         *   可以拿到父注解
          */
        System.out.println("-----getAnnotation-->SupperAnnotation-----");
        SupperAnnotation annotation = subClass.getAnnotation(SupperAnnotation.class);
        System.out.println(annotation);

        System.out.println("-----getDeclaredAnnotation-->SubAnnotation-----");
        SubAnnotation declaredAnnotation1 = subClass.getDeclaredAnnotation(SubAnnotation.class);
        System.out.println(declaredAnnotation1);

        System.out.println("-----getDeclaredAnnotationsByType-->SubAnnotation-----");
        SubAnnotation[] declaredAnnotationsByType = subClass.getDeclaredAnnotationsByType(SubAnnotation.class);
        for (SubAnnotation subAnnotation : declaredAnnotationsByType) {
            System.out.println(subAnnotation);
        }

        System.out.println("-----getDeclaredAnnotationsByType-->SupperAnnotation-----");
        SupperAnnotation[] declaredAnnotationsByType1 = subClass.getDeclaredAnnotationsByType(SupperAnnotation.class);
        for (SupperAnnotation supperAnnotation : declaredAnnotationsByType1) {
            System.out.println(supperAnnotation);
        }
        System.out.println("-----getAnnotationsByType-->SupperAnnotation-----");
        SubAnnotation[] annotationsByType = subClass.getAnnotationsByType(SubAnnotation.class);
        for (SubAnnotation subAnnotation : annotationsByType) {
            System.out.println(subAnnotation);
        }
        System.out.println("判断是否是其超类");
        boolean assignableFrom = subClass.isAssignableFrom(Supper.class);
        System.out.println(assignableFrom);
    }

    @SupperAnnotation
    private static class Supper {
    }
    @SubAnnotation
    private static class Sub extends Supper {

    }
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @Documented
    @Target(ElementType.TYPE)
    private @interface SupperAnnotation {

        String value() default "SupperAnnotation";
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Target(ElementType.TYPE)
    private @interface SubAnnotation {

        String value() default "SubAnnotation";
    }
}
