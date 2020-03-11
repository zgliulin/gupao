package com.liulin.study.designpatterns.k_bridgemode.message;

/**
 * Create by DbL on 2020/3/11
 */
public interface IMessage {
    // 发送消息的内容和接收人
    void send(String message,String toUser );
}
