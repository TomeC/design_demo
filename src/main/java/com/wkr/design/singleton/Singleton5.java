package com.wkr.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wkr
 * @Description: enum实现
 * @date 2022/9/511:33
 */
public enum Singleton5 {
    INSTANCE;

    private AtomicInteger resource = new AtomicInteger(0);
    public int getResource() {
        return resource.getAndAdd(5);
    }
}
