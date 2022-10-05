package com.wkr.design.bridge;

import java.util.List;

/**
 * @author wkr
 * @Description: 短信通知类
 * @date 2022/9/719:52
 */
public class SmsSender implements MsgSender {
    private final List<String> phoneList;

    public SmsSender(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public void send(String msg) {
        phoneList.forEach(phone -> {
            System.out.println("send sms to ["+phone+ "] msg: "+msg);
        });
    }
}
