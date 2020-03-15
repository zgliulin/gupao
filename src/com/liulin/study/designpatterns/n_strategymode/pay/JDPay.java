package com.liulin.study.designpatterns.n_strategymode.pay;

/**
 * Create by DbL on 2020/3/14
 */
public class JDPay extends Payment {

    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
