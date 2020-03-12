package com.liulin.homework.w2020.w03.w08;


/**
 * Create by DbL on 2020/3/12
 */
public class LoginForTelAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
