package com.liulin.homework.w2020.w03.w08;


/**
 * Create by DbL on 2020/3/12
 */
public class LoginForDouYinAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForDouYinAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegist(id,null);

    }

}
