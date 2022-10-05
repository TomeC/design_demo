package com.wkr.design.Facade;

/**
 * @author wkr
 * @Description: 门面类
 * @date 2022/9/1 10:17
 */
public class FacadeSystem {
    private SystemA systemA;

    public FacadeSystem(SystemA systemA) {
        this.systemA = systemA;
    }

    public void doSomething() {
        System.out.println("facade system");
        systemA.doOne();
        systemA.doTwo();
    }
}
