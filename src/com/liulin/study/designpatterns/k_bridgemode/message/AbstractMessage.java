package com.liulin.study.designpatterns.k_bridgemode.message;

/**
 * Create by DbL on 2020/3/11
 */
public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    public void send(String message, String toUser) {
        this.message.send(message,toUser);
    }
}
