package com.wkr.design.strategy;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/120:12
 */
public class User {
    private Strategy strategy;

    public User(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doSomething() {
        System.out.println("user call strategy ...");
        strategy.calc();
    }
}
