package com.wkr.design.adaptor;

/**
 * @author wkr
 * @Description: 适配器模式测试
 * @date 2022/9/1015:17
 */
public class Test {
    public static void main(String[] args) {
        // 组合
        IAdaptor adaptor1 = new AdaptorCombination(new Adaptee());
        adaptor1.doSomething();

        // 继承
        IAdaptor adaptor2 = new AdaptorInheritance();
        adaptor2.doSomething();

    }
}
