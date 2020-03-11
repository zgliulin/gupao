package com.liulin.study.designpatterns.k_bridgemode.message;

/**
 * Create by DbL on 2020/3/11
 */
public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.send("加班申请","柳总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.send("加班申请","柳总");

    }
}
