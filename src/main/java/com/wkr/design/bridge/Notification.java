package com.wkr.design.bridge;

/**
 * @author wkr
 * @Description: 通知类
 * @date 2022/9/719:54
 */
public abstract class Notification {
    protected MsgSender msgSender;
    public Notification(MsgSender sender) {
        msgSender = sender;
    }
    public abstract void notify(String msg);
}
