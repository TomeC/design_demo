package com.wkr.design.chain.a;

/**
 * @author wkr
 * @Description: 处理类B
 * @date 2022/9/18 23:36
 */
public class HandleB extends Handler {
    @Override
    public void handle() {
        boolean isOk = false;
        System.out.println("handlerB running ... ");

        if (Math.random() > 0.5) {
            isOk = true;
            System.out.println("handlerA success");
        }
        if (!isOk && handler != null) {
            handler.handle();
        }
    }
}
