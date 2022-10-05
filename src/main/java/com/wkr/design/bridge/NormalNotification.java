package com.wkr.design.bridge;

/**
 * @author wkr
 * @Description: 普通通知
 * @date 2022/9/719:57
 */
public class NormalNotification extends Notification {
    public NormalNotification(MsgSender sender) {
        super(sender);
    }

    @Override
    public void notify(String msg) {
        msgSender.send(msg);
    }
}
