package com.wkr.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wkr
 * @Description: 饿汉式
 * @date 2022/9/218:48
 */
public class Singleton1 {
    private final AtomicInteger resource = new AtomicInteger(0);;
    public static final Singleton1 instance = new Singleton1();
    private Singleton1() { }
    public Integer getResource() {
        return resource.addAndGet(1);
    }
}
