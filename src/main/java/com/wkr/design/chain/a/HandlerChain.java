package com.wkr.design.chain.a;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/1823:39
 */
public class HandlerChain {
    private Handler head,tail;
    public void addHandler(Handler handler) {
        handler.setHandler(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setHandler(handler);
        tail = handler;
    }
    public void handle() {
        System.out.println("handler chain");
        if (head != null) {
            head.handle();
        }
    }
}
