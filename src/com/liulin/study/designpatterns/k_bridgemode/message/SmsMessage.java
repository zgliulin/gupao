package com.liulin.study.designpatterns.k_bridgemode.message;

/**
 * Create by DbL on 2020/3/11
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送"+message +"给"+toUser);
    }
}
