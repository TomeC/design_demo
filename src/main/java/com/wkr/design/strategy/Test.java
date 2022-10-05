package com.wkr.design.strategy;

import java.util.Iterator;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/120:08
 */
public class Test {
    public static void main(String[] args) {
//        User user = new User(new StrategyA());
        User user = new User(new StrategyB());
        user.doSomething();

    }
}
