package com.wkr.design.chain.b;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1823:58
 */
public class HandlerChain {
    private Handler head, tail;
    public void addChain(Handler handler) {
        handler.setNextHandler(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setNextHandler(handler);
        tail = handler;
    }
    public void doChain() {
        System.out.println("chain running ...");
        if (head != null) {
            head.handle();
        }
    }
}
