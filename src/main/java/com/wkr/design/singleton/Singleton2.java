package com.wkr.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wkr
 * @Description: 懒汉式
 * @date 2022/9/219:20
 */
public class Singleton2 {
    private final AtomicInteger resource = new AtomicInteger(0);
    private static Singleton2 instance;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public int getResource() {
        return resource.addAndGet(2);
    }
}
