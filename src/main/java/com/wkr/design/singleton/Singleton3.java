package com.wkr.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wkr
 * @Description: 双重检测
 * @date 2022/9/510:56
 */
public class Singleton3 {
    private final AtomicInteger resource = new AtomicInteger(0);
    private static Singleton3 instance;
    private Singleton3() {}
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized(Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
    public int getResource() {
        return resource.getAndAdd(3);
    }
}
