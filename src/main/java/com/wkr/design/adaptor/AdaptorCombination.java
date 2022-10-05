package com.wkr.design.adaptor;

/**
 * @author wkr
 * @Description: 基于组合实现的适配器模式
 * @date 2022/9/1015:25
 */
public class AdaptorCombination implements IAdaptor {
    private Adaptee adaptee;

    public AdaptorCombination(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        System.out.println("adaptor do something");
        adaptee.work();
    }
}
