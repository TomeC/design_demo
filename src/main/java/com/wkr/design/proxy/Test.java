package com.wkr.design.proxy;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/519:35
 */
public class Test {
    public static void main(String[] args) {
//        new IWorkerProxy(new Worker()).work();

//        new WorkerProxy().work();

//        WorkDynProxy workDyn = new WorkDynProxy();
//        IWorker worker  = (IWorker) workDyn.createProxy(new Worker());
//        worker.work();

        Worker worker  = (Worker) WorkerInterceptor.getProxy(Worker.class);
        worker.work();
    }
}
