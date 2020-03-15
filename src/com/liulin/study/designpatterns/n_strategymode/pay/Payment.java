package com.liulin.study.designpatterns.n_strategymode.pay;


/**
 * Create by DbL on 2020/3/14
 */
public abstract  class Payment {
    public abstract String getName();
    public  MsgResult pay(String uid,double amount){
        // 余额是否足够
        if(queryBalance(uid)<amount){
            return new MsgResult(1,"支付失败","余额不足");
        }
        return new MsgResult(2,"支付成功","支付金额"+amount);
    }

    protected abstract double queryBalance(String uid);
}
