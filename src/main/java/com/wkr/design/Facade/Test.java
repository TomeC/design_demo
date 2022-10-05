package com.wkr.design.Facade;

/**
 * @author wkr
 * @Description: 外观模式测试
 * @date 2022/9/1 10:18
 */
public class Test {
    public static void main(String[] args) {
        FacadeSystem facadeSystem = new FacadeSystem(new SystemA());
        facadeSystem.doSomething();
    }
}
