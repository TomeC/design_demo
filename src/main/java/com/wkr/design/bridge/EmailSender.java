package com.wkr.design.bridge;

import java.util.List;

/**
 * @author wkr
 * @Description: 邮件发送消息类
 * @date 2022/9/719:51
 */
public class EmailSender implements MsgSender {
    private final List<String> emailList;

    public EmailSender(List<String> emailList) {
        this.emailList = emailList;
    }

    @Override
    public void send(String msg) {
        emailList.forEach(email -> {
            System.out.println("send email to ["+email+"] msg:"+msg);
        });
    }
}
