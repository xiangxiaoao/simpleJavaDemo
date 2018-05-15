package com.tang.annotation.demo2;

public class Info {

    @Override
    @MyAnnotaion(key="name",value="thl")
    public String toString(){
        return "hello";
    }
}
