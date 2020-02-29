package com.liulin.homework.w2020.w02.w23.payfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class InternalPayFactory extends AbstractPayFctory {
    public IPay create(String  payName){
        IPay pay = null;
        switch (payName){
            case "alipay":
                pay =  new ALiIPay();
                break;
            case "wexinpay":
                pay =  new WeXinIPay();
                break;
            case "unipay":
                pay =  new UniIPay();
                break;
        }
        return pay;
    }
}
