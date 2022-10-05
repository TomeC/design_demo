package com.wkr.design.chain.b;

/**
 * @author wkr
 * @Description: 处理类抽象类
 * @date 2022/9/1823:51
 */
public abstract class Handler {
    protected Handler handler = null;
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
    public final void handle() {
        System.out.println("abstract Handler running ...");
        boolean handled = doHandle();
        if (!handled && handler != null) {
            handler.handle();
        }
    }
    protected abstract boolean doHandle();
}
