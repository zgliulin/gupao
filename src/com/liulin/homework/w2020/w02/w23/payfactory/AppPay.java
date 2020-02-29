package com.liulin.homework.w2020.w02.w23.payfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class AppPay implements IPay {
    @Override
    public void pay() {
        System.out.println("正在使用苹果支付");
    }
}
