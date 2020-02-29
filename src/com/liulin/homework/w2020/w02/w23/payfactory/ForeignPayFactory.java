package com.liulin.homework.w2020.w02.w23.payfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class ForeignPayFactory extends AbstractPayFctory {
    public IPay create(String  payName){
        IPay pay = null;
        switch (payName){
            case "apppay":
                pay =  new AppPay();
                break;
        }
        return pay;
    }
}
