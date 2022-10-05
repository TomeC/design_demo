package com.wkr.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wkr
 * @Description: 静态内部类实现
 * @date 2022/9/511:05
 */
public class Singleton4 {
    private AtomicInteger resource = new AtomicInteger(0);

    private Singleton4() {}
    public static class Holder {
        private Holder() {}
        public static Singleton4 instace = new Singleton4();
    }
    public int getResource() {
        return resource.getAndAdd(4);
    }
}
