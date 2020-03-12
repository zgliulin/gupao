package com.liulin.study.designpatterns.j_adaptermode.passport.adapterv1;


import com.liulin.study.designpatterns.j_adaptermode.passport.ResultMsg;

/**
 * Create by DbL on 2020/3/12
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
