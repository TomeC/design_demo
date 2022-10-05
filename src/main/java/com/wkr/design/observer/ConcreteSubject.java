package com.wkr.design.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1114:21
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new LinkedList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
