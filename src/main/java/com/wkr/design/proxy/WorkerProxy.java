package com.wkr.design.proxy;

/**
 * @author wkr
 * @Description: 基于继承实现的代码【无接口的情况】
 * @date 2022/9/519:36
 */
public class WorkerProxy extends Worker {
    public void work() {
        System.out.println("WorkerProxy begin ...");
        super.work();
        System.out.println("WorkerProxy done");
    }
}
