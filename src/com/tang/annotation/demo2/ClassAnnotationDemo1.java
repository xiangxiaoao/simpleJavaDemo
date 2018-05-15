package com.tang.annotation.demo2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ClassAnnotationDemo1 {
    public static void main(String[] args) throws Exception {

          //获取类
          Class<?> cls = Class.forName("com.tang.annotation.demo2.Info");

          //获取类中的方法
          Method toStringMethod = cls.getMethod("toString");

          //获取方法上的所有的注解,只能获取在RUNTIME范围内的注解
          Annotation ans[] = toStringMethod.getAnnotations();

          for (int i=0;i<ans.length;i++){
                Annotation  object = ans[i];

                System.out.println(object);
          }
     }
}
