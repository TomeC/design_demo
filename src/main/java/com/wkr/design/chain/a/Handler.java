package com.wkr.design.chain.a;

/**
 * @author wkr
 * @Description: 抽象
 * @date 2022/9/18 23:34
 */
public abstract class Handler {
    protected Handler handler = null;
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public abstract void handle();
}
