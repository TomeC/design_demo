package com.wkr.design.chain.a;

/**
 * @author wkr
 * @Description: 处理类A
 * @date 2022/9/18 23:36
 */
public class HandleA extends Handler {
    @Override
    public void handle() {
        boolean isOk = false;
        System.out.println("handlerA running");
        if (Math.random() > 0.5) {
            isOk = true;
            System.out.println("handlerA success");
        }
        isOk = true;
        if (!isOk && handler != null) {
            handler.handle();
        }
    }
}
