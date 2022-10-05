package com.wkr.design.proxy;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/519:31
 */
public class Worker implements IWorker {
    @Override
    public void work() {
        System.out.println("worker is doing somethong");
    }
}
