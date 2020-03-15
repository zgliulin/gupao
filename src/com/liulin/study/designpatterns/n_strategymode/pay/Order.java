package com.liulin.study.designpatterns.n_strategymode.pay;

import java.lang.reflect.AccessibleObject;

/**
 * Create by DbL on 2020/3/14
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public  MsgResult pay(){
        return pay("");
    }
    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName());
        return payment.pay(uid, amount);
    }
}
