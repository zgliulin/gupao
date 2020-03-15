package com.liulin.study.designpatterns.n_strategymode.pay;

/**
 * Create by DbL on 2020/3/14
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","20200314",6542.2);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
