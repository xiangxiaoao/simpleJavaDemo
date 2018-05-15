package com.tang.annotation.demo2;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ClassAnnotaionDemo2 {
    public static void main(String[] args) throws Exception {
         Class<?> cls = Class.forName("com.tang.annotation.demo2.Info");
         Method toStringMethod = cls.getMethod("toString");

         Annotation ans[] = toStringMethod.getAnnotations();

         for (int i=0;i<ans.length;i++){
             if(toStringMethod.isAnnotationPresent(MyAnnotaion.class)){
                 MyAnnotaion my = null;
                 my = toStringMethod.getAnnotation(MyAnnotaion.class);
                 String key = my.key();
                 String value = my.value();
                 System.out.println("key："+key+",value:"+value);
             }
         }
    }
}
