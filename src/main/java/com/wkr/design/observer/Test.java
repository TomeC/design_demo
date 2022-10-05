package com.wkr.design.observer;

/**
 * @author wkr
 * @Description: 观察者模式测试
 * @date 2022/9/1114:14
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverA());
        subject.registerObserver(new ConcreteObserverB());
        subject.notifyObserver("tom comming");
    }
}
