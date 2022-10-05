package com.wkr.design.bridge;

/**
 * @author wkr
 * @Description: 严重告警
 * @date 2022/9/719:56
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender sender) {
        super(sender);
    }

    @Override
    public void notify(String msg) {
        msgSender.send(msg);
    }
}
