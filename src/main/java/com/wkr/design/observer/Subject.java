package com.wkr.design.observer;

/**
 * @author wkr
 * @Description: 主题【被观察者】
 * @date 2022/9/1114:17
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String msg);
}
