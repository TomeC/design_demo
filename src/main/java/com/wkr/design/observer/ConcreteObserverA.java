package com.wkr.design.observer;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1114:24
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverA receive msg: "+msg);
    }
}
