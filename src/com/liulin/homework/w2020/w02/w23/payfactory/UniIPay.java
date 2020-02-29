package com.liulin.homework.w2020.w02.w23.payfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class UniIPay implements IPay {
    @Override
    public void pay() {
        System.out.println("正在使用银联支付");
    }
}
