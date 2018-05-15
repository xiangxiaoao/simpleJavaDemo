package com.tang.annotation.demo3;

import java.lang.annotation.*;

@Retention(value=RetentionPolicy.RUNTIME) //作用范围
@Target(value={ElementType.METHOD,ElementType.TYPE}) //注解的目标范围
@Documented //可以生产javaDoc
//@Inherited //表示MyAnnotation可以被子类继承
public @interface MyAnnotaion {

    public String key() default "THL";

    public String value();
}
