package com.wkr.design.chain.a;

/**
 * @author wkr
 * @Description: 责任链模式测试【这种模式不够优雅，需要处理业务的同时还要调用handle()处理框架逻辑】
 * @date 2022/9/17 17:11
 */
public class Test {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandleA());
        handlerChain.addHandler(new HandleA());
        handlerChain.addHandler(new HandleB());
        handlerChain.handle();
    }
}
