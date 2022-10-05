package com.wkr.design.chain.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1823:55
 */
public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerB doHandle ...");
        if (Math.random()>0.5) {
            System.out.println("HandlerB handle success");
            return true;
        }
        System.out.println("HandlerB handle failed");
        return false;
    }
}
