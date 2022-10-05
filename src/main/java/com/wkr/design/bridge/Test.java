package com.wkr.design.bridge;

import java.util.Arrays;

/**
 * @author wkr
 * @Description: 桥接模式测试代码
 * @date 2022/9/619:46
 */
public class Test {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender(Arrays.asList("123@hc.com","456@hc.com"));
        SmsSender smsSender = new SmsSender(Arrays.asList("123456","789456"));
        NormalNotification normalNotification = new NormalNotification(emailSender);
        SevereNotification severeNotification = new SevereNotification(smsSender);
        normalNotification.notify("hello tom");
        severeNotification.notify("attention jerry");
    }

}
