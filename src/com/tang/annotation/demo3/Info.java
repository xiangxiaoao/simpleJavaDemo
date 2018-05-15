package com.tang.annotation.demo3;

@MyAnnotaion(key="name",value="thl")
public class Info {

    public String name;

    /**
     *  本方法是覆写Object类中的toString()方法
     * @return
     */
    //@MyAnnotaion(key="name",value="thl")
    public String toString(){
        return "hello";
    }
}
