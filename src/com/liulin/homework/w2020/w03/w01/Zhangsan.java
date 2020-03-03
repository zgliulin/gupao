package com.liulin.homework.w2020.w03.w01;

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
