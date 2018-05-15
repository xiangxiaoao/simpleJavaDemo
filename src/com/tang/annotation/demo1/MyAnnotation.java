package com.tang.annotation.demo1;

/**
 * 简单的自定义注解
 */
public @interface MyAnnotation {
    public String key() default "name";

    public String value() default "thl";

    public Color color() default Color.RED;

    public String[] url();
}
