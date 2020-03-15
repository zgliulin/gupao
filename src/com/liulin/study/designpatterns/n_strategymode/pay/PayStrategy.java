package com.liulin.study.designpatterns.n_strategymode.pay;

import com.liulin.homework.w2020.w02.w23.payfactory.WeXinIPay;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by DbL on 2020/3/14
 */
public class PayStrategy {
    public static final String ALI_PAY = "ALI_PAY";
    public static final String JD_PAY = "JD_PAY";
    public static final String WX_PAY = "WX_PAY";

    private static Map<String, Payment> stringPaymentMap = new HashMap<String, Payment>();

    static {
        stringPaymentMap.put(ALI_PAY, new AliPay());
        stringPaymentMap.put(JD_PAY, new JDPay());
        stringPaymentMap.put(WX_PAY, new WxPay());

    }

    public static Payment get(String key){
        if(stringPaymentMap.containsKey(key)){
            return stringPaymentMap.get(key);
        }
        return null;
    }
}
