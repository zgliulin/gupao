package com.liulin.study.designpatterns.n_strategymode.pay;

/**
 * Create by DbL on 2020/3/14
 */
public class AliPay extends Payment {

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
