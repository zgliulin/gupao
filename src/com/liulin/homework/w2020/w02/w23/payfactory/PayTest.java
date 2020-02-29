package com.liulin.homework.w2020.w02.w23.payfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class PayTest {
    public static void main(String[] args) {
        InternalPayFactory internalPayFactory = new InternalPayFactory();
        internalPayFactory.create("wexinpay").pay();
        ForeignPayFactory foreignPayFactory = new ForeignPayFactory();
        foreignPayFactory.create("apppay").pay();
    }
}
