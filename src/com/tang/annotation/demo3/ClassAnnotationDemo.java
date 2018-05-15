package com.tang.annotation.demo3;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ClassAnnotationDemo {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.tang.annotation.demo3.PersonInfo");

       // Method toStringMethod = cls.getMethod("toString");

        Annotation  ans[] = cls.getAnnotations();

        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }


    }
}
