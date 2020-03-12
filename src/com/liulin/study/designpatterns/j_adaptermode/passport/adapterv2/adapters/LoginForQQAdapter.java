package com.liulin.study.designpatterns.j_adaptermode.passport.adapterv2.adapters;


import com.liulin.study.designpatterns.j_adaptermode.passport.ResultMsg;

/**
 * Create by DbL on 2020/3/12
 */
public class LoginForQQAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegist(id,null);

    }

}
