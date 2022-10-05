package com.wkr.design.strategy;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/120:10
 */
public class StrategyA implements Strategy {
    @Override
    public void calc() {
        System.out.println("Strategy A ...");
    }
}
