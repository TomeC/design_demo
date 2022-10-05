package com.wkr.design.template;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1114:28
 */
public abstract class Product {
    public void generate() {
        processA();
        processB();
    }
    public void processA() {
        System.out.println("process A ...");
    }
    public void processB() {
        System.out.println("process B ...");
    }
}
