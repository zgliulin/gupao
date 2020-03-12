package com.liulin.homework.w2020.w03.w08;

/**
 * Create by DbL on 2020/3/12
 */
public class OtherLoginAdatperDecorator extends PassportForThirdAdapter{
    private PassportForThirdAdapter passportForThirdAdapter;

    public OtherLoginAdatperDecorator(PassportForThirdAdapter passportForThirdAdapter) {
        this.passportForThirdAdapter = passportForThirdAdapter;
    }

    public ResultMsg loginDouyin(String openId) {
        return this.passportForThirdAdapter.processLogin(openId,LoginForDouYinAdapter.class);
    }
}
