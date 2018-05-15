package com.tang.annotation.demo2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyAnnotaion {

    public String key() default "THL";

    public String value();
}
