package com.wkr.design.proxy;

/**
 * @author wkr
 * @Description: 基于接口实现的代理
 * @date 2022/9/519:33
 */
public class IWorkerProxy implements IWorker {
    private IWorker worker;
    public IWorkerProxy(IWorker worker) {
        this.worker = worker;
    }
    @Override
    public void work() {
        System.out.println("proxy begin doing ...");
        worker.work();
        System.out.println("proxy done ...");
    }
}
