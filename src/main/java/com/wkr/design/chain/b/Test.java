package com.wkr.design.chain.b;

/**
 * @author wkr
 * @Description: 责任链模式测试类
 * @date 2022/9/18 23:49
 */
public class Test {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addChain(new HandlerA());
        handlerChain.addChain(new HandlerA());
        handlerChain.addChain(new HandlerB());
        handlerChain.doChain();
    }
}
