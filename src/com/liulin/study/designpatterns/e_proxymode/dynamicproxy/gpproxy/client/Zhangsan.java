package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.gpproxy.client;

/**
 * Create by DbL on 2020/3/1
 */
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    @Override
    public void buyInsure(double price) {
        System.out.println("张三要购买"+price+"的产品");
    }

}
