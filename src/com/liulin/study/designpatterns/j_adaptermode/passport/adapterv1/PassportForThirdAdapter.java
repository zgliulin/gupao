package com.liulin.study.designpatterns.j_adaptermode.passport.adapterv1;


import com.liulin.study.designpatterns.j_adaptermode.passport.PassportService;
import com.liulin.study.designpatterns.j_adaptermode.passport.ResultMsg;

/**
 * Create by DbL on 2020/3/12
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone,null);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
