package com.liulin.study.designpatterns.k_bridgemode.message;

/**
 * Create by DbL on 2020/3/11
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    public void send(String message, String toUser) {
        message = "【加急】" + message;
        super.send(message, toUser);
    }

}
