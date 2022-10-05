package com.wkr.design.observer;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1114:24
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverB receive msg: "+msg);
    }
}
