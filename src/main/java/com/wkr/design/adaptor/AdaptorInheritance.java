package com.wkr.design.adaptor;

/**
 * @author wkr
 * @Description: 基于继承实现的适配器模式
 * @date 2022/9/919:04
 */
public class AdaptorInheritance extends Adaptee implements IAdaptor {
    @Override
    public void doSomething() {
        System.out.println("adaptor do something");
        super.work();
    }
}
