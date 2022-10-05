package com.wkr.design.chain.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1823:55
 */
public class HandlerA extends Handler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerA doHandle ...");
        if (Math.random()>0.9) {
            System.out.println("HandlerA handle success");
            return true;
        }
        System.out.println("HandlerA handle failed");
        return false;
    }
}
